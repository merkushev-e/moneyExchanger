package ru.gb.moneyexchange.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.*
import ru.gb.moneyexchange.domain.AppState
import ru.gb.moneyexchange.domain.MainInteractor

class MainViewModel(private val interactor: MainInteractor) : ViewModel() {

    private val liveDataToObserve: MutableLiveData<AppState> = MutableLiveData()
    val liveData: LiveData<AppState> = liveDataToObserve

    private val viewModelCoroutineScope = CoroutineScope(
        Dispatchers.Main
                + SupervisorJob()
                + CoroutineExceptionHandler { _, throwable ->
            handleError(throwable)
        })


    fun getData(isOnline: Boolean) {
        liveDataToObserve.value = AppState.Loading(null)
        cancelJob()

        viewModelCoroutineScope.launch {
            withContext(Dispatchers.IO) {
                liveDataToObserve.postValue(interactor.getData(isOnline)) }
        }

    }



    private fun cancelJob() {
        viewModelCoroutineScope.coroutineContext.cancelChildren()
    }


    override fun onCleared() {
        liveDataToObserve.value = AppState.Success(null)
        cancelJob()
    }

    fun handleError(error: Throwable) {
        liveDataToObserve.postValue(AppState.Error(error))
    }

}