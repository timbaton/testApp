package com.example.testapp.di

import com.example.testapp.ui.screens.MainViewModel
import org.koin.dsl.module

val viewModelsModule = module {
    single { MainViewModel(get()) }
}