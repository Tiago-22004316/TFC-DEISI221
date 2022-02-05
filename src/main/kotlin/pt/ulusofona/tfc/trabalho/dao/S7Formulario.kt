package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S7Formulario(
        @Id @GeneratedValue
        //secção 7
        val id: Long = 0,
        var processId: String = "",
                //7.1
        var s7_1 : Boolean = false,
        var s7_1_A : Boolean = false,
        var s7_1_B : Boolean = false,
        var s7_1_C : Boolean = false,
        var s7_1_D : Boolean = false,
        var s7_1_E : Boolean = false,
        var s7_1_F : Boolean = false,
        var s7_1_G : Boolean = false,
        var s7_1_H : Boolean = false,
        var s7_1_I : Boolean = false,
        var s7_1_I_f : String = "",
        var s7_1_J : Boolean = false,
        var s7_1_J_f : String = "",
        var s7_1_L : Boolean = false,
        var s7_1_L_f : String = "",
        var s7_1_M : Boolean = false,
        var s7_1_M_f : String = "",
        )