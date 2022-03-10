package ru.gb.moneyexchange.data.retrofit.model

data class ExchangeDataDTO(
    val Date: String,
    val PreviousDate: String,
    val PreviousURL: String,
    val Timestamp: String,
    val Valute: Valute
)

data class Valute(
    val AMD: MoneyItem,
    val AUD: MoneyItem,
    val AZN: MoneyItem,
    val BGN: MoneyItem,
    val BRL: MoneyItem,
    val BYN: MoneyItem,
    val CAD: MoneyItem,
    val CHF: MoneyItem,
    val CNY: MoneyItem,
    val CZK: MoneyItem,
    val DKK: MoneyItem,
    val EUR: MoneyItem,
    val GBP: MoneyItem,
    val HKD: MoneyItem,
    val HUF: MoneyItem,
    val INR: MoneyItem,
    val JPY: MoneyItem,
    val KGS: MoneyItem,
    val KRW: MoneyItem,
    val KZT: MoneyItem,
    val MDL: MoneyItem,
    val NOK: MoneyItem,
    val PLN: MoneyItem,
    val RON: MoneyItem,
    val SEK: MoneyItem,
    val SGD: MoneyItem,
    val TJS: MoneyItem,
    val TMT: MoneyItem,
    val TRY: MoneyItem,
    val UAH: MoneyItem,
    val USD: MoneyItem,
    val UZS: MoneyItem,
    val XDR: MoneyItem,
    val ZAR: MoneyItem
)

data class MoneyItem(
    val CharCode: String,
    val ID: String,
    val Name: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    val Value: Double
)

//data class AUD(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class AZN(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class BGN(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class BRL(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class BYN(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class CAD(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class CHF(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class CNY(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class CZK(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class DKK(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class EUR(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class GBP(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class HKD(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class HUF(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class INR(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class JPY(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class KGS(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class KRW(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class KZT(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class MDL(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class NOK(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class PLN(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class RON(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class SEK(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class SGD(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class TJS(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class TMT(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class TRY(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class UAH(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class USD(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class UZS(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class XDR(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)
//
//data class ZAR(
//    val CharCode: String,
//    val ID: String,
//    val Name: String,
//    val Nominal: Int,
//    val NumCode: String,
//    val Previous: Double,
//    val Value: Double
//)