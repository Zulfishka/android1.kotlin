package com.example.android1kotlin

import android.graphics.Bitmap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android1kotlin.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root

        getData()
    }

    private fun getData() {
        val name = arguments?.getString("name")
        val email=arguments?.getString("email")
        val image=arguments?.getParcelable<Bitmap>("image")

        binding.textViewFirst.setText(name)
        binding.textViewSecond.setText(email)
        binding.imageSecond.setImageBitmap(image)
    }
}