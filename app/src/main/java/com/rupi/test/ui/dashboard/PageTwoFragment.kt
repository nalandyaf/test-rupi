package com.rupi.test.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.rupi.test.R
import com.rupi.test.ui.login.PreferenceHelper
import com.rupi.test.ui.login.PreferenceHelper.email
import com.rupi.test.ui.login.PreferenceHelper.username
import kotlinx.android.synthetic.main.fragment_page_two.*

class PageTwoFragment : Fragment() {

    private lateinit var pageTwoViewModel: PageTwoViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        pageTwoViewModel =
            ViewModelProviders.of(this).get(PageTwoViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_page_two, container, false)
        pageTwoViewModel.getUsername().observe(viewLifecycleOwner, Observer<String> {
            username.text = it
        })
        pageTwoViewModel.getEmail().observe(viewLifecycleOwner, Observer<String> {
            email.text = it
        })
        return root
    }
}