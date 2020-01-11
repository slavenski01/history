package com.example.historyproject

import androidx.multidex.MultiDexApplication
import com.example.historyproject.di.components.AppComponent
import com.example.historyproject.di.components.DaggerAppComponent
import com.example.historyproject.di.components.MainSubcomponent
import com.example.historyproject.di.components.PeopleSubcomponent
import com.example.historyproject.di.modules.MainModule
import com.example.historyproject.di.modules.PeopleModule

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
    }
}