package com.asolis.kotlinmvpdagger.dagger.modules

import com.asolis.kotlinmvpdagger.api.ApiWrapper
import com.asolis.kotlinmvpdagger.ui.main.MainPresenter
import com.asolis.kotlinmvpdagger.ui.main.MainPresenterImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UIModule {

    @Singleton
    @Provides
    fun provideMainPresenter(apiWrapper: ApiWrapper): MainPresenter {
        return MainPresenterImpl(apiWrapper)
    }

}