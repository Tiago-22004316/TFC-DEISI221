package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S11Formulario(
        @Id @GeneratedValue
        //secção 11
        val id: Long = 0,
        var processId: String,
                //11.1
        var s11_1 : String = "",
        )