package com.rupi.test.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rupi.test.data.model.Example

class PageTwoViewModel : ViewModel() {

    private val _dummyList = MutableLiveData<ArrayList<Example>>().apply {
        value = arrayListOf(
            Example("Menu Item 1"),
            Example("Menu Item 2"),
            Example("Menu Item 3"),
            Example("Menu Item 4"),
            Example("Menu Item 5")
        )
    }

    fun getDummyList(): LiveData<ArrayList<Example>> {
        return _dummyList
    }
}