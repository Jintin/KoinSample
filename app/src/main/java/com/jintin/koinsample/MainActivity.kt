package com.jintin.koinsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named

class MainActivity : AppCompatActivity() {

    private val honeyLemonade by inject<HoneyLemonade>()

    private val viewModel by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.check()
        val honeyLemonade2 = get<HoneyLemonade>()
        val honeyLemonade3: HoneyLemonade = get(named("Lyme"))
    }
}