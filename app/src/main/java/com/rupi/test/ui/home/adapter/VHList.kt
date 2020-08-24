package com.rupi.test.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rupi.test.R
import com.rupi.test.data.model.Example

class VHList(inflater: LayoutInflater, parent: ViewGroup) : RecyclerView.ViewHolder(
    inflater.inflate(
        R.layout.item_list, parent, false
    )
) {
    private var mTextView: TextView? = null

    init {
        mTextView = itemView.findViewById(R.id.name);
    }

    fun bind(example: Example) {
        mTextView?.text = example.text
    }


}