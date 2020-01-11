package com.example.historyproject.presentation.main

import com.arellomobile.mvp.InjectViewState
import com.example.historyproject.App
import com.example.historyproject.Screens
import com.example.historyproject.entity.People
import com.example.historyproject.model.interactors.MainInteractor
import com.example.historyproject.presentation.base.BasePresenter
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class MainPresenter : BasePresenter<MainView>() {

    @Inject
    lateinit var mainInteractor: MainInteractor

    @Inject
    lateinit var router: Router

    init {
        App.addMainSubcomponent().inject(this)
    }

    override fun onFirstViewAttach() {
        getPeoples()
    }

    override fun onDestroy() {
        super.onDestroy()
        App.removeMainSubcomponent()
    }

    fun openPeople(position: Int) {
        router.navigateTo(Screens.PeopleScreen(mainInteractor.getPeoples()[position]))
    }

    private fun getPeoples() {
        viewState.updatePeoples(mainInteractor.getPeoples())
    }
}