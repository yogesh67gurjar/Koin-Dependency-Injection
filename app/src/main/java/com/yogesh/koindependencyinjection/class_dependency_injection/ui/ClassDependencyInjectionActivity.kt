package com.yogesh.koindependencyinjection.class_dependency_injection.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.yogesh.koindependencyinjection.R
import com.yogesh.koindependencyinjection.class_dependency_injection.Car
import com.yogesh.koindependencyinjection.databinding.ActivityClassDependencyInjectionBinding
import org.koin.android.ext.android.inject

class ClassDependencyInjectionActivity : AppCompatActivity() {
    lateinit var binding: ActivityClassDependencyInjectionBinding

    val alto: Car by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_class_dependency_injection)

        initClicks()
    }

    private fun initClicks() {
        binding.startTripBtn.setOnClickListener {
            alto.startTrip()
            Toast.makeText(
                this@ClassDependencyInjectionActivity,
                "Trip Started",
                Toast.LENGTH_SHORT
            ).show()
        }

        binding.endTripBtn.setOnClickListener {
            alto.endTrip()
            Toast.makeText(
                this@ClassDependencyInjectionActivity,
                "Trip Ended",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}