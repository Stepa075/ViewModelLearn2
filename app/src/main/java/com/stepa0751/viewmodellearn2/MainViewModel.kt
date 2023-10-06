package com.stepa0751.viewmodellearn2

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){


    val liveData = MutableLiveData<String>()
    val dataliveData = MutableLiveData<DataModel>()
    init{
        startTimer()
    }

    fun startTimer(){
        object:  CountDownTimer(20000, 1000){
            override fun onTick(p0: Long) {
                liveData.value = (p0/1000).toString()
                var iiii = DataModel("text", 12345)
                dataliveData.value = iiii
            }

            override fun onFinish() {
                TODO("Not yet implemented")
            }

        }.start()
    }
}