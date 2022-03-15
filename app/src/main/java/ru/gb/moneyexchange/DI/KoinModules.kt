package ru.gb.moneyexchange.DI


import androidx.room.Room
import org.koin.dsl.module
import ru.gb.moneyexchange.data.repositories.Repository
import ru.gb.moneyexchange.data.repositories.RepositoryImpl
import ru.gb.moneyexchange.data.retrofit.RemoteDataSourceImpl
import ru.gb.moneyexchange.data.room.DataBase
import ru.gb.moneyexchange.data.room.RoomDataBaseImplementation
import ru.gb.moneyexchange.domain.MainInteractor
import ru.gb.moneyexchange.domain.model.ExchangeData
import ru.gb.moneyexchange.presentation.viewmodel.MainViewModel

val application = module {
    single { Room.databaseBuilder(get(), DataBase::class.java, "CurrencyDB").build() }
    single { get<DataBase>().dbDao() }
    single<Repository<ExchangeData>> { RepositoryImpl(RemoteDataSourceImpl(),RoomDataBaseImplementation(get())) }
}

val mainScreen = module {
    factory { MainInteractor(get()) }
    factory { MainViewModel(get()) }
}


