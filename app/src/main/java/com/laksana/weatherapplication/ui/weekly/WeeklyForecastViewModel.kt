package com.laksana.weatherapplication.ui.weekly

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WeeklyForecastViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is weekly weather"
    }
    val text: LiveData<String> = _text
}