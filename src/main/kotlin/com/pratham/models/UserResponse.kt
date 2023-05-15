package com.pratham.models

import kotlinx.serialization.Serializable

@Serializable
data class UserResponse(
    var userEmail: String,
    var userPassword: String
)