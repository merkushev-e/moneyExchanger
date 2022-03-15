package ru.gb.moneyexchange.data.room


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ExchangeDataEntity (
    @PrimaryKey
    var CharCode: String,
    var nominal: Int,
    var name: String,
    var value: Double
    )

