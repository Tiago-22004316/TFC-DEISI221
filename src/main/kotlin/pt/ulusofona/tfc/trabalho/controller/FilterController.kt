package pt.ulusofona.tfc.trabalho.controller

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import pt.ulusofona.tfc.trabalho.dao.S1Formulario
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


        val valor : Boolean = if (values != null && values[values.size - 1] == "SIM") true else false

        var campo = ""
        var saberForm = ""
        var query = ""
        if (fields != null && values != null){
            campo = fields[fields.size - 1].replace(".","_")
            saberForm = campo[0].toString() + campo[1] + campo[2]
            when (saberForm){
                "s2_" -> query = "SELECT process_id FROM s2formulario where $campo = $valor"

                "s3_" -> query = "SELECT process_id FROM s3formulario where $campo = $valor"

                "s4_" -> query = "SELECT process_id FROM s4formulario where $campo = $valor"

                "s5_" -> query = "SELECT process_id FROM s5formulario where $campo = $valor"

                "s6_" -> query = "SELECT process_id FROM s6formulario where $campo = $valor"

                "s7_" -> query = "SELECT process_id FROM s7formulario where $campo = $valor"

                "s8_" -> query = "SELECT process_id FROM s8formulario where $campo = $valor"

                "s9_" -> query = "SELECT process_id FROM s9formulario where $campo = $valor"

                "s10" -> query = "SELECT process_id FROM s10formulario where $campo = $valor"

                "s11" -> query = "SELECT process_id FROM s11formulario where $campo = $valor"

                "s12" -> query = "SELECT process_id FROM s12formulario where $campo = $valor"

                "s13" -> query = "SELECT process_id FROM s13formulario where $campo = $valor"

                "s14" -> query = "SELECT process_id FROM s14formulario where $campo = $valor"

                "s15" -> query = "SELECT process_id FROM s15formulario where $campo = $valor"

                "s16" -> query = "SELECT process_id FROM s16formulario where $campo = $valor"

                "s17" -> query = "SELECT process_id FROM s17formulario where $campo = $valor"

                "s18" -> query = "SELECT process_id FROM s18formulario where $campo = $valor"

                "s19" -> query = "SELECT process_id FROM s19formulario where $campo = $valor"

                "s20" -> query = "SELECT process_id FROM s20formulario where $campo = $valor"

                "s21" -> query = "SELECT process_id FROM s21formulario where $campo = $valor"

                else -> query = "SELECT process_id FROM s1formulario where $campo != NULL "

            }
        }

        // adaptar para usar os fields e os values para construir a string sql
        //val sql = "SELECT process_id FROM s5formulario where s5_1_1_a = 0"
        val processos = if (query != ""){
            val processoIds: List<String> = jdbcTemplate.query(query) { rs, _ -> rs.getString("process_id") }
            processoIds.map { s1FormularioRepository.findByProcessId(it)!! }
        } else {}


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