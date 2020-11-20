package com.example.testapp.di

import com.example.data.di.dataStorageModule
import com.example.data.di.repositoryModule
import com.example.domain.di.interactionModule


val AppModules = listOf(
    dataStorageModule,
    repositoryModule,
    viewModelsModule,
    interactionModule
)
