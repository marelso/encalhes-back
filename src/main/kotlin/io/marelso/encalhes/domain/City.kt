package io.marelso.encalhes.domain

import java.util.Calendar

enum class City(val city: String, val daysOfWeek: List<Int>) {
    CENTRO("CENTRO", listOf(Calendar.MONDAY, Calendar.THURSDAY)),
    IPIRANGA("IPIRANGA", listOf(Calendar.TUESDAY, Calendar.FRIDAY)),
    GRAVATAI("GRAVATAI", listOf(Calendar.TUESDAY, Calendar.FRIDAY)),
    VIAMAO("VIAMAO", listOf(Calendar.TUESDAY, Calendar.FRIDAY)),
    CAXIAS("CAXIAS", listOf(Calendar.WEDNESDAY)),
    SANTA_MARIA("SANTA_MARIA", listOf(Calendar.WEDNESDAY)),
    PELOTAS("PELOTAS", listOf(Calendar.WEDNESDAY)),
    TRAMANDAI("TRAMANDAI", listOf(Calendar.THURSDAY)),
    CAPAO("CAPAO", listOf(Calendar.THURSDAY)),
    GUAIBA("GUAIBA", listOf(Calendar.THURSDAY)),
    ALVORADA("ALVORADA", listOf(Calendar.THURSDAY)),
    LAGEADO("LAGEADO", listOf(Calendar.THURSDAY)),
    ERECHIM("ERECHIM", listOf(Calendar.THURSDAY)),
    PASSO_FUNDO("PASSO_FUNDO", listOf(Calendar.THURSDAY)),
    SANTA_ROSA("SANTA_ROSA", listOf(Calendar.THURSDAY)),
    SANTO_ANGELO("SANTO_ANGELO", listOf(Calendar.THURSDAY)),
    URUGUAIANA("URUGUAIANA", listOf(Calendar.THURSDAY)),
    CRUZ_ALTA("CRUZ_ALTA", listOf(Calendar.THURSDAY)),
    SINOS_INTERIOR("SINOS_INTERIOR", listOf(Calendar.THURSDAY)),
    SINOS_SERRA("SINOS_SERRA", listOf(Calendar.THURSDAY)),
    CAVALHADA("CAVALHADA", listOf(Calendar.FRIDAY)),
    NAVEGANTES("NAVEGANTES", listOf(Calendar.FRIDAY)),
    SERTORIO("SERTORIO", listOf(Calendar.FRIDAY)),
    SINOS("SINOS", listOf(Calendar.FRIDAY)),
    BAGE("BAGE", listOf(Calendar.FRIDAY)),
    ROSARIO("ROSARIO", listOf(Calendar.FRIDAY)),
    FREDERICO("FREDERICO", listOf(Calendar.FRIDAY)),
    SANTA_CRUZ("SANTA_CRUZ", listOf(Calendar.FRIDAY)),
    BALNEARIO("BALNEARIO", listOf(Calendar.FRIDAY)),
    CRICIUMA("CRICIUMA", listOf(Calendar.FRIDAY)),
    FLORIANOPOLIS("FLORIANOPOLIS", listOf(Calendar.FRIDAY)),
    GAROPABA("GAROPABA", listOf(Calendar.FRIDAY)),
    TERRA_DE_AREIA("TERRA_DE_AREIA", listOf(Calendar.FRIDAY));
}