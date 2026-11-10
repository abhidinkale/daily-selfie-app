package com.proton.selfie.cache

class BitmapPool(val maxSizeMb: Int = 32) {
    fun acquire(): Any? = null
    fun release(item: Any) {}
}
