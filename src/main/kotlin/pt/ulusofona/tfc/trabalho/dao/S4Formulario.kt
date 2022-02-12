package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S4Formulario(
        @Id @GeneratedValue
        //secção 4
        val id: Long = 0,

        @Column(length = 50, unique = true)
        var processId: String = "",
                //4.1.1
        var s4_1_1 : Boolean = false,
        var s4_1_1_A : Boolean = false,
        var s4_1_1_B : Boolean = false,
                //4.1.2
        var s4_1_2 : Boolean = false,
        var s4_1_2_f : String = "",
        )