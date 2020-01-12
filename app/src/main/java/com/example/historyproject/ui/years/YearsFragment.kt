package com.example.historyproject.ui.years

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.historyproject.R
import com.example.historyproject.entity.YearModel
import com.example.historyproject.presentation.years.YearsPresenter
import com.example.historyproject.presentation.years.YearsRVAdapter
import com.example.historyproject.presentation.years.YearsView
import com.example.historyproject.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_years.*

class YearsFragment : BaseFragment(), YearsView {
    @InjectPresenter
    lateinit var presenter: YearsPresenter

    lateinit var rvAdapter: YearsRVAdapter

    override val layoutRes: Int
        get() = R.layout.fragment_years

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
        searchListener()
    }

    private fun initView() {
        rvAdapter = YearsRVAdapter()
        rv_years_items.adapter = rvAdapter
    }

    private fun searchListener() {
        sv_years.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(s: String): Boolean {
                presenter.getAllYears(s)
                return false
            }
        })
    }

    override fun updateYears(list: List<YearModel>) {
        rvAdapter.setList(list)
    }
}