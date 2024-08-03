package io.marelso.encalhes.domain

import java.time.LocalDate

data class Encalhe(
    val id: String,
    val city: City,
    val from: LocalDate,
    val to: LocalDate,
    val limit: LocalDate,
    val hasArrived: Boolean
)