package pt.ulusofona.tfc.trabalho.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController {

    @GetMapping(value = ["/"])
    fun home(): String{
        println("Chamei o home")
        return "home"
    }
}