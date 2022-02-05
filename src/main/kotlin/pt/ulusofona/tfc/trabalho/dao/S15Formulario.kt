package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S15Formulario(
        @Id @GeneratedValue
       //secção 15
        val id: Long = 0,
        var processId: String = "",
        //15
        var s15 : String = ""
)