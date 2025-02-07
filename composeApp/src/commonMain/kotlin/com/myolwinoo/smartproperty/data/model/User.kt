package com.myolwinoo.smartproperty.data.model

data class User(
    val id: String,
    val name: String,
    val email: String,
    val phone: String,
    val passwordHash: String,
    val role: UserRole,
    val profileImage: String? = null,
    val bio: String? = null,
    val verified: Boolean = false,
    val createdAt: String,
    val updatedAt: String
)