package com.yogesh.koindependencyinjection.bind_binds_example.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.yogesh.koindependencyinjection.R
import com.yogesh.koindependencyinjection.bind_binds_example.Engineer
import com.yogesh.koindependencyinjection.bind_binds_example.StudentWhoSings
import com.yogesh.koindependencyinjection.databinding.ActivityBindBindsExampleBinding
import org.koin.android.ext.android.inject

class BindBindsExampleActivity : AppCompatActivity() {

    val yogesh: Engineer by inject()
    val durgesh: StudentWhoSings by inject()

    lateinit var binding: ActivityBindBindsExampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_bind_binds_example)

        initClicks()
    }

    private fun initClicks() {
        binding.bindBtn.setOnClickListener {
            yogesh.writeCode()
            yogesh.debugCode()
            Toast.makeText(this@BindBindsExampleActivity, "Success", Toast.LENGTH_SHORT).show()
        }

        binding.bindsBtn.setOnClickListener {
            durgesh.doStudy()
            durgesh.doRevision()
            durgesh.singSong()
            durgesh.playGuitar()
            Toast.makeText(this@BindBindsExampleActivity, "Success", Toast.LENGTH_SHORT).show()
        }
    }
}