package com.example.historyproject.di.components

import android.content.Context
import com.example.historyproject.di.modules.MainModule
import com.example.historyproject.di.modules.NavigationModule
import com.example.historyproject.di.modules.PeopleModule
import com.example.historyproject.di.modules.TermsModule
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

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent
    }
}