package com.jintin.koinsample

import androidx.lifecycle.ViewModel

class MainViewModel(private val honeyLemonade: HoneyLemonade) : ViewModel() {

    fun check() {
        println(honeyLemonade)
    }
}