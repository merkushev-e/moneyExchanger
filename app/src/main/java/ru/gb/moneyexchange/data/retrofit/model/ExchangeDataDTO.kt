package ru.gb.moneyexchange.data.retrofit.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

data class ExchangeDataDTO(
    val Date: String,
    val PreviousDate: String,
    val PreviousURL: String,
    val Timestamp: String,
    val Valute: Valute
)

data class Valute(
    val AUD: MoneyItem,
    val AZN: MoneyItem,
    val GBP: MoneyItem,
    val AMD: MoneyItem,
    val BYN: MoneyItem,
    val BGN: MoneyItem,
    val BRL: MoneyItem,
    val HUF: MoneyItem,
    val HKD: MoneyItem,
    val DKK: MoneyItem,
    val USD: MoneyItem,
    val EUR: MoneyItem,
    val INR: MoneyItem,
    val KZT: MoneyItem,
    val CAD: MoneyItem,
    val KGS: MoneyItem,
    val CNY: MoneyItem,
    val MDL: MoneyItem,
    val NOK: MoneyItem,
    val PLN: MoneyItem,
    val RON: MoneyItem,
    val XDR: MoneyItem,
    val SGD: MoneyItem,
    val TJS: MoneyItem,
    val TRY: MoneyItem,
    val TMT: MoneyItem,
    val UZS: MoneyItem,
    val UAH: MoneyItem,
    val CZK: MoneyItem,
    val SEK: MoneyItem,
    val CHF: MoneyItem,
    val ZAR: MoneyItem,
    val KRW: MoneyItem,
    val JPY: MoneyItem
)

@Parcelize
data class MoneyItem(
    val CharCode: String,
    val Nominal: Int,
    val Name: String,
    val Value: Double,
) : Parcelable
