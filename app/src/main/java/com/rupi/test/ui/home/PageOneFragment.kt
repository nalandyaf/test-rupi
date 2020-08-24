package com.rupi.test.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.rupi.test.R
import com.rupi.test.data.model.Example
import com.rupi.test.ui.home.adapter.AdapterList
import kotlinx.android.synthetic.main.fragment_page_one.*

class PageOneFragment : Fragment() {

    private lateinit var pageTwoViewModel: PageTwoViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        pageTwoViewModel =
            ViewModelProviders.of(this).get(PageTwoViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_page_one, container, false)
        pageTwoViewModel.getDummyList().observe(viewLifecycleOwner, Observer<ArrayList<Example>> {
            listItem.adapter = AdapterList(it)
        })
        return root
    }
}