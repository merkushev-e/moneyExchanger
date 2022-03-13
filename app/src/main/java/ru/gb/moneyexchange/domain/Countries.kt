package ru.gb.moneyexchange.domain

import ru.gb.moneyexchange.R


object Countries {
    val listCountries = listOf<String>(
        "AUD",
        "AZN",
        "GBP",
        "AMD",
        "BYN",
        "BGN",
        "BRL",
        "HUF",
        "HKD",
        "DKK",
        "USD",
        "EUR",
        "INR",
        "KZT",
        "CAD",
        "KGS",
        "CNY",
        "MDL",
        "NOK",
        "PLN",
        "RON",
        "XDR",
        "SGD",
        "TJS",
        "TRY",
        "TMT",
        "UZS",
        "UAH",
        "CZK",
        "SEK",
        "CHF",
        "ZAR",
        "KRW",
        "JPY"  )

    val hashMap: HashMap<String, Int> = hashMapOf(
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

    fun getFlag(charCode: String): Int {
        return Countries.hashMap.getOrDefault(charCode, R.drawable.ic_no_photo_vector)

    }
}