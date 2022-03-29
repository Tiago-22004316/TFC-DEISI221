package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S6Formulario(
        @Id @GeneratedValue
        //secção 6
        val id: Long = 0,

        @Column(length = 50, unique = true)
        var processId: String = "",
                //6
        var s6_A : Boolean = false,
        var s6_B : Boolean = false,
        var s6_B_f : String = "",
                //6.1
        var s6_1_A : Boolean = false,
        var s6_1_B : Boolean = false,
        @Column(length = 2000, unique = true)
        var s6_1_B_f : String = "",
        )