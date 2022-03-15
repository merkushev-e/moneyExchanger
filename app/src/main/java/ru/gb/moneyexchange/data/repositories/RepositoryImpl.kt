package ru.gb.moneyexchange.data.repositories

import ru.gb.moneyexchange.convertAppStateSuccessToEntity
import ru.gb.moneyexchange.convertExchangeDataDTOToExchangeData
import ru.gb.moneyexchange.data.DataSource
import ru.gb.moneyexchange.data.retrofit.model.ExchangeDataDTO
import ru.gb.moneyexchange.data.room.DataSourceLocal
import ru.gb.moneyexchange.data.room.ExchangeDataEntity
import ru.gb.moneyexchange.domain.AppState
import ru.gb.moneyexchange.domain.model.ExchangeData
import ru.gb.moneyexchange.mapEntityListToMoneyItem

class RepositoryImpl(
    private val remoteDataSource: DataSource<ExchangeDataDTO>,
    private val localDataSource: DataSourceLocal<List<ExchangeDataEntity>>
    ): Repository<ExchangeData> {




    private suspend fun getDataFromRemote(): ExchangeData {
        return convertExchangeDataDTOToExchangeData(remoteDataSource.getData())
    }

    private suspend fun getDataFromLocal(): ExchangeData {
        return mapEntityListToMoneyItem(localDataSource.getData())
    }

    override suspend fun getData(isRemote: Boolean): ExchangeData {
        return if (isRemote){
            getDataFromRemote()
        }else{
            getDataFromLocal()
        }
    }

    override suspend fun saveData(appState: AppState) {
        convertAppStateSuccessToEntity(appState)?.let { localDataSource.saveToDb(it) }
    }
}
