package com.martynov.testbindingandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.martynov.testbindingandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOne.setOnClickListener {
            Toast.makeText(this, "in xml: button_one", Toast.LENGTH_SHORT).show()
        }

        binding.buttonTwo.setOnClickListener {
            Toast.makeText(this, "in xml: buttonTwo", Toast.LENGTH_SHORT).show()
        }

    }
}