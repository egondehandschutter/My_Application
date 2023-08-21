package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.myapplication.databinding.FragmentDateBinding


class DateFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentDateBinding = DataBindingUtil.inflate(inflater, R. layout.fragment_date, container, false)
        binding.verderButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_dateFragment_to_toerismeFragment)
        }
        return binding.root
    }



}
