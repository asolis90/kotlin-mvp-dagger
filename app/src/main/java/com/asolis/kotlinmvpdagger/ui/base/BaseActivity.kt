package com.asolis.kotlinmvpdagger.ui.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.asolis.kotlinmvpdagger.application.MVPDaggerApplication
import com.asolis.kotlinmvpdagger.dagger.components.AppComponent

abstract class BaseActivity<Presenter : BasePresenter<View>, View : BaseView> : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectSelf(MVPDaggerApplication.getApplicationComponent())
        getPresenter().setView(this as View)
    }

    abstract fun injectSelf(applicationComponent: AppComponent)


    abstract fun getPresenter(): Presenter


    override fun onDestroy() {
        super.onDestroy()
        getPresenter().setView(null)
    }

}