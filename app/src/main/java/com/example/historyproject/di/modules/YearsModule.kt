package com.example.historyproject.di.modules

import com.example.historyproject.di.scopes.YearsScope
import com.example.historyproject.model.interactors.YearInteractor
import dagger.Module
import dagger.Provides

@Module
class YearsModule {

    @Provides
    @YearsScope
    fun provideInteractor(): YearInteractor = YearInteractor()
}