package ru.mercuriev.progressbaration

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
open class Application {

}

@RestController
class HelloSpringBootController {

    @RequestMapping(value = "/")
    fun helloSpringBoot() = 1255000.0 / 4400000.0

}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}