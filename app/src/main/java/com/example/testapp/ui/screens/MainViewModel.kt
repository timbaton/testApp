package com.example.testapp.ui.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.entity.SignIn
import com.example.domain.interaction.signIn.SignInUseCase
import kotlinx.coroutines.launch

class MainViewModel(private val signInUseCase: SignInUseCase) : ViewModel() {

    fun signIng(login: String, password: String) {
        viewModelScope.launch {
            signInUseCase.invoke(SignIn(login, password))
        }
    }
}