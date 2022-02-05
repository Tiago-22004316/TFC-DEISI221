package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S16Formulario(
        @Id @GeneratedValue
       //secção 13
        val id: Long = 0,
        var processId: String = "",
        //16.1
        var s5_A : Boolean = false,
        var s5_B : Boolean = false,
        var s5_B_f : String,
)