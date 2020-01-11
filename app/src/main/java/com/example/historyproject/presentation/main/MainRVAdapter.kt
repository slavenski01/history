package com.example.historyproject.presentation.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.historyproject.R
import com.example.historyproject.entity.People
import com.example.historyproject.presentation.base.BaseRVAdapter
import kotlinx.android.synthetic.main.item_people.view.*

class MainRVAdapter : BaseRVAdapter<RecyclerView.ViewHolder>() {

    private val listPeoples = arrayListOf<People>()

    fun setList(list: List<People>) {
        listPeoples.clear()
        listPeoples.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PeoplesViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_people,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = listPeoples.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PeoplesViewHolder).bind(listPeoples[position])
    }

    private inner class PeoplesViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(item: People) {
            itemView.tv_peoples_name.text = item.name
            itemView.tv_peoples_years.text = item.years

            itemView.setOnClickListener {
                listener?.onClick(itemView, adapterPosition)
            }
        }
    }
}