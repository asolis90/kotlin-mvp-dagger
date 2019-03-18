package com.asolis.kotlinmvpdagger.ui.main

import android.os.Bundle
import com.asolis.kotlinmvpdagger.R
import com.asolis.kotlinmvpdagger.dagger.components.AppComponent
import com.asolis.kotlinmvpdagger.ui.base.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity<MainPresenter, MainView>(), MainView {

    @Inject
    lateinit var mPresenter: MainPresenter

    override fun getPresenter(): MainPresenter {
        return mPresenter
    }

    override fun injectSelf(applicationComponent: AppComponent) {
        applicationComponent.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
    }


}
