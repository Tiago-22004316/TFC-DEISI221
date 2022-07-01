package pt.ulusofona.tfc.trabalho.controller

import org.slf4j.LoggerFactory
import org.springframework.jdbc.BadSqlGrammarException
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import pt.ulusofona.tfc.trabalho.repository.S1FormularioRepository
import java.security.Principal

@Controller
@RequestMapping("/filter")
class FilterController(
        val jdbcTemplate: JdbcTemplate,
        val s1FormularioRepository: S1FormularioRepository
) {

    val LOG = LoggerFactory.getLogger(this.javaClass.name)

    @GetMapping(value = ["/new"])
    fun filter(
            @RequestParam("fields") fields: List<String>?,
            @RequestParam("values") values: List<String>?,
            model: ModelMap, principal: Principal?
    ): String {


        var processoIds: List<String> = emptyList()
        var valor: Boolean = false
        var i = 0
        var campo = ""
        var saberForm = ""
        var query = ""

        if (fields != null && values != null) {

            if (fields.isEmpty() || values.isEmpty()) {
                model["error"] = "Erro: Tem que preencher um filtro"
            } else if (!fields.all { it.startsWith("s") && it.contains(".") }) {
                model["error"] = "Erro: Filtro mal preenchido"
            } else if (!values.all { it == "SIM" || it == "NÃO" }) {
                model["error"] = "Erro: Os valores têm que ser SIM ou NÃO"
            } else {
                for (field in fields) {
                    campo = field.replace(".", "_")
                    valor = values[i] == "SIM"
                    saberForm = campo[0].toString() + campo[1] + campo[2]
                    when (saberForm) {
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
                    try {
                        LOG.info(query)
                        processoIds += jdbcTemplate.query(query) { rs, _ -> rs.getString("process_id") }
                    } catch (e: BadSqlGrammarException) {
                        model["error"] = "O campo indicado não existe"
                        LOG.error("O campo indicado não existe")
                        break
                    }
                    i++
                }
            }
        }

        // adaptar para usar os fields e os values para construir a string sql
        //val sql = "SELECT process_id FROM s5formulario where s5_1_1_a = 0"
        val processos = if (processoIds.isNotEmpty()) {
            processoIds.map { s1FormularioRepository.findByProcessId(it)!! }
        } else {
            emptyList()
        }


        model["processos"] = processos
        // adiciono sempre um novo campo vazio
        val fieldsPlusOne = fields?.toMutableList() ?: ArrayList()
        if (model["error"] == null) {
            fieldsPlusOne.add("")
        }

        // adiciono sempre um novo valor vazio
        val valuesPlusOne = values?.toMutableList() ?: ArrayList()
        if (model["error"] == null) {
            valuesPlusOne.add("")
        }

        model["fields"] = fieldsPlusOne
        model["values"] = valuesPlusOne

        return "filter"
    }
}