package com.dn.springmvcstarter.controller.rest

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RestController
class HelloWorld {
	@GetMapping("/api/public/hello")
    fun hellopublic(): String {
        return "hello public world"
    }

    @GetMapping("/api/private/hello")
    fun helloprivate(): String {
        return "hello private world"
    }
}