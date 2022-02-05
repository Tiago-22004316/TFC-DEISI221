package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S4Formulario(
        @Id @GeneratedValue
        //secção 4
        val id: Long = 0,
        var processId: String = "",
                //4.2
        var s4_2 : Boolean = false,
        var s4_2_A : Boolean = false,
        var s4_2_B : Boolean = false,
                //4.3
        var s4_3 : Boolean = false,
        var s4_3_f : String = "",
        )