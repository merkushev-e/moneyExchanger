package ru.gb.moneyexchange.data.room


import ru.gb.moneyexchange.data.DataSource




class RoomDataBaseImplementation(private val dbDao: DbDao) : DataSourceLocal<List<ExchangeDataEntity>> {
    override suspend fun getData(): List<ExchangeDataEntity>{
        return dbDao.all()
    }


    override suspend fun saveToDb(dataList: List<ExchangeDataEntity>) {
        dbDao.insertAll(dataList)
    }

}