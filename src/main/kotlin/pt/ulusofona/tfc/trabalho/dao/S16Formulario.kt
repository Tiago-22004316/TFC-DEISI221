package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S16Formulario(
        @Id @GeneratedValue
       //secção 13
        val id: Long = 0,

        @Column(length = 50, unique = true)
        var processId: String = "",
                //16.1
        var s16_1_A : Boolean = false,
        var s16_1_B : Boolean = false,
        var s16_1_B_f : String = "",
)