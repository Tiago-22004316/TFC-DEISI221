package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S9Formulario(
        @Id @GeneratedValue
        //secção 9
        val id: Long = 0,
        var processId: String,
                //9.1
        var s9_1 : Boolean = false,
        var s9_1_A : Boolean = false,
        var s9_1_B : Boolean = false,
        var s9_1_C : Boolean = false,
        var s9_1_D : Boolean = false,
        var s9_1_E : Boolean = false,
        var s9_1_E_f : String = "",
                //9.2
        var s9_2 : Boolean = false,
        var s9_2_A : Boolean = false,
        var s9_2_B : Boolean = false,
        var s9_2_C : Boolean = false,
        var s9_2_D : Boolean = false,
        var s9_2_E : Boolean = false,
        var s9_2_F : Boolean = false,
        var s9_2_G : Boolean = false,
        var s9_2_G_f : String = "",
                //9.3
        var s9_3 : Boolean = false,
        var s9_3_A : Boolean = false,
        var s9_3_B : Boolean = false,
        var s9_3_B_f : String = "",
                //9.4
        var s9_4 : Boolean = false,
        var s9_4_A : Boolean = false,
        var s9_4_B : Boolean = false,
        var s9_4_C : Boolean = false,
        var s9_4_C_f : String = "",
        var s9_4_D : Boolean = false,
        var s9_4_D_f : String = "",
        var s9_4_E : Boolean = false,
        var s9_4_E_f : String = "",
        var s9_4_F : Boolean = false,
        var s9_4_F_f : String = "",
                //9.4.1
        var s9_4_1 : String = "",
        )