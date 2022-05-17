package com.bjovic.n26.ecommerce.api.client

import com.bjovic.n26.ecommerce.api.dto.UserDTO
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/api/e-commerce/users")
interface UserClient {
    @GetMapping(value = [""], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getUsers(): ResponseEntity<List<UserDTO>>
}