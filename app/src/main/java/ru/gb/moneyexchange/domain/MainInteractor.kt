package ru.gb.moneyexchange.domain


import ru.gb.moneyexchange.data.repositories.Repository
import ru.gb.moneyexchange.domain.model.ExchangeData

class MainInteractor(

    //mapper needed
    private val remoteRepository: Repository<ExchangeData>
    ) : Interactor<AppState> {
    override suspend fun getData(fromRemoteSource: Boolean): AppState {
        val appState: AppState

        if (fromRemoteSource) {
            appState = AppState.Success(remoteRepository.getData())
        } else {
            //TODO
            appState = AppState.Success(remoteRepository.getData())

        }
        return appState
    }
}