package com.example.resourcemanagementsystem.ui.add_res

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.resourcemanagementsystem.R

class AddResFragment : Fragment() {

    private lateinit var addResViewModel: AddResViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        addResViewModel =
            ViewModelProviders.of(this).get(AddResViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_add_res, container, false)

        return root
    }
}