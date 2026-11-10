package com.proton.selfie.timer

class CountDownTimer(val seconds: Int) {
    fun start(onTick: (Int) -> Unit, onFinish: () -> Unit) {}
}
