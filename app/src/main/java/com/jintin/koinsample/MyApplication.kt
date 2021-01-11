package com.jintin.koinsample

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.core.qualifier.named
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
}

val myModule = module {
    factory { HoneyLemonade(get(), get()) }
    factory(named("Lyme")) { HoneyLemonade(get(), get(named("Lyme"))) }
    factory { Honey(get()) }
    factory { Lemon() }
    factory<Lemon>(named("Lyme")) { Lyme() }
    single { Bee() }
    viewModel { MainViewModel(get()) }
}