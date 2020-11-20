package com.example.data.repository.storage

import android.content.SharedPreferences
import com.example.domain.entity.SignIn
import com.google.gson.Gson

class LocalStorageDao(private val mapper: Gson, private val preferences: SharedPreferences) {

    fun saveSignIn(signIn: SignIn) {
        putObject(KEY_SIGN_IN, signIn)
    }

    private fun <T> putObject(key: String, `object`: T) {
        val value = mapper.toJson(`object`)
        preferences.edit().putString(key, value).apply()
    }

    private fun <T> getObject(key: String, type: Class<T>): T? {
        val value = preferences.getString(key, null)
        return if (value != null) {
            mapper.fromJson(value, type)
        } else {
            null
        }
    }

    companion object {
        private const val KEY_SIGN_IN = "signIn"
    }
}