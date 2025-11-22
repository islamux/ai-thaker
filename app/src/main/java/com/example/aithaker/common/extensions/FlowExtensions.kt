package com.example.aithaker.common.extensions

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart

/**
 * Wrap Flow emissions in Result type for error handling
 */
fun <T> Flow<T>.asResult(): Flow<Result<T>> {
    return this
        .map { Result.success(it) }
        .onStart { emit(Result.success(null as T)) }
        .catch { emit(Result.failure(it)) }
}

/**
 * Map Flow to another type with error handling
 */
fun <T, R> Flow<Result<T>>.mapResult(transform: (T) -> R): Flow<Result<R>> {
    return map { result ->
        result.mapCatching { transform(it) }
    }
}
