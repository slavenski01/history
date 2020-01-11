package com.example.historyproject.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.historyproject.App
import com.example.historyproject.R
import com.example.historyproject.Screens
import com.example.historyproject.util.addSystemTopPadding
import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem
import kotlinx.android.synthetic.main.activity_main.*
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.android.support.SupportAppNavigator
import ru.terrakok.cicerone.commands.Command
import ru.terrakok.cicerone.commands.Replace
import javax.inject.Inject

class AppActivity : AppCompatActivity() {

    @Inject
    lateinit var navigatorHolder: NavigatorHolder

    private val navigator = object : SupportAppNavigator(this, R.id.main_container) {
        override fun applyCommands(commands: Array<out Command>?) {
            super.applyCommands(commands)
            supportFragmentManager.executePendingTransactions()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        App.appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigator.applyCommands(arrayOf(Replace(Screens.Main)))

        toolbar.addSystemTopPadding()

        initDrawer()
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        navigatorHolder.removeNavigator()
        super.onPause()
    }

    //Инициализируем боковое меню
    private fun initDrawer() {
        DrawerBuilder()
            .withActivity(this)
            .withToolbar(toolbar)
            .addDrawerItems(
                PrimaryDrawerItem().withName(R.string.history_people),
                PrimaryDrawerItem().withName(R.string.history_terms),
                PrimaryDrawerItem().withName(R.string.history_years)
            )
            .build()
    }
}
