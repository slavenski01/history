package com.example.historyproject.presentation.years

import com.example.historyproject.entity.YearModel
import com.example.historyproject.presentation.base.BaseView

interface YearsView : BaseView {
    fun updateYears(list: List<YearModel>)
}