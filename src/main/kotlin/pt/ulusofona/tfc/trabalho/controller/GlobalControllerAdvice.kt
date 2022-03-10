package pt.ulusofona.tfc.trabalho.controller

import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ModelAttribute
import java.security.Principal

@ControllerAdvice
class GlobalControllerAdvice {

    @ModelAttribute("username")
    fun getUsername(principal: Principal?): String {
        return if (principal != null) {
            principal.name
        } else ""
    }
}