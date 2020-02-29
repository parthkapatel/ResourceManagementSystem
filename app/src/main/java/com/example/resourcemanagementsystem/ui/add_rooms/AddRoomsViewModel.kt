package com.example.resourcemanagementsystem.ui.add_rooms

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddRoomsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is add_rooms Fragment"
    }
    val text: LiveData<String> = _text
}