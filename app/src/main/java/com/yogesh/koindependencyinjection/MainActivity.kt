package com.yogesh.koindependencyinjection

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.yogesh.koindependencyinjection.class_dependency_injection.ui.ClassDependencyInjectionActivity
import com.yogesh.koindependencyinjection.databinding.ActivityMainBinding
import com.yogesh.koindependencyinjection.interface_dependency_injection.ui.InterfaceDependencyInjectionActivity
import com.yogesh.koindependencyinjection.qualifiers.QualifiersActivity

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

        binding.interfaceDiBtn.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    InterfaceDependencyInjectionActivity::class.java
                )
            )
        }

        binding.qualifiersBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, QualifiersActivity::class.java))
        }
    }

}