package io.marelso.encalhes.domain

import java.time.LocalDate

data class Encalhe(
    val id: String? = null,
    val city: City,
    val from: LocalDate? = null,
    val to: LocalDate? = null,
    val limit: LocalDate? = null,
    val dateRange: String? = null,
    val hasArrived: Boolean? = null
)