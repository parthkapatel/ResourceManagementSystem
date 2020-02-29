package com.example.resourcemanagementsystem.ui.show_visual_rooms

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShowVisualRoomsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is show_visual_rooms Fragment"
    }
    val text: LiveData<String> = _text
}