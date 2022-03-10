package ru.gb.moneyexchange.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import ru.gb.moneyexchange.data.retrofit.model.MoneyItem


data class ExchangeData(
val Date: String,
val valute: List<MoneyItem>
)



