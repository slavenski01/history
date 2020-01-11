package com.example.historyproject.di.modules

import com.example.historyproject.di.scopes.MainScope
import com.example.historyproject.model.interactors.MainInteractor
import dagger.Module
import dagger.Provides

@Module
class MainModule {

    @Provides
    @MainScope
    fun provideInteractor(): MainInteractor = MainInteractor()
}