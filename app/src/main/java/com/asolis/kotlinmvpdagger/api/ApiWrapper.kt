package com.asolis.kotlinmvpdagger.api

import com.asolis.kotlinmvpdagger.models.CurrentWeather
import io.reactivex.Observable
import io.reactivex.ObservableTransformer
import io.reactivex.android.schedulers.AndroidSchedulers.*
import io.reactivex.schedulers.Schedulers
import retrofit2.Response

class ApiWrapper constructor(private var api: WeatherApi) {

    open fun getWeatherByZipcode(zipCode : String, country : String): Observable<Response<CurrentWeather>> {
        return api.weatherByZipCode(WeatherApi.VERSION, zipCode, country, WeatherApi.APP_ID)
            .compose(getDefaultTransformer())
    }

    private fun <T> getDefaultTransformer(): ObservableTransformer<T, T> {
        return ObservableTransformer {
            it.subscribeOn(Schedulers.io())
                .observeOn(mainThread())
        }
    }
}
