@file:Suppress("EXPERIMENTAL_API_USAGE")

package com.jintin.koinsample

import androidx.lifecycle.ViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class MainViewModel : ViewModel(), KoinComponent {

    private val honeyLemonade: HoneyLemonade by inject()

    fun doSomething(): String {
        return honeyLemonade.toString()
    }
}