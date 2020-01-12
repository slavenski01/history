package com.example.historyproject.ui.terms

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.historyproject.R
import com.example.historyproject.entity.Term
import com.example.historyproject.presentation.terms.TermsPresenter
import com.example.historyproject.presentation.terms.TermsRVAdapter
import com.example.historyproject.presentation.terms.TermsView
import com.example.historyproject.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_terms.*

class TermsFragment : BaseFragment(), TermsView {
    @InjectPresenter
    lateinit var presenter: TermsPresenter

    lateinit var rvAdapter: TermsRVAdapter

    override val layoutRes: Int
        get() = R.layout.fragment_terms

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
        searchListener()
    }

    private fun initView() {
        rvAdapter = TermsRVAdapter()
        rv_terms.adapter = rvAdapter
    }

    private fun searchListener() {
        sv_terms_search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(s: String): Boolean {
                presenter.getAllTerms(s)
                return false
            }
        })
    }

    override fun updateTerms(termsList: List<Term>?) {
        termsList?.let { rvAdapter.setList(it) }
    }
}