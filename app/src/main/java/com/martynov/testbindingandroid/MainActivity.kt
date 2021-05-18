package com.martynov.testbindingandroid


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.martynov.testbindingandroid.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ft: FragmentTransaction = supportFragmentManager.beginTransaction()
        val fragment: FirstFragment = FirstFragment()
        ft.add(R.id.containerFragment, fragment)
        ft.commit()
    }
}