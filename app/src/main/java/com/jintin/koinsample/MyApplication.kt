package com.jintin.koinsample

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            // declare used Android context
            androidContext(this@MyApplication)
            // declare modules
            modules(myModule)
        }
    }

    private val myModule = module {
        factory { HoneyLemonade(get(), get()) }
        factory { Honey(get()) }
        factory { Lemon() }
        single { Bee() }
    }
}