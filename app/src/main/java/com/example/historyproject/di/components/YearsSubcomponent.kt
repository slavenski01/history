package com.example.historyproject.di.components

import com.example.historyproject.di.modules.YearsModule
import com.example.historyproject.di.scopes.YearsScope
import com.example.historyproject.presentation.years.YearsPresenter
import dagger.Subcomponent

@YearsScope
@Subcomponent(modules = [YearsModule::class])
interface YearsSubcomponent {
    fun inject(yearsPresenter: YearsPresenter)
}