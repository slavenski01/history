package com.example.historyproject.presentation.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseRVAdapter<T : RecyclerView.ViewHolder> : RecyclerView.Adapter<T>() {
    var listener: BaseClickListener? = null
}

interface BaseClickListener {
    fun onClick(view: View, position: Int)
}