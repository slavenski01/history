package com.example.historyproject.presentation.base

import com.arellomobile.mvp.MvpPresenter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlin.coroutines.CoroutineContext

open class BasePresenter<V : BaseView> : MvpPresenter<V>(), CoroutineScope {

    private val parentJob = SupervisorJob()

    override val coroutineContext: CoroutineContext = Dispatchers.Main

    override fun onDestroy() {
        parentJob.cancel()
    }
}