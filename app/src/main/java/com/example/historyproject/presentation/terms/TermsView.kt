package com.example.historyproject.presentation.terms

import com.example.historyproject.entity.Term
import com.example.historyproject.presentation.base.BaseView

interface TermsView : BaseView {
    fun updateTerms(termsList: List<Term>?)
}