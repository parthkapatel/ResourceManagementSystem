package com.example.resourcemanagementsystem.ui.allocate_res

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.resourcemanagementsystem.R

class AllocateResFragment : Fragment() {

    private lateinit var allocateResViewModel: AllocateResViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        allocateResViewModel =
            ViewModelProviders.of(this).get(AllocateResViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_allocate_res, container, false)

        return root
    }
}