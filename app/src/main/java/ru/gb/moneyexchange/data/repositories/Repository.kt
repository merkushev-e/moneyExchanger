package ru.gb.moneyexchange.data.repositories

interface Repository<T> {
    suspend fun getData() : T
}