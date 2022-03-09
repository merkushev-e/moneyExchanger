package ru.gb.moneyexchange.data.retrofit

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.gb.moneyexchange.data.DataSource
import ru.gb.moneyexchange.data.retrofit.model.ExchangeDataDTO

class RemoteDataSourceImpl: DataSource<ExchangeDataDTO> {
    override suspend fun getData(): ExchangeDataDTO {
        return getService(BaseInterceptor.interceptor).getDataFromServerAsync(BASE_URL_QUERY).await()
    }


    private fun getService(interceptor: Interceptor): ExchangeRateApi {
        return createRetrofit(interceptor).create(ExchangeRateApi::class.java)
    }

    private fun createRetrofit(interceptor: Interceptor): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL_LOCATIONS)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .client(createOkHttpClient(interceptor))
            .build()
    }

    private fun createOkHttpClient(interceptor: Interceptor): OkHttpClient {
        val httpClient = OkHttpClient.Builder()
        httpClient.addInterceptor(interceptor)
        httpClient.addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
        return httpClient.build()
    }

    companion object {
        private const val BASE_URL_LOCATIONS = "https://www.cbr-xml-daily.ru/"
        private const val BASE_URL_QUERY = "daily_json.js"
    }

}