package com.example.historyproject.presentation.terms

import com.arellomobile.mvp.InjectViewState
import com.example.historyproject.App
import com.example.historyproject.model.interactors.TermInteractor
import com.example.historyproject.presentation.base.BasePresenter
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class TermsPresenter : BasePresenter<TermsView>() {
    @Inject
    lateinit var interactor: TermInteractor

    @Inject
    lateinit var router: Router

    init {
        App.addTermsSubcomponent().inject(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        App.removeTermsSubcomponent()
    }

    override fun onFirstViewAttach() {
        getAllTerms()
    }

    fun getAllTerms(sortWord: String? = null) {
        viewState.updateTerms(interactor.getTermsList().filter {
            it.name?.startsWith(sortWord ?: "", ignoreCase = true) ?: false
        })
    }
}