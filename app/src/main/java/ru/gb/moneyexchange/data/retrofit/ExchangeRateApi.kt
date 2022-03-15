package ru.gb.moneyexchange.data.retrofit

import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import ru.gb.moneyexchange.data.retrofit.model.ExchangeDataDTO

interface ExchangeRateApi {
    @GET("{query}")
    fun getDataFromServerAsync(
        @Path("query") query: String
    ): Deferred<ExchangeDataDTO>

}