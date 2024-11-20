package com.yogesh.koindependencyinjection.qualifiers

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.yogesh.koindependencyinjection.R
import com.yogesh.koindependencyinjection.databinding.ActivityQualifiersBinding
import com.yogesh.koindependencyinjection.di.BASE_URL_ONE
import com.yogesh.koindependencyinjection.di.BASE_URL_TWO
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named

class QualifiersActivity : AppCompatActivity() {
    lateinit var binding: ActivityQualifiersBinding

    val baseUrl1: String by inject(named(BASE_URL_ONE))
    val baseUrl2: String = get(named(BASE_URL_TWO))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            DataBindingUtil.setContentView(this@QualifiersActivity, R.layout.activity_qualifiers)

        initClicks()

    }

    private fun initClicks() {
        binding.baseUrlOneBtn.setOnClickListener {
            Toast.makeText(this@QualifiersActivity, baseUrl1, Toast.LENGTH_SHORT).show()
        }

        binding.baseUrlTwoBtn.setOnClickListener {
            Toast.makeText(this@QualifiersActivity, baseUrl2, Toast.LENGTH_SHORT).show()
        }
    }
}