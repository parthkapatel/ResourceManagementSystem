package com.example.resourcemanagementsystem.ui.show_res

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.resourcemanagementsystem.R

class ShowResFragment : Fragment() {

    private lateinit var showResViewModel: ShowResViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        showResViewModel =
            ViewModelProviders.of(this).get(ShowResViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_show_res, container, false)

        return root
    }
}