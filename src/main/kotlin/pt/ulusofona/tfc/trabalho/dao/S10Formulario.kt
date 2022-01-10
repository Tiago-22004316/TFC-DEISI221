package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S10Formulario(
        @Id @GeneratedValue
        //secção 10
        val id: Long = 0,
                //10.1
        var s10_1_a : Boolean = false,
        var s10_1_b : Boolean = false,
        var s10_1_c : Boolean = false,
        var s10_1_d : Boolean = false,
        var s10_1_e : Boolean = false,
        var s10_1_F : Boolean = false,
        var s10_1_F_f : String = "",
                //10.2
        var s10_2 : String = "",
                //10.3
        var s10_3_1 : String = "",
        var s10_3_2 : String = "",

        )