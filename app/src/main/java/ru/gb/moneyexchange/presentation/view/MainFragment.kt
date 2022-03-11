package ru.gb.moneyexchange.presentation.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat.recreate
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.gb.moneyexchange.R
import ru.gb.moneyexchange.presentation.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import ru.gb.moneyexchange.databinding.FragmentMainBinding
import ru.gb.moneyexchange.domain.AppState
import ru.gb.moneyexchange.presentation.OnlineLiveData
import ru.gb.moneyexchange.presentation.viewmodel.MainAdapter

class MainFragment : Fragment() {

    private val viewModel: MainViewModel by viewModel()

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!


    private val adapter: MainAdapter by lazy {
        MainAdapter()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        _binding = FragmentMainBinding.bind(view)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            mainActivityRecyclerview.adapter = adapter
            mainActivityRecyclerview.layoutManager =
                LinearLayoutManager(context, RecyclerView.VERTICAL, false)
            swipeRefreshLayout.setOnRefreshListener {
                startLoadingOrShowError()
            }
        }

        getData()
    }

    fun getData() {
        viewModel.getData(true)
        viewModel.liveData.observe(viewLifecycleOwner) { appstate ->
            renderData(appstate)
        }
    }

    fun renderData(appState: AppState) {
        when (appState) {
            is AppState.Success -> {
                val data = appState.data
                if (data == null || data.valute.isEmpty()) {

                    showErrorScreen(getString(R.string.empty_server_response_on_success))
                } else {
                    stopRefreshAnimationIfNeeded()
                    showViewSuccess()
                    adapter.setData(data.valute)
                }
            }

            is AppState.Loading -> {
                stopRefreshAnimationIfNeeded()
                showViewLoading()
            }

            is AppState.Error -> {
                stopRefreshAnimationIfNeeded()
                showErrorScreen(appState.error.message)
            }
        }

    }


    private fun showErrorScreen(error: String?) {
        showViewError()
        binding.errorTextview.text =
            error ?: getString(R.string.undefined_error)
        binding.reloadButton.setOnClickListener {
            viewModel.getData(true)
            viewModel.liveData.observe(viewLifecycleOwner) { appState ->
                renderData(appState)
            }
        }
    }

    private fun showViewSuccess() {
        binding.successLinearLayout.visibility = View.VISIBLE
        binding.loadingFrameLayout.visibility = View.GONE
        binding.errorLinearLayout.visibility = View.GONE
    }


    private fun showViewLoading() {
        binding.successLinearLayout.visibility = View.GONE
        binding.loadingFrameLayout.visibility = View.VISIBLE
        binding.errorLinearLayout.visibility = View.GONE
    }

    private fun showViewError() {
        binding.successLinearLayout.visibility = View.GONE
        binding.loadingFrameLayout.visibility = View.GONE
        binding.errorLinearLayout.visibility = View.VISIBLE
    }


    private fun startLoadingOrShowError() {
        OnlineLiveData(requireContext()).observe(
            viewLifecycleOwner,
            Observer<Boolean> {
                if (it) {
//                    recreate(requireActivity())
                    getData()
                } else {
                    Toast.makeText(requireContext(), "Check Network Settings", Toast.LENGTH_SHORT)
                        .show()
                    stopRefreshAnimationIfNeeded()
                }
            })
    }

    private fun stopRefreshAnimationIfNeeded() {
        if (binding.swipeRefreshLayout.isRefreshing) {
            binding.swipeRefreshLayout.isRefreshing = false
        }
    }


    companion object {
        fun newInstance() = MainFragment()
    }
}