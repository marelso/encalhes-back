package io.marelso.encalhes.controller

import io.marelso.encalhes.domain.City
import io.marelso.encalhes.domain.Encalhe
import io.marelso.encalhes.service.EncalheService
import lombok.RequiredArgsConstructor
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.time.LocalDate

@RestController()
@RequestMapping("/api/encalhe")
@RequiredArgsConstructor
class EncalheController(private val service: EncalheService) {
    @GetMapping
    fun get() = ResponseEntity.ok(service.get())

    @GetMapping("/arrived")
    fun getArrived() = ResponseEntity.ok(service.getByHasArrived(true))

    @GetMapping("/not-arrived")
    fun getNotArrived() = ResponseEntity.ok(service.getByHasArrived(false))

    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: String) = ResponseEntity.ok(service.getById(id))

    @PostMapping
    fun post(@RequestBody encalhe: Encalhe) = ResponseEntity.ok(service.save(encalhe))

    @PostMapping("/arrived")
    fun arrived(@RequestBody encalhe: Encalhe) = ResponseEntity.ok(service.hasArrived(encalhe, true))

    @PostMapping("/not-arrived")
    fun notArrived(@RequestBody encalhe: Encalhe) = ResponseEntity.ok(service.hasArrived(encalhe, false))

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable("id") id: String) = service.deleteById(id).run {
        ResponseEntity.noContent().build<Unit>()
    }
}