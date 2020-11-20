package com.example.domain.interaction.signIn

import com.example.domain.entity.Result
import com.example.domain.entity.SignIn
import com.example.domain.repository.SignInRepository

class SignInUseCaseImpl(private val signInRepository: SignInRepository) : SignInUseCase {
    override suspend fun invoke(signIn: SignIn): Result<Boolean> {
        return signInRepository.signIn(signIn)
    }
}