package ru.gb.moneyexchange.presentation.view.calculate

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import ru.gb.moneyexchange.R
import ru.gb.moneyexchange.data.retrofit.model.MoneyItem
import ru.gb.moneyexchange.databinding.CalculateFragmentBinding
import ru.gb.moneyexchange.domain.Calculator
import ru.gb.moneyexchange.domain.Countries
import ru.gb.moneyexchange.domain.model.ExchangeData


class CalculateFragment : BottomSheetDialogFragment(){


    private var _binding:CalculateFragmentBinding? = null
    private val binding get() = _binding!!


    private var listOfValues: List<MoneyItem> = listOf()
    private val calculator = Calculator()
    private var currencyValue = 0.0
    private var currencyNominal = 0
    private var data: ExchangeData? = null
    private var valueSaved = 0.0
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let{
            data = it.getParcelable(CURRENCY_RATE)
            listOfValues = data?.valute!!
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = CalculateFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val items = Countries.listCountries
        val arrayAdapter = ArrayAdapter(requireContext(),R.layout.item_dropdown,items)
        binding.choseCurrencyMenu.setAdapter(arrayAdapter)
        binding.choseCurrencyMenu.setOnItemClickListener { parent, view, position, id ->
            val currency = parent.adapter.getItem(position).toString()
            binding.flagIcon.setImageResource(Countries.getFlag(currency))
            currencyValue = listOfValues[position].Value
            currencyNominal = listOfValues[position].Nominal

            binding.result.text = calculator.calculate(currencyNominal.toDouble(), currencyValue,valueSaved )


        }

        binding.moneyAmount.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(
                s: CharSequence?,
                start: Int,
                count: Int,
                after: Int
            ) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                valueSaved = if (s.toString().isBlank()){
                    DEFAULT_VALUE
                } else{
                    s.toString().toDouble()
                }

                binding.result.text = calculator.calculate(currencyNominal.toDouble(),
                    currencyValue,
                    valueSaved)
            }

            override fun afterTextChanged(s: Editable?) {

            }

        })

    }






    companion object {

        const val CURRENCY_RATE = "Currency Rate"
        private const val DEFAULT_VALUE = 0.0

        fun newInstance(bundle: Bundle) =
            CalculateFragment().apply {
                arguments = bundle
            }
    }
}