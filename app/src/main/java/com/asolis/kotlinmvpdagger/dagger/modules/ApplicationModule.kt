package com.asolis.kotlinmvpdagger.dagger.modules

import com.asolis.kotlinmvpdagger.application.MVPDaggerApplication
import com.asolis.kotlinmvpdagger.dagger.scope.ApplicationScope
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: MVPDaggerApplication) {

    @Provides
    @Singleton
    @ApplicationScope
    fun provideApplication(): MVPDaggerApplication = this.application

}