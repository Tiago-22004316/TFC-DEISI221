package pt.ulusofona.tfc.trabalho.form

import javax.validation.constraints.Min
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull


data class FormularioForm(

        @field:NotEmpty(message = "Erro: O número do processo tem que estar preenchido")
        var processId: String? = null,
        var a2: Boolean = false,
        var b2: Boolean = false,
        var a3: String = "",
        var b3: String = "",
        var c3: String = "",
        var d3: Boolean = false,
        var d3_1: String = "",
        var a5: Boolean = false,
        var b5: Boolean = false,
        var b5_1: String = ""

)
