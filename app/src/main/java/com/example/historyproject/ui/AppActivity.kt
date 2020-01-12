package com.example.historyproject.ui

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import com.example.historyproject.App
import com.example.historyproject.R
import com.example.historyproject.Screens
import com.example.historyproject.util.addSystemTopPadding
import com.mikepenz.materialdrawer.Drawer
import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem
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

        navigator.applyCommands(arrayOf(Replace(Screens.MainScreen)))

        toolbar.apply {
            title = getString(R.string.history_people)
            addSystemTopPadding()
        }

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
            .withOnDrawerItemClickListener(object : Drawer.OnDrawerItemClickListener {
                override fun onItemClick(
                    view: View?,
                    position: Int,
                    drawerItem: IDrawerItem<*>
                ): Boolean {
                    when (position) {
                        0 -> {
                            navigator.applyCommands(arrayOf(Replace(Screens.MainScreen)))
                            toolbar.title = getString(R.string.history_people)
                        }
                        1 -> {
                            navigator.applyCommands(arrayOf(Replace(Screens.TermsScreen)))
                            toolbar.title = getString(R.string.history_terms)
                        }
                    }
                    return false
                }
            })
            .withOnDrawerListener(object : Drawer.OnDrawerListener {
                override fun onDrawerClosed(drawerView: View) {}
                override fun onDrawerOpened(drawerView: View) {
                    val inputMethodManager: InputMethodManager =
                        this@AppActivity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
                    inputMethodManager.hideSoftInputFromWindow(
                        this@AppActivity.currentFocus?.windowToken,
                        0
                    )
                }

                override fun onDrawerSlide(drawerView: View, slideOffset: Float) {}
            })
            .build()
    }
}
