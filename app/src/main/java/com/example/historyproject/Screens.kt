package com.example.historyproject

import androidx.fragment.app.Fragment
import com.example.historyproject.entity.People
import com.example.historyproject.ui.main.MainFragment
import com.example.historyproject.ui.people.PeopleFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

object Screens {

    object Main : SupportAppScreen() {
        override fun getFragment(): Fragment = MainFragment()
    }

    data class PeopleScreen(val people: People) : SupportAppScreen() {
        override fun getFragment(): Fragment = PeopleFragment.create(people)
    }
}