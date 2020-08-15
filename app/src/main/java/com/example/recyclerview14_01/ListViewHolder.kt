package com.example.recyclerview14_01

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*
import java.util.*

class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var tvTitle : TextView = itemView.tv_Title
    private val tvDescription: TextView = itemView.tv_Descripytion

    fun populateModel(userObject: User,activity: MainActivity){
        tvTitle.text = userObject.title + ""
        tvDescription.text = userObject.description + ""
        itemView.setOnClickListener {
            activity.onItemClicked(userObject.count)
        }
    }
}