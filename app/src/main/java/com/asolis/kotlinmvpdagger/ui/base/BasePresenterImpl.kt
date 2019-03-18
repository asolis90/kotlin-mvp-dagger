package com.asolis.kotlinmvpdagger.ui.base

import java.lang.ref.WeakReference

open class BasePresenterImpl<View : BaseView> : BasePresenter<View> {
    private lateinit var weakReference : WeakReference<View>
    override fun setView(view: View?) {
        if(view != null) {
            weakReference = WeakReference(view)
        }
    }

    override fun getView(): View {
        return weakReference.get()!!
    }
}