package com.example.data.repository.signin

import com.example.data.repository.storage.LocalStorageDao
import com.example.domain.entity.Result
import com.example.domain.entity.SignIn
import com.example.domain.repository.SignInRepository

class SignInRepositoryImpl(private val localStorageDao: LocalStorageDao) : SignInRepository {

    override suspend fun signIn(signIn: SignIn): Result<Boolean> {
        localStorageDao.saveSignIn(signIn)
        return Result.success(true)
    }
}