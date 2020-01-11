package com.example.historyproject.ui.people

import android.os.Bundle
import android.view.View
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.historyproject.R
import com.example.historyproject.entity.People
import com.example.historyproject.presentation.people.PeoplePresenter
import com.example.historyproject.presentation.people.PeopleView
import com.example.historyproject.ui.base.BaseFragment
import com.example.historyproject.util.argument
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_people.*

class PeopleFragment : BaseFragment(), PeopleView {

    @InjectPresenter
    lateinit var presenter: PeoplePresenter

    private val people by argument(PEOPLE, People("", 0, "", ""))

    override val layoutRes: Int
        get() = R.layout.fragment_people

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
        setListeners()
    }

    override fun onBackPressed() {
        presenter.onBackPressed()
    }

    private fun initView() {
        tv_people_name.text = people.name

        Picasso.get()
            .load(people.avatar ?: R.drawable.eighteen)
            .into(iv_people_avatar)
        tv_people_life.text = people.years
        tv_people_info.text = people.description
    }

    private fun setListeners() {
        btn_people_back.setOnClickListener {
            onBackPressed()
        }
    }

    companion object {
        private const val PEOPLE = "people"

        fun create(people: People) = PeopleFragment().apply {
            arguments = Bundle().apply {
                putParcelable(PEOPLE, people)
            }
        }
    }
}