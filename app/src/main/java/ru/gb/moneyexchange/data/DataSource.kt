package ru.gb.moneyexchange.data

interface DataSource<T> {
    suspend fun getData(): T
}