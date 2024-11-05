package io.marelso.encalhes

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class EncalhesApplication

fun main(args: Array<String>) {
	runApplication<EncalhesApplication>(*args)
}
