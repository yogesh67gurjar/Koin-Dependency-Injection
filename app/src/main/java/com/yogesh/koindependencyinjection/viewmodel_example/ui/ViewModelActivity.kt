package com.yogesh.koindependencyinjection.viewmodel_example.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.yogesh.koindependencyinjection.R
import com.yogesh.koindependencyinjection.databinding.ActivityViewModelBinding
import com.yogesh.koindependencyinjection.viewmodel_example.MyViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class ViewModelActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewModelBinding
    val vm: MyViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_view_model)

        vm.countLiveData.observe(this) {
            binding.countTv.text = "$it"
        }

        binding.addBtn.setOnClickListener {
            vm.plusOne()
        }
    }
}