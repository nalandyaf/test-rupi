package com.rupi.test.ui.dashboard

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.rupi.test.ui.login.PreferenceHelper
import com.rupi.test.ui.login.PreferenceHelper.email
import com.rupi.test.ui.login.PreferenceHelper.username

class PageTwoViewModel(application: Application) : AndroidViewModel(application) {

    private val prefs = PreferenceHelper.userPreference(application, "data")

    private val username = MutableLiveData<String>().apply {
        value = prefs.username
    }

    private val email = MutableLiveData<String>().apply {
        value = prefs.email
    }

    fun getUsername(): LiveData<String> {
        return username
    }

    fun getEmail(): LiveData<String> {
        return email
    }
}