package com.example.data.di

import com.example.data.repository.signin.SignInRepositoryImpl
import com.example.domain.repository.SignInRepository
import org.koin.dsl.module


val repositoryModule = module {
    single<SignInRepository> { SignInRepositoryImpl(get()) }
}
