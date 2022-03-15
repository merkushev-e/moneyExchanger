package ru.gb.moneyexchange.data.repositories

import ru.gb.moneyexchange.domain.AppState

interface Repository<T> {
    suspend fun getData(isRemote: Boolean) : T
    suspend fun saveData(appState: AppState)



}