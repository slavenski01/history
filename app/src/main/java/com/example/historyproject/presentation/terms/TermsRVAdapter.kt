package com.example.historyproject.presentation.terms

import android.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.historyproject.R
import com.example.historyproject.entity.Term
import com.example.historyproject.presentation.base.BaseRVAdapter
import kotlinx.android.synthetic.main.item_term.view.*


class TermsRVAdapter : BaseRVAdapter<RecyclerView.ViewHolder>() {

    private val termsList = arrayListOf<Term>()

    fun setList(list: List<Term>) {
        termsList.clear()
        termsList.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return TermsViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_term,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = termsList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as TermsViewHolder).bind(termsList[position])
    }

    private inner class TermsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: Term) {
            itemView.tv_term_name.text = item.name
            itemView.tv_term_name.setOnClickListener {
                val builder: AlertDialog.Builder = AlertDialog.Builder(itemView.context)
                builder.setTitle(item.name)
                    .setMessage(item.description)
                val alert: AlertDialog = builder.create()
                alert.show()
            }
        }
    }
}