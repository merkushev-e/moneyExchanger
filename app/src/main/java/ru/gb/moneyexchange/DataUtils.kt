package ru.gb.moneyexchange

import ru.gb.moneyexchange.data.retrofit.model.ExchangeDataDTO
import ru.gb.moneyexchange.data.retrofit.model.MoneyItem
import ru.gb.moneyexchange.domain.model.ExchangeData

fun convertExchangeDataDTOToExchangeData(data: ExchangeDataDTO): ExchangeData {

    val list: List<MoneyItem> = listOf(
        data.Valute.AMD,
        data.Valute.AUD,
        data.Valute.AZN,
        data.Valute.BGN,
        data.Valute.BYN,
        data.Valute.CAD,
        data.Valute.CHF,
        data.Valute.CNY,
        data.Valute.CZK,
        data.Valute.DKK,
        data.Valute.EUR,
        data.Valute.GBP,
        data.Valute.HKD,
        data.Valute.HUF,
        data.Valute.INR,
        data.Valute.JPY,
        data.Valute.KGS,
        data.Valute.KRW,
        data.Valute.KZT,
        data.Valute.MDL,
        data.Valute.NOK,
        data.Valute.PLN,
        data.Valute.RON,
        data.Valute.SEK,
        data.Valute.SGD,
        data.Valute.TJS,
        data.Valute.TMT,
        data.Valute.TRY,
        data.Valute.UAH,
        data.Valute.USD,
        data.Valute.UZS,
        data.Valute.XDR,
        data.Valute.ZAR
    )
    return ExchangeData(
        data.Date,
        list
    )
}