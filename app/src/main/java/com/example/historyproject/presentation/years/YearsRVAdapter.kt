package com.example.historyproject.presentation.years

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.historyproject.R
import com.example.historyproject.entity.YearModel
import com.example.historyproject.presentation.base.BaseRVAdapter
import kotlinx.android.synthetic.main.item_year.view.*

class YearsRVAdapter : BaseRVAdapter<RecyclerView.ViewHolder>() {

    private val yearsList = arrayListOf<YearModel>()

    fun setList(list: List<YearModel>) {
        yearsList.clear()
        yearsList.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return YearViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_year,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = yearsList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as YearViewHolder).bind(yearsList[position])
    }

    private inner class YearViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: YearModel) {
            itemView.tv_years_number.text = item.years
            itemView.tv_years_description.text = item.description
        }
    }
}