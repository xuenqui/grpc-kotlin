package io.github.xuenqui

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("io.github.xuenqui")
		.start()
}

