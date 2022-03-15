package ru.gb.moneyexchange.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import ru.gb.moneyexchange.data.retrofit.model.MoneyItem

@Parcelize
data class ExchangeData(
val Date: String,
val valute: List<MoneyItem>
) : Parcelable


