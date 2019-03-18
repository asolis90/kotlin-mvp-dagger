package com.asolis.kotlinmvpdagger.api

import io.reactivex.observers.DefaultObserver
import retrofit2.HttpException
import retrofit2.Response

abstract class CustomDefaultObserver<T> : DefaultObserver<Response<T>>() {
    override fun onComplete() {
    }

    override fun onNext(t: Response<T>) {
        onSuccess(t)
    }

    override fun onError(e: Throwable) {
        if (e is HttpException) {
            when (e.code()) {
                400 -> onBadRequest(e)
                401 -> onNotAuthorized(e)
                502 -> onBadGateway(e)
                else -> onErrorRequest(e)
            }
        }
    }

    abstract fun onSuccess(t: Response<T>)

    abstract fun onNotAuthorized(e: Throwable)

    abstract fun onBadGateway(e: Throwable)

    abstract fun onBadRequest(e: Throwable)

    abstract fun onErrorRequest(e: Throwable)
}