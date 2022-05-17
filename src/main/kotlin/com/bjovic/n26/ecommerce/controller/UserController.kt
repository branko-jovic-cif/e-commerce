package com.bjovic.n26.ecommerce.controller

import com.bjovic.n26.ecommerce.api.client.UserClient
import com.bjovic.n26.ecommerce.api.dto.UserDTO
import com.bjovic.n26.ecommerce.service.UserService
import com.bjovic.n26.ecommerce.transformer.UserTransformer
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/e-commerce/users")
class UserController(
    private val userService: UserService,
    private val userTransformer: UserTransformer,
) : UserClient {

    @GetMapping(value = [""], produces = [MediaType.APPLICATION_JSON_VALUE])
    override fun getUsers(): ResponseEntity<List<UserDTO>> {
        return ResponseEntity.ok(userService.getUsers().map { userTransformer.entityToDto(it) })
    }
}