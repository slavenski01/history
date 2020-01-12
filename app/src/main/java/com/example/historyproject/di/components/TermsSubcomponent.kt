package com.example.historyproject.di.components

import com.example.historyproject.di.modules.TermsModule
import com.example.historyproject.di.scopes.TermsScope
import com.example.historyproject.presentation.terms.TermsPresenter
import dagger.Subcomponent

@TermsScope
@Subcomponent(modules = [TermsModule::class])
interface TermsSubcomponent {
    fun inject(termsPresenter: TermsPresenter)
}