package com.example.historyproject.di.modules

import com.example.historyproject.di.scopes.TermsScope
import com.example.historyproject.model.interactors.TermInteractor
import dagger.Module
import dagger.Provides

@Module
class TermsModule {

    @Provides
    @TermsScope
    fun provideInteractor(): TermInteractor = TermInteractor()
}