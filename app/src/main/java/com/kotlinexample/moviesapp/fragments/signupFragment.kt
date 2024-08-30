package com.kotlinexample.moviesapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.kotlinexample.moviesapp.MainActivity
import com.kotlinexample.moviesapp.R
import com.kotlinexample.moviesapp.databinding.FragmentLoginBinding
import com.kotlinexample.moviesapp.databinding.FragmentSignupBinding


class signupFragment : Fragment() {

    private lateinit var binding : FragmentSignupBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignupBinding.inflate(inflater, container, false)
        initViews()
        listeners()

        return binding.root
    }

    private fun listeners() {
        TODO("Not yet implemented")
    }

    private fun initViews() {

    }



}