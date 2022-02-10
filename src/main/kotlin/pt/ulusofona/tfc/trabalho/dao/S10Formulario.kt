package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S10Formulario(
        @Id @GeneratedValue
        //secção 10
        val id: Long = 0,

        @Column(length = 50, unique = true)
        var processId: String = "",
                //10.1
        var s10_1 : Boolean = false,
                //10.2
        var s10_2 : Boolean = false,
        var s10_2_A : Boolean = false,
        var s10_2_B : Boolean = false,
        var s10_2_C : Boolean = false,
                //10.2.1
        var s10_2_1 : String = "",
                //10.3
        var s10_3 : Boolean = false,
        )