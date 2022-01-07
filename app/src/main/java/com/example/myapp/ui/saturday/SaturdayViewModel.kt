package com.example.myapp.ui.saturday

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SaturdayViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private val _text = MutableLiveData<String>().apply {
        value = "This is test Fragment"
    }
    val text: LiveData<String> = _text
}