package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S8Formulario(
        @Id @GeneratedValue
        //secção 8
        val id: Long = 0,
        var processId: String = "",
        //var s8 : String = ""
        //8.1
        var s8_1 : Boolean = false,
        //8.2
        var s8_2 : Boolean = false,
        //8.3
        var s8_3 : Boolean = false,
        var s8_3_A : Boolean = false,
        var s8_3_A_f : String = "",
        var s8_3_B : Boolean = false,
        var s8_3_B_f : String = "",
        var s8_3_C : Boolean = false,
        var s8_3_C_f : String = "",
        //8.4
        var s8_4 : Boolean = false,
        var s8_4_A : Boolean = false,
        var s8_4_B : Boolean = false,
        var s8_4_C : Boolean = false,
        var s8_4_D : Boolean = false,
        var s8_4_E : Boolean = false,
        var s8_4_F : Boolean = false,
        var s8_4_G : Boolean = false,
        var s8_4_H : Boolean = false,
        var s8_4_I : Boolean = false,
        var s8_4_J : Boolean = false,
        var s8_4_J_f : String = "",
        //8.5
        var s8_5 : Boolean = false,
        var s8_5_f : String = "",
        )