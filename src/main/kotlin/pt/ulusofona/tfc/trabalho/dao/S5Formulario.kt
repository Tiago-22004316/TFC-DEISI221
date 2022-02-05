package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S5Formulario(
        @Id @GeneratedValue
        //secção 5
        val id: Long = 0,
        var processId: String = "",
                //5.2
        var s5_2_A : Boolean = false,
        var s5_2_B : Boolean = false,
                //5.3
        var s5_3_A : Boolean = false,
        var s5_3_B : Boolean = false,
        var s5_3_C : Boolean = false,
        var s5_3_D : Boolean = false,
                //5.4
        var s5_4_A : Boolean = false,
        var s5_4_B : Boolean = false,
        var s5_4_C : Boolean = false,
        var s5_4_D : Boolean = false,
        var s5_4_D_f: String = "",
                //5.5
        var s5_5_A : Boolean = false,
        var s5_5_B : Boolean = false,
        var s5_5_C : Boolean = false,
        var s5_5_D : Boolean = false,
        var s5_5_E : Boolean = false,
        var s5_5_F : Boolean = false,
        var s5_5_G : Boolean = false,
        var s5_5_H : Boolean = false,
        var s5_5_I : Boolean = false,
        var s5_5_J : Boolean = false,
        var s5_5_L : Boolean = false,
                //5.6
        var s5_6_A : Boolean = false,
        var s5_6_B : Boolean = false,
        var s5_6_C : Boolean = false,
        var s5_6_D : Boolean = false,
        var s5_6_E : Boolean = false,
        var s5_6_F : Boolean = false,
        var s5_6_G : Boolean = false,
        var s5_6_H : Boolean = false,
        var s5_6_I : Boolean = false,
        var s5_6_I_f : String = "",
                //5.6.1
        var s5_6_1_A : Boolean = false,
        var s5_6_1_B : Boolean = false,
        var s5_6_1_C : Boolean = false,
        var s5_6_1_D : Boolean = false,
        var s5_6_1_E : Boolean = false,
        var s5_6_1_F : Boolean = false,
        var s5_6_1_G : Boolean = false,
        var s5_6_1_H : Boolean = false,
        var s5_6_1_I : Boolean = false,
        var s5_6_1_J : Boolean = false,
        var s5_6_1_L : Boolean = false,
        var s5_6_1_M : Boolean = false,
        var s5_6_1_N : Boolean = false,
        var s5_6_1_O : Boolean = false,
        var s5_6_1_P : Boolean = false,
        var s5_6_1_Q : Boolean = false,
)