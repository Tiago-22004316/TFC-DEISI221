package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S6Formulario(
        @Id @GeneratedValue
        //secção 6
        val id: Long = 0,
                //6.0
        var s6_A : Boolean = false,
        var s6_B : Boolean = false,
        var s6_C : Boolean = false,
        var s6_D : Boolean = false,
        var s6_E : Boolean = false,
        var s6_E_f : String = "",
        var s6_F : Boolean = false,
                //6.1
        var s6_1_A : Boolean = false,
        var s6_1_B : Boolean = false,
        var s6_1_B_f : String = "",
                //6.2
        var s6_2 : Boolean = false,
        var s6_2_f : String = "",
                //6.3
        var s6_3 : Boolean = false,
        var s6_3_f : String = "",
                //6.4
        var s6_4 : Boolean = false,
                //6.4.1
        var s6_4_1_A : Boolean = false,
        var s6_4_1_B : Boolean = false,
                //6.4.2
        var s6_4_2_A : Boolean = false,
        var s6_4_2_B : Boolean = false,
        var s6_4_2_B_f : String = "",
                //6.5
        var s6_5 : Boolean = false,
                //6.6
        var s6_6 : Boolean = false,
        var s6_6_f : String = "",
        )