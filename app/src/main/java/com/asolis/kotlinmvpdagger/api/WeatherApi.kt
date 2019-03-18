package com.asolis.kotlinmvpdagger.api

import com.asolis.kotlinmvpdagger.models.CurrentWeather
import io.reactivex.Observable
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WeatherApi {

    @GET("/{version}/weather?zip={zip},{county}&appid={app_id}")
    fun weatherByZipCode(
        @Path("version") version: String,
        @Query("zip") zipcode: String,
        @Query("country") country: String,
        @Query("app_id") appId: String
    ): Observable<Response<CurrentWeather>>

    companion object Factory {
        var BASE_URL: String = "https://api.openweathermap.org/data/"
        var VERSION : String = "2.5"
        var APP_ID: String = ""
    }
}