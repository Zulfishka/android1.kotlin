package com.example.android1kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android1kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navigateFragments()
    }

    private fun navigateFragments() {
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container_view_main, FirstFragment())
            .commit()
    }
}