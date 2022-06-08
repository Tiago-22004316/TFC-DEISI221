package pt.ulusofona.tfc.trabalho.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import java.security.Principal

@Controller
@RequestMapping("/filter")
class FilterController {

    @GetMapping(value = ["/new"])
    fun filter(@RequestParam("fields") fields: List<String>?,
               @RequestParam("values") values: List<String>?,
               model: ModelMap, principal: Principal?): String {

        // adiciono sempre um novo campo vazio
        val fieldsPlusOne = fields?.toMutableList() ?: ArrayList()
        fieldsPlusOne.add("")

        // adiciono sempre um novo valor vazio
        val valuesPlusOne = values?.toMutableList() ?: ArrayList()
        valuesPlusOne.add("")

        model["fields"] = fieldsPlusOne
        model["values"] = valuesPlusOne

        // falta passar ao model a lista de processos filtrada pelos valores dos filtros

        return "filter"
    }
}