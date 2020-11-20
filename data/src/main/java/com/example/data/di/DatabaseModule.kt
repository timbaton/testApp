package com.example.data.di

import android.content.Context
import com.example.data.repository.storage.LocalStorageDao
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val dataStorageModule = module {
    single {
        LocalStorageDao(
            androidApplication().getSharedPreferences(
                "com.example.testapp.LOCAL_PREFS",
                Context.MODE_PRIVATE
            )
        )
    }
}
