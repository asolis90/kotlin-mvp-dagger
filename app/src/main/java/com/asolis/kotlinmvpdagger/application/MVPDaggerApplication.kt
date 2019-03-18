package com.asolis.kotlinmvpdagger.application

import android.app.Application
import com.asolis.kotlinmvpdagger.dagger.components.AppComponent
import com.asolis.kotlinmvpdagger.dagger.modules.ApplicationModule
import com.asolis.kotlinmvpdagger.dagger.modules.HttpModule
import com.asolis.kotlinmvpdagger.dagger.modules.UIModule

class MVPDaggerApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        createComponent()
    }

    protected fun createComponent() {
        component = DaggerAppComponent.builder()
            .applicationModule(ApplicationModule(this))
            .uIModule(UIModule())
            .httpModule(HttpModule())
            .build()
    }




    companion object {
        private lateinit var component: AppComponent

        fun getApplicationComponent(): AppComponent {
            return component
        }
    }

}