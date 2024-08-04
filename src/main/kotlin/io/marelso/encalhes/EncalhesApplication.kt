package io.marelso.encalhes

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.mongo.MongoReactiveAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableAutoConfiguration(exclude = [MongoReactiveAutoConfiguration::class])
class EncalhesApplication

fun main(args: Array<String>) {
	runApplication<EncalhesApplication>(*args)
}
