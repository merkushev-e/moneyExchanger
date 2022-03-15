package ru.gb.moneyexchange.data.room

import ru.gb.moneyexchange.data.DataSource

interface DataSourceLocal<T>: DataSource<T> {
    suspend fun saveToDb(dataList: List<ExchangeDataEntity>)
}