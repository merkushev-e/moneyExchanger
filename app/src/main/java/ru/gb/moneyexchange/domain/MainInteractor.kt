package ru.gb.moneyexchange.domain


import ru.gb.moneyexchange.convertExchangeDataDTOToExchangeData
import ru.gb.moneyexchange.data.repositories.Repository
import ru.gb.moneyexchange.data.retrofit.model.ExchangeDataDTO
import ru.gb.moneyexchange.domain.model.ExchangeData

class MainInteractor(

    //mapper needed
    private val remoteRepository: Repository<ExchangeDataDTO>
    ) : Interactor<AppState> {
    override suspend fun getData(fromRemoteSource: Boolean): AppState {
        val appState: AppState

        if (fromRemoteSource) {
            appState = AppState.Success(convertExchangeDataDTOToExchangeData(remoteRepository.getData()))
        } else {
            //TODO
            appState = AppState.Success(convertExchangeDataDTOToExchangeData(remoteRepository.getData()))

        }
        return appState
    }
}