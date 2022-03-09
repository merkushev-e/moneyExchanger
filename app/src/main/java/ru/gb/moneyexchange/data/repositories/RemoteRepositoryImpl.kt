package ru.gb.moneyexchange.data.repositories

import ru.gb.moneyexchange.data.DataSource
import ru.gb.moneyexchange.data.retrofit.model.ExchangeDataDTO

class RemoteRepositoryImpl(private val dataSource: DataSource<ExchangeDataDTO>): Repository<ExchangeDataDTO>  {
    override suspend fun getData(): ExchangeDataDTO {
        return dataSource.getData()
    }

}