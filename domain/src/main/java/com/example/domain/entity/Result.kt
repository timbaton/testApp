package com.example.domain.entity

/**
 * A generic class that holds a value with its loading status.
 *
 * Result is usually created by the Repository classes where they return
 * `LiveData<Result<T>>` to pass back the latest data to the UI with its fetch status.
 */

data class Result<out T>(val status: Status, val data: T?, val message: String?, val code: Int? = null) {

    enum class Status {
        SUCCESS,
        ERROR
    }

    companion object {
        fun <T> success(data: T?): Result<T> {
            return Result(
                Status.SUCCESS,
                data,
                null
            )
        }

        fun <T> error(message: String, data: T? = null, code: Int? = null): Result<T> {
            return Result(
                Status.ERROR,
                data,
                message,
                code
            )
        }

        fun empty(message: String): Result<String> {
            return Result(
                Status.SUCCESS,
                "",
                message
            )
        }
    }
}