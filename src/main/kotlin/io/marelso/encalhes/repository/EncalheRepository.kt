package io.marelso.encalhes.repository

import io.marelso.encalhes.domain.Encalhe
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface EncalheRepository: MongoRepository<Encalhe, String> {
    fun findAllByHasArrivedTrue(): List<Encalhe>
    fun findAllByHasArrivedFalse(): List<Encalhe>
}