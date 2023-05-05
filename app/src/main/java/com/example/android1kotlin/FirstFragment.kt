package com.example.android1kotlin

import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.android1kotlin.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
        setImage()
        btnClick()
    }

    private fun setImage() {
        Glide.with(binding.imageFirst).load("https://content.r9cdn.net/rimg/dimg/34/63/e358adfb-city-23190-16547cb06d3.jpg?width=1366&height=768&xhint=2058&yhint=1668&crop=true").into(binding.imageFirst)

    }

    private fun btnClick() {
        binding.btn.setOnClickListener(View.OnClickListener{
            val fragment = SecondFragment()
            val bundle= Bundle()
            bundle.putString("name", binding.editTextFirst.text.toString())
            bundle.putString("name", binding.editTextSecond.text.toString())
            bundle.putParcelable("image", (binding.imageFirst.drawable as BitmapDrawable).bitmap)
            fragment.arguments = bundle

            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container_view_main, fragment)
                .addToBackStack(null)
                .commit()
        })
    }
}
