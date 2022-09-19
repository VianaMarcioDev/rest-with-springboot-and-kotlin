package br.com.marcioviana

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestWithSpringbootAndKotlinApplication

fun main(args: Array<String>) {
	runApplication<RestWithSpringbootAndKotlinApplication>(*args)
}
