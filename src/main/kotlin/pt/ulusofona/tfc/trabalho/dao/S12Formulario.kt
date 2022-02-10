package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S12Formulario(
        @Id @GeneratedValue
        //secção 12
        val id: Long = 0,

        @Column(length = 50, unique = true)
        var processId: String = "",
        //12
        var s12_A : Boolean = false,
        var s12_B : Boolean = false,
        var s12_C : Boolean = false,
        var s12_D : Boolean = false,
        var s12_D_f : String = "",
        )