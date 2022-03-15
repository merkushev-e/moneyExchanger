package ru.gb.moneyexchange.data.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(ExchangeDataEntity::class), version = 1, exportSchema = false)
abstract class DataBase: RoomDatabase() {
    abstract fun dbDao(): DbDao
}