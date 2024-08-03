package io.marelso.encalhes.service

import io.marelso.encalhes.domain.Encalhe
import io.marelso.encalhes.repository.EncalheRepository
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service

@Service
class EncalheService(private val repository: EncalheRepository) {
    fun get(): List<Encalhe> {
        return repository.findAll()
    }

    fun getByHasArrived(hasArrived: Boolean): List<Encalhe> {
        return if(hasArrived) {
            repository.findAllByHasArrivedTrue()
        } else {
            repository.findAllByHasArrivedFalse()
        }
    }

    fun getById(id: String): Encalhe {
        return repository.findById(id).orElseThrow {
            RuntimeException("Encalhe not found")
        }
    }

    fun save(encalhe: Encalhe): Encalhe {
        return repository.save(encalhe)
    }

    fun hasArrived(encalhe: Encalhe, hasArrived: Boolean): Encalhe {
        return repository.save(encalhe.copy(
            hasArrived = hasArrived
        ))
    }

    fun deleteById(id: String): Unit {
        repository.deleteById(id)
    }
}