package ru.gb.moneyexchange.util

import android.os.CountDownTimer

fun updateTimer(time: Long, action:() ->  Unit){
    object : CountDownTimer(time, 1000) {

        override fun onTick(millisUntilFinished: Long) {

        }

        override fun onFinish() {
            action()
        }
    }.start()
}