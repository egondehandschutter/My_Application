package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil



class ToerismeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //val binding: FragmentToerismeBinding = DataBindingUtil.inflate(inflater, R. layout.fragment_date, container, false)
        //return binding.root
        return inflater.inflate(R.layout.fragment_toerisme, container, false)
    }

}