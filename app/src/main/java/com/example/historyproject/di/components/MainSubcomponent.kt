package com.example.historyproject.di.components

import com.example.historyproject.di.modules.MainModule
import com.example.historyproject.di.scopes.MainScope
import com.example.historyproject.presentation.main.MainPresenter
import dagger.Subcomponent

@MainScope
@Subcomponent(modules = [MainModule::class])
interface MainSubcomponent {
    fun inject(mainPresenter: MainPresenter)
}