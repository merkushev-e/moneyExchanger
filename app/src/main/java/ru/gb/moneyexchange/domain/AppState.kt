package ru.gb.moneyexchange.domain

import ru.gb.moneyexchange.domain.model.ExchangeData

sealed class AppState{
    data class Success(val data: ExchangeData?) : AppState()
    data class Error(val error: Throwable) : AppState()
    data class Loading(val progress: Int?) : AppState()
}
