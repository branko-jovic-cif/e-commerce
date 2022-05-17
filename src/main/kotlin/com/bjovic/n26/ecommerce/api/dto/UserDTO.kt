package com.bjovic.n26.ecommerce.api.dto

import java.util.UUID

data class UserDTO(
    val id: UUID?,
    val name: String,
    val surname: String
)
