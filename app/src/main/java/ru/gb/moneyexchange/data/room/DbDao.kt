package ru.gb.moneyexchange.data.room

import androidx.room.*

@Dao
interface DbDao {
    @Query("SELECT * FROM ExchangeDataEntity")
    suspend fun all(): List<ExchangeDataEntity>

    @Query("SELECT * FROM ExchangeDataEntity WHERE CharCode LIKE :charCode")
    suspend fun getDataByWord(charCode: String): ExchangeDataEntity

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(entity: ExchangeDataEntity)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAll(entities: List<ExchangeDataEntity>)

    @Update
    suspend fun update(entity: ExchangeDataEntity)

    @Delete
    suspend fun delete(entity: ExchangeDataEntity)
}