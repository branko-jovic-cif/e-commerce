package com.bjovic.n26.ecommerce.service

import com.bjovic.n26.ecommerce.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {

    fun getUsers() = userRepository.findAll()

}