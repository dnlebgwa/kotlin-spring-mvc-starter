package com.dn.springmvcstarter.controller.web

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloWorldWeb {
    @GetMapping("/")
    fun homepublic(model: Model): String {
        model.addAttribute("name", "Me")
        return "home"
    }


    @GetMapping("/ui/private/hello")
    fun homeprivate(model: Model): String {
        model.addAttribute("name", "Me Private")
        return "home"
    }
}
