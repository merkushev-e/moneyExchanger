package ru.gb.moneyexchange

import ru.gb.moneyexchange.data.retrofit.model.ExchangeDataDTO
import ru.gb.moneyexchange.data.retrofit.model.MoneyItem
import ru.gb.moneyexchange.domain.Countries
import ru.gb.moneyexchange.domain.model.ExchangeData

fun convertExchangeDataDTOToExchangeData(data: ExchangeDataDTO): ExchangeData {

    val list: List<MoneyItem> = listOf(
        data.Valute.AUD,
        data.Valute.AZN,
        data.Valute.GBP,
        data.Valute.AMD,
        data.Valute.BYN,
        data.Valute.BGN,
        data.Valute.BRL,
        data.Valute.HUF,
        data.Valute.HKD,
        data.Valute.DKK,
        data.Valute.USD,
        data.Valute.EUR,
        data.Valute.INR,
        data.Valute.KZT,
        data.Valute.CAD,
        data.Valute.KGS,
        data.Valute.CNY,
        data.Valute.MDL,
        data.Valute.NOK,
        data.Valute.PLN,
        data.Valute.RON,
        data.Valute.XDR,
        data.Valute.SGD,
        data.Valute.TJS,
        data.Valute.TRY,
        data.Valute.TMT,
        data.Valute.UZS,
        data.Valute.UAH,
        data.Valute.CZK,
        data.Valute.SEK,
        data.Valute.CHF,
        data.Valute.ZAR,
        data.Valute.KRW,
        data.Valute.JPY
    )
    return ExchangeData(
        data.Date,
        list
    )
}
