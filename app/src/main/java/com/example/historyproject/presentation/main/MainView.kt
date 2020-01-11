package com.example.historyproject.presentation.main

import com.example.historyproject.entity.People
import com.example.historyproject.presentation.base.BaseView

interface MainView : BaseView {
    fun updatePeoples(peoples: List<People>)
}