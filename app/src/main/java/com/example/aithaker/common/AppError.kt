package com.example.aithaker.common

sealed class AppError {
    data class DatabaseError(val message: String) : AppError()
    data class ValidationError(val field: String, val message: String) : AppError()
    data object NotFound : AppError()
    data class Unknown(val exception: Throwable) : AppError()
}

fun Throwable.toAppError(): AppError = when (this) {
    is IllegalArgumentException -> AppError.ValidationError("input", message ?: "Invalid input")
    else -> AppError.Unknown(this)
}

fun AppError.toUserMessage(): String = when (this) {
    is AppError.DatabaseError -> "حدث خطأ في قاعدة البيانات"
    is AppError.ValidationError -> "$field: $message"
    is AppError.NotFound -> "المحتوى غير موجود"
    is AppError.Unknown -> "حدث خطأ غير متوقع"
}
