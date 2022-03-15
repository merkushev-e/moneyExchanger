package ru.gb.moneyexchange.domain

interface Interactor<T> {
    suspend fun getData(fromRemoteSource: Boolean): T
}