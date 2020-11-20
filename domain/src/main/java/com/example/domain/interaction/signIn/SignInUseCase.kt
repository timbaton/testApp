package com.example.domain.interaction.signIn

import com.example.domain.base.BaseUseCase
import com.example.domain.entity.Result
import com.example.domain.entity.SignIn

interface SignInUseCase : BaseUseCase<SignIn, Boolean> {
    override suspend fun invoke(signIn: SignIn): Result<Boolean>
}