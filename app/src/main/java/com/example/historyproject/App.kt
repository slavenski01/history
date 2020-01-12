package com.example.historyproject

import androidx.multidex.MultiDexApplication
import com.example.historyproject.di.components.*
import com.example.historyproject.di.modules.MainModule
import com.example.historyproject.di.modules.PeopleModule
import com.example.historyproject.di.modules.TermsModule

class App : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .context(applicationContext)
            .build()
    }

    companion object {
        lateinit var appComponent: AppComponent

        private var mainSubcomponent: MainSubcomponent? = null
        private var peopleSubcomponent: PeopleSubcomponent? = null
        private var termSubcomponent: TermsSubcomponent? = null

        fun removeMainSubcomponent() {
            mainSubcomponent = null
        }

        fun addMainSubcomponent(): MainSubcomponent {
            if (mainSubcomponent == null) mainSubcomponent = appComponent.addMainSubcomponent(
                MainModule()
            )
            return mainSubcomponent!!
        }

        fun removePeopleSubcomponent() {
            peopleSubcomponent = null
        }

        fun addPeopleSubcomponent(): PeopleSubcomponent {
            if (peopleSubcomponent == null) peopleSubcomponent = appComponent.addPeopleSubcomponent(
                PeopleModule()
            )
            return peopleSubcomponent!!
        }

        fun removeTermsSubcomponent() {
            termSubcomponent = null
        }

        fun addTermsSubcomponent(): TermsSubcomponent {
            if (termSubcomponent == null) termSubcomponent = appComponent.addTermsSubcomponent(
                TermsModule()
            )
            return termSubcomponent!!
        }
    }
}