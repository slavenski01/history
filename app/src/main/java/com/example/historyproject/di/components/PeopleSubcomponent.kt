package com.example.historyproject.di.components

import com.example.historyproject.di.modules.PeopleModule
import com.example.historyproject.di.scopes.PeopleScope
import com.example.historyproject.presentation.people.PeoplePresenter
import dagger.Subcomponent

@PeopleScope
@Subcomponent(modules = [PeopleModule::class])
interface PeopleSubcomponent {
    fun inject(peoplePresenter: PeoplePresenter)
}