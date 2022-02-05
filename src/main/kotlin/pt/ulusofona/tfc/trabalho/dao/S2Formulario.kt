package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S2Formulario(
        @Id @GeneratedValue
        //secção 2
        val id: Long = 0,
        var processId: String = "",

        var s2_A : Boolean,
        var s2_B : Boolean,
        )