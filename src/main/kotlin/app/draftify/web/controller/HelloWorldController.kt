package app.draftify.web.controller

import app.draftify.web.service.AccountService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController(val service: AccountService) {
    @GetMapping("/")
    fun greet(): String {
        val account = service.get()
        return if (account == null) "NOPE" else "EXISTS"
    }
}