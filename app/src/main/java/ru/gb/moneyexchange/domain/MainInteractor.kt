package ru.gb.moneyexchange.domain


import ru.gb.moneyexchange.convertExchangeDataDTOToExchangeData
import ru.gb.moneyexchange.data.repositories.Repository
import ru.gb.moneyexchange.data.retrofit.model.ExchangeDataDTO
import ru.gb.moneyexchange.data.retrofit.model.MoneyItem
import ru.gb.moneyexchange.domain.model.ExchangeData

class MainInteractor(
    private val repository: Repository<ExchangeData>,
    ) : Interactor<AppState> {
    override suspend fun getData(fromRemoteSource: Boolean): AppState {
        val appState: AppState

            appState = AppState.Success(repository.getData(fromRemoteSource))
            repository.saveData(appState)
        return appState
    }
}