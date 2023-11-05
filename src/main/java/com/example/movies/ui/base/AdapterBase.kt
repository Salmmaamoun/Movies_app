package com.example.movies.ui.base

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class AdapterBase<T>(
    private val items:List<T>,
    private val layoutId:Int,
    private val bind: ViewHolderBase.ViewHolderBind<T>
) :RecyclerView.Adapter<ViewHolderBase<T>>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderBase<T> {
        val view=LayoutInflater.from(parent.context).inflate(layoutId,parent,false)
        val con=ViewHolderBase::class.java.getConstructor()
        return con.newInstance(view,bind)as ViewHolderBase<T>
    }

    override fun onBindViewHolder(holder: ViewHolderBase<T>, position: Int) {
      holder.bind(items[position])
    }

    override fun getItemCount(): Int =items.size
}

class ViewHolderBase<T>(private val root: View, private val bind: ViewHolderBind<T>) :
    RecyclerView.ViewHolder(root) {
    interface ViewHolderBind<T> {
        fun bind(root: View, item: T)
    }
    fun bind(item: T) = bind.bind(root, item)
}