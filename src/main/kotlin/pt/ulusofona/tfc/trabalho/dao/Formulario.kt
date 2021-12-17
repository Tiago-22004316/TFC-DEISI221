package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Formulario(
        @Id @GeneratedValue
        val id: Long = 0,
        var processId: String,
        var a2: Boolean,
        var b2: Boolean,
        var a3: String = "",
        var b3: String = "",
        var c3: String = "",
        var d3: Boolean = false,
        var d3_1: String = "",
        var a5: Boolean,
        var b5: Boolean,
        var b5_1: String) {

}