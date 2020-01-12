package com.example.historyproject.di.components

import android.content.Context
import com.example.historyproject.di.modules.*
import com.example.historyproject.ui.AppActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NavigationModule::class])
interface AppComponent {

    val context: Context

    fun inject(appActivity: AppActivity)

    fun addMainSubcomponent(mainModule: MainModule): MainSubcomponent
    fun addPeopleSubcomponent(peopleModule: PeopleModule): PeopleSubcomponent
    fun addTermsSubcomponent(termsModule: TermsModule): TermsSubcomponent
    fun addYearsSubcomponent(yearsModule: YearsModule): YearsSubcomponent

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent
    }
}