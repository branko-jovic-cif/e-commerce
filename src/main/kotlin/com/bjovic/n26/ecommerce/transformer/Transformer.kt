package com.bjovic.n26.ecommerce.transformer

interface Transformer<E, D> {
    fun entityToDto(entity: E): D
    fun dtoToEntity(dto: D): E
}
