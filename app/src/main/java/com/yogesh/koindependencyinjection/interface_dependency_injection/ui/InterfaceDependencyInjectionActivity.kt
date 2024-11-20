package com.yogesh.koindependencyinjection.interface_dependency_injection.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.yogesh.koindependencyinjection.R
import com.yogesh.koindependencyinjection.databinding.ActivityInterfaceDependencyInjectionBinding
import com.yogesh.koindependencyinjection.interface_dependency_injection.TwoWheeler
import org.koin.android.ext.android.get


class InterfaceDependencyInjectionActivity : AppCompatActivity() {
    lateinit var binding: ActivityInterfaceDependencyInjectionBinding
    val hfDeluxe: TwoWheeler = get()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            DataBindingUtil.setContentView(this, R.layout.activity_interface_dependency_injection)

        initClicks()
    }

    private fun initClicks() {
        binding.startTrip.setOnClickListener {
            hfDeluxe.start()
            Toast.makeText(
                this@InterfaceDependencyInjectionActivity,
                "Trip Started",
                Toast.LENGTH_SHORT
            ).show()
        }

        binding.endTrip.setOnClickListener {
            hfDeluxe.stop()
            Toast.makeText(
                this@InterfaceDependencyInjectionActivity,
                "Trip Ended",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}