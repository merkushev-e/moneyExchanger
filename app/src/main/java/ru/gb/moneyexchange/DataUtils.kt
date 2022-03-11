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

fun getFlag(charCode: String) : Int{
    val hashMap: HashMap<String,Int> = hashMapOf(
        "AMD" to R.drawable.ad,
        "AZN" to R.drawable.az,
        "BGN" to R.drawable.bg,
        "AUD" to R.drawable.au,
        "BYN" to R.drawable.by,
        "CAD" to R.drawable.ca,
        "CHF" to R.drawable.ch,
        "CNY" to R.drawable.cn,
        "CZK" to R.drawable.cz,
        "DKK" to R.drawable.dk,
        "EUR" to R.drawable.eu,
        "GBP" to R.drawable.gb,
        "HKD" to R.drawable.hk,
        "HUF" to R.drawable.hu,
        "INR" to R.drawable.`in`,
        "JPY" to R.drawable.jp,
        "KGS" to R.drawable.kg,
        "KRW" to R.drawable.kr,
        "KZT" to R.drawable.kz,
        "MDL" to R.drawable.md,
        "NOK" to R.drawable.no,
        "PLN" to R.drawable.pl,
        "RON" to R.drawable.ro,
        "SEK" to R.drawable.se,
        "SGD" to R.drawable.sg,
        "TJS" to R.drawable.tj,
        "TMT" to R.drawable.tm,
        "TRY" to R.drawable.tr,
        "UAH" to R.drawable.ua,
        "USD" to R.drawable.us,
        "UZS" to R.drawable.uz,
        "XDR" to R.drawable.eu,
        "ZAR" to R.drawable.za
    )

    return hashMap.getOrDefault(charCode, R.drawable.ic_no_photo_vector)

}