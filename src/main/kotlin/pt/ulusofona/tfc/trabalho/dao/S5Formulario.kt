package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S5Formulario(
        @Id @GeneratedValue
        //secção 5
        val id: Long = 0,

        @Column(length = 50, unique = true)
        var processId: String = "",
                //5.1.1
        var s5_1_1_A : Boolean = false,
        var s5_1_1_B : Boolean = false,
                //5.1.2
        var s5_1_2_A : Boolean = false,
        var s5_1_2_B : Boolean = false,
        var s5_1_2_C : Boolean = false,
        var s5_1_2_D : Boolean = false,
        var s5_1_2_E : Boolean = false,
                //5.1.3
        var s5_1_3_A : Boolean = false,
        var s5_1_3_B : Boolean = false,
        var s5_1_3_C : Boolean = false,
        var s5_1_3_D : Boolean = false,
        var s5_1_3_D_f: String = "",
                //5.1.4
        var s5_1_4_A : Boolean = false,
        var s5_1_4_B : Boolean = false,
        var s5_1_4_C : Boolean = false,
        var s5_1_4_D : Boolean = false,
        var s5_1_4_E : Boolean = false,
        var s5_1_4_F : Boolean = false,
        var s5_1_4_G : Boolean = false,
        var s5_1_4_H : Boolean = false,
        var s5_1_4_I : Boolean = false,
        var s5_1_4_J : Boolean = false,
        var s5_1_4_L : Boolean = false,
                //5.2
        var s5_2_A : Boolean = false,
        var s5_2_B : Boolean = false,
        var s5_2_C : Boolean = false,
        var s5_2_D : Boolean = false,
        var s5_2_E : Boolean = false,
        var s5_2_F : Boolean = false,
        var s5_2_G : Boolean = false,
        var s5_2_H : Boolean = false,
        var s5_2_I : Boolean = false,
        var s5_2_I_f : String = "",
                //5.3
        var s5_3_A : Boolean = false,
        var s5_3_B : Boolean = false,
        var s5_3_C : Boolean = false,
        var s5_3_D : Boolean = false,
        var s5_3_E : Boolean = false,
        var s5_3_F : Boolean = false,
        var s5_3_G : Boolean = false,
        var s5_3_H : Boolean = false,
        var s5_3_I : Boolean = false,
        var s5_3_J : Boolean = false,
        var s5_3_L : Boolean = false,
        var s5_3_M : Boolean = false,
        var s5_3_N : Boolean = false,
        var s5_3_O : Boolean = false,
        var s5_3_P : Boolean = false,
        var s5_3_Q : Boolean = false,
        var s5_3_R : Boolean = false,
        var s5_3_S : Boolean = false,
        var s5_3_T : Boolean = false,
        var s5_3_U : Boolean = false,
        var s5_3_V : Boolean = false,
)