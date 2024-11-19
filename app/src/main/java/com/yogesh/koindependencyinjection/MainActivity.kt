package com.yogesh.koindependencyinjection

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.yogesh.koindependencyinjection.class_dependency_injection.ui.ClassDependencyInjectionActivity
import com.yogesh.koindependencyinjection.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        clickEvents()
    }

    private fun clickEvents() {
        binding.classDiBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, ClassDependencyInjectionActivity::class.java))
        }
    }

}