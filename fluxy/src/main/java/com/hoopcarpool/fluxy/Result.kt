package com.hoopcarpool.fluxy

/**
 * Models an async operation
 */
sealed class Result<T> {
    data class Success<T>(val value: T) : Result<T>()
    data class Loading<T>(val value: T? = null) : Result<T>()
    data class Failure<T>(val value: T? = null, val exception: Throwable? = null) : Result<T>()
    class Empty<T> : Result<T>()
}