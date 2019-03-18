package com.asolis.kotlinmvpdagger.ui.base

interface BasePresenter<View : BaseView> {
    fun setView(view: View?)

    fun getView(): View
}