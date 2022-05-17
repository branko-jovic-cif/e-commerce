package com.bjovic.n26.ecommerce.repository

import com.bjovic.n26.ecommerce.model.User
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface UserRepository : CrudRepository<User, UUID>