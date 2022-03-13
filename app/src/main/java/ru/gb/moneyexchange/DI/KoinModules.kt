package ru.gb.moneyexchange.DI

import org.koin.dsl.module
import ru.gb.moneyexchange.data.repositories.RemoteRepositoryImpl
import ru.gb.moneyexchange.data.repositories.Repository
import ru.gb.moneyexchange.data.retrofit.RemoteDataSourceImpl
import ru.gb.moneyexchange.data.retrofit.model.ExchangeDataDTO
import ru.gb.moneyexchange.domain.MainInteractor
import ru.gb.moneyexchange.presentation.viewmodel.MainViewModel

val application = module {
    single<Repository<ExchangeDataDTO>> {RemoteRepositoryImpl(RemoteDataSourceImpl())}
}

val mainScreen = module {
    factory { MainInteractor(get()) }
    factory { MainViewModel(get()) }
}


