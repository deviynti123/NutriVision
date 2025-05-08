package com.example.nutrivision

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.nutrivision.databinding.ActivityBirthdayBinding

class BirthdayActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBirthdayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirthdayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set the min and max values for the NumberPickers
        binding.monthPicker.minValue = 1
        binding.monthPicker.maxValue = 12
        binding.dayPicker.minValue = 1
        binding.dayPicker.maxValue = 31
        binding.yearPicker.minValue = 1900
        binding.yearPicker.maxValue = 2025
    }
}