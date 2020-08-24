package com.rupi.test.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rupi.test.data.model.Example

class AdapterList(private val data: ArrayList<Example>) : RecyclerView.Adapter<VHList>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHList {
        val inflater = LayoutInflater.from(parent.context)
        return VHList(inflater, parent)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: VHList, position: Int) {
        val example: Example = data[position]
        holder.bind(example)
    }
}