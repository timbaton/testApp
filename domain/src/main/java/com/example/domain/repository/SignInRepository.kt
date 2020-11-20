package com.example.domain.repository

import com.example.domain.entity.Result
import com.example.domain.entity.SignIn

interface SignInRepository {
    suspend fun signIn(signIn: SignIn): Result<Boolean>
}