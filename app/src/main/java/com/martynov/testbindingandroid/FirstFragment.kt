package com.martynov.testbindingandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.martynov.testbindingandroid.databinding.FirstFragmentBinding

class FirstFragment: Fragment() {
    private lateinit var binding: FirstFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FirstFragmentBinding.inflate(layoutInflater)
        val view = binding.root
        binding.buttonOne.setOnClickListener {
            Toast.makeText(context, "in xml: button_one", Toast.LENGTH_SHORT).show()
        }

        binding.buttonTwo.setOnClickListener {
            Toast.makeText(context, "in xml: buttonTwo", Toast.LENGTH_SHORT).show()
        }
        return view
    }
}