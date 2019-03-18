package com.asolis.kotlinmvpdagger.ui.main

import com.asolis.kotlinmvpdagger.ui.base.BasePresenter

interface MainPresenter : BasePresenter<MainView> {
    fun onViewCreated()
    fun onViewRestored()
}
