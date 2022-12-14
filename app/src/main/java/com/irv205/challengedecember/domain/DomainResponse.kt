package com.irv205.challengedecember.domain

sealed class DomainResponse<T> {
    data class Success<T>(val data: T): DomainResponse<T>()
    data class OnFailure<T>(val message: String): DomainResponse<T>()
}