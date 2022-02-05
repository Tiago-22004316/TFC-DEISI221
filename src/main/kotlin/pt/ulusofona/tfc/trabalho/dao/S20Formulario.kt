package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S20Formulario(
        @Id @GeneratedValue
       //secção 13
        val id: Long = 0,
        var processId: String = "",
                //20.1
        var s20_1 : String = "",

)