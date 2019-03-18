package com.asolis.kotlinmvpdagger.dagger.components

import com.asolis.kotlinmvpdagger.dagger.modules.ApplicationModule
import com.asolis.kotlinmvpdagger.dagger.modules.HttpModule
import com.asolis.kotlinmvpdagger.dagger.modules.UIModule
import com.asolis.kotlinmvpdagger.ui.main.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [HttpModule::class,
    UIModule::class,
    ApplicationModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}