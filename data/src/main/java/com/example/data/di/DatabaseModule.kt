package com.example.data.di

import android.content.Context
import com.example.data.repository.storage.LocalStorageDao
import com.google.gson.GsonBuilder
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val dataStorageModule = module {
    single {
        createLocalStorageDao(androidApplication())
    }
}

fun createLocalStorageDao(context: Context): LocalStorageDao {
    val mapper = GsonBuilder().setPrettyPrinting().create()
    return LocalStorageDao(
        mapper,
        context.getSharedPreferences(
            "com.example.testapp.LOCAL_PREFS",
            Context.MODE_PRIVATE
        )
    )
}
