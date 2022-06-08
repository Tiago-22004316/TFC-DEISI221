package pt.ulusofona.tfc.trabalho.controller

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import pt.ulusofona.tfc.trabalho.repository.S1FormularioRepository
import java.security.Principal

@Controller
@RequestMapping("/filter")
class FilterController(val jdbcTemplate: JdbcTemplate,
                       val s1FormularioRepository: S1FormularioRepository) {

    @GetMapping(value = ["/new"])
    fun filter(@RequestParam("fields") fields: List<String>?,
               @RequestParam("values") values: List<String>?,
               model: ModelMap, principal: Principal?): String {

        // adaptar para usar os fields e os values para construir a string sql
        val sql = "SELECT process_id FROM s5formulario where s5_1_1_a = 0"
        val processoIds: List<String> = jdbcTemplate.query(sql) { rs, _ -> rs.getString("process_id") }

        val processos = processoIds.map { s1FormularioRepository.findByProcessId(it)!! }

        // falta passar ao model a lista de processos filtrada pelos valores dos filtros
        model["processos"] = processos

        // adiciono sempre um novo campo vazio
        val fieldsPlusOne = fields?.toMutableList() ?: ArrayList()
        fieldsPlusOne.add("")

        // adiciono sempre um novo valor vazio
        val valuesPlusOne = values?.toMutableList() ?: ArrayList()
        valuesPlusOne.add("")

        model["fields"] = fieldsPlusOne
        model["values"] = valuesPlusOne

        return "filter"
    }
}