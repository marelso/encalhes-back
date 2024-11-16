package io.marelso.encalhes.controller

import io.marelso.encalhes.domain.City
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/city")
class CityController {
    @GetMapping
    fun get(): ResponseEntity<List<City>> = ResponseEntity.ok(City.entries)
}