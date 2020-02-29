package com.example.resourcemanagementsystem.ui.show_visual_rooms

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.resourcemanagementsystem.R

class ShowVisualRoomsFragment : Fragment() {

    private lateinit var showVisualRoomsViewModel: ShowVisualRoomsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        showVisualRoomsViewModel =
            ViewModelProviders.of(this).get(ShowVisualRoomsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_show_visual_rooms, container, false)

        return root
    }
}