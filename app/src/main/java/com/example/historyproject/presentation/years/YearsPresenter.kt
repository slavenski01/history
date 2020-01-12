package com.example.historyproject.presentation.years

import com.arellomobile.mvp.InjectViewState
import com.example.historyproject.App
import com.example.historyproject.model.interactors.YearInteractor
import com.example.historyproject.presentation.base.BasePresenter
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class YearsPresenter : BasePresenter<YearsView>() {
    @Inject
    lateinit var interactor: YearInteractor

    @Inject
    lateinit var router: Router

    init {
        App.addYearsSubcomponent().inject(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        App.removeYearsSubcomponent()
    }

    override fun onFirstViewAttach() {
        getAllYears()
    }

    fun getAllYears(sortWord: String? = null) {
        viewState.updateYears(interactor.getAllYears().filter {
            it.years?.startsWith(sortWord ?: "") ?: false
        })
    }
}