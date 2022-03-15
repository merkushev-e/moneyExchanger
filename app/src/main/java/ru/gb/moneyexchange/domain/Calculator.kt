package ru.gb.moneyexchange.domain

import ru.gb.moneyexchange.data.retrofit.model.MoneyItem
import ru.gb.moneyexchange.domain.model.ExchangeData

class Calculator {



    fun calculate(nominal: Double, currencyValue: Double, amountOfMoney: Double): String{
        val result = amountOfMoney * (currencyValue/nominal)

        return result.toString()
    }
}