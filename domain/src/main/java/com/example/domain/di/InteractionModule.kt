package com.example.domain.di

import com.example.domain.interaction.signIn.SignInUseCase
import com.example.domain.interaction.signIn.SignInUseCaseImpl
import org.koin.dsl.module

val interactionModule = module {
    factory<SignInUseCase> { SignInUseCaseImpl(get()) }
}