package com.bjovic.n26.ecommerce.transformer

import com.bjovic.n26.ecommerce.api.dto.UserDTO
import com.bjovic.n26.ecommerce.model.User
import org.springframework.stereotype.Component

@Component
class UserTransformer : Transformer<User, UserDTO> {
    override fun entityToDto(entity: User): UserDTO = UserDTO(entity.id, entity.name, entity.surname)

    override fun dtoToEntity(dto: UserDTO): User = User(dto.name, dto.surname)
}