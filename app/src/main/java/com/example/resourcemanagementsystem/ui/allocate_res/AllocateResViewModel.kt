package com.example.resourcemanagementsystem.ui.allocate_res

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AllocateResViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is allocate_res Fragment"
    }
    val text: LiveData<String> = _text
}