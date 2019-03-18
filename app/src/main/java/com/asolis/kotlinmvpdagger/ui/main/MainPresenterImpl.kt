package com.asolis.kotlinmvpdagger.ui.main

import com.asolis.kotlinmvpdagger.api.CustomDefaultObserver
import com.asolis.kotlinmvpdagger.api.ApiWrapper
import com.asolis.kotlinmvpdagger.models.CurrentWeather
import com.asolis.kotlinmvpdagger.ui.base.BasePresenterImpl
import retrofit2.Response
import javax.inject.Inject

class MainPresenterImpl @Inject constructor(private var apiWrapper: ApiWrapper) : BasePresenterImpl<MainView>(), MainPresenter {
    override fun onViewCreated() {
        apiWrapper.getWeatherByZipcode("", "").subscribe(object : CustomDefaultObserver<CurrentWeather>() {
            override fun onSuccess(t: Response<CurrentWeather>) {
            }

            override fun onErrorRequest(e: Throwable) {
            }

            override fun onNotAuthorized(e: Throwable) {
            }

            override fun onBadGateway(e: Throwable) {
            }

            override fun onBadRequest(e: Throwable) {
            }

            override fun onComplete() {
            }
        })
    }

    override fun onViewRestored() {
    }
}