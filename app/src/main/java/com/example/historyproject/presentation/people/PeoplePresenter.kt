package com.example.historyproject.presentation.people

import com.arellomobile.mvp.InjectViewState
import com.example.historyproject.App
import com.example.historyproject.presentation.base.BasePresenter
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class PeoplePresenter : BasePresenter<PeopleView>() {

    @Inject
    lateinit var router: Router

    init {
        App.addPeopleSubcomponent().inject(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        App.removePeopleSubcomponent()
    }

    fun onBackPressed() = router.exit()
}