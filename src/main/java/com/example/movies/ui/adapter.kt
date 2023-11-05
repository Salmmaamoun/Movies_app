package com.example.movies.ui

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class adapter(val list: List<String>):RecyclerView.Adapter<adapter.adapterViewHolder>() {


    inner class adapterViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapterViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: adapterViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}