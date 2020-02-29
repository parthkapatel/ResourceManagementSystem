package com.example.resourcemanagementsystem.ui.add_rooms

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.resourcemanagementsystem.R

class AddRoomsFragment : Fragment() {

    private lateinit var addRoomsViewModel: AddRoomsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        addRoomsViewModel =
            ViewModelProviders.of(this).get(AddRoomsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_add_rooms, container, false)

        return root
    }
}