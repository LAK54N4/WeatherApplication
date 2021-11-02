package com.laksana.weatherapplication.ui.today

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CurrentForecastViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is daily weather"
    }
    val text: LiveData<String> = _text
}