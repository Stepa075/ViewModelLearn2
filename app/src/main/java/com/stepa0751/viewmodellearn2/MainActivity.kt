package com.stepa0751.viewmodellearn2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.stepa0751.viewmodellearn2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mViewModel: MainViewModel

    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onStart() {
        super.onStart()
         mViewModel.liveData.observe(this, Observer{
             binding.tx11.text = it
        })
        mViewModel.dataliveData.observe(this, Observer{
            binding.tx22.text = it.str
        })

    }
}