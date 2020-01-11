package com.example.historyproject.ui.main

import android.os.Bundle
import android.view.View
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.historyproject.R
import com.example.historyproject.entity.People
import com.example.historyproject.presentation.base.BaseClickListener
import com.example.historyproject.presentation.main.MainPresenter
import com.example.historyproject.presentation.main.MainRVAdapter
import com.example.historyproject.presentation.main.MainView
import com.example.historyproject.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_peoples.*

class MainFragment : BaseFragment(), MainView, BaseClickListener {
    @InjectPresenter
    lateinit var presenter: MainPresenter

    private lateinit var rvAdapter: MainRVAdapter

    override val layoutRes: Int = R.layout.fragment_peoples

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvAdapter = MainRVAdapter()
        rv_peoples.adapter = rvAdapter
        rvAdapter.listener = this
    }

    override fun onClick(view: View, position: Int) {
        presenter.openPeople(position)
    }

    override fun updatePeoples(peoples: List<People>) {
        rvAdapter.setList(peoples)
    }

    companion object {
        const val TAG = "MainFragment"
    }
}