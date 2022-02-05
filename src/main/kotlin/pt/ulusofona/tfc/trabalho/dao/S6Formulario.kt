package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S6Formulario(
        @Id @GeneratedValue
        //secção 6
        val id: Long = 0,
        var processId: String = "",
                //6
        var s6_A : Boolean = false,
        var s6_B : Boolean = false,
        var s6_B_f : String = "",
                //6.1
        var s6_1_A : Boolean = false,
        var s6_1_B : Boolean = false,
        var s6_1_B_f : String = "",
        )