package com.example.user_app

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.user_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding:ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.sos?.setOnClickListener {
            binding?.message?.text="Please standby, we are currently requesting for help"
            binding?.message?.setTextColor(ContextCompat.getColor(applicationContext,R.color.white))
            binding?.sos?.setTextColor(ContextCompat.getColor(applicationContext,R.color.red_outer))
            binding?.title?.setTextColor(ContextCompat.getColor(applicationContext,R.color.white))
            binding?.topCircle?.setBackgroundResource(R.drawable.white_back)
            binding?.parent?.setBackgroundColor(ContextCompat.getColor(applicationContext,R.color.red_outer))
        }
    }
}