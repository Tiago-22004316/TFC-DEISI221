package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S4Formulário(
        @Id @GeneratedValue
        //secção 4
                //4.1
        var s4_1_A : Boolean = false,
        var s4_1_A_s : Boolean = false,
        var s4_1_A_n : Boolean = false,
        var s4_1_B : Boolean = false,
        var s4_1_B_f : String = "",
                //4.2
        var s4_2_A : Boolean = false,
        var s4_2_B : Boolean = false,
        var s4_2_B_f : String = "",
        var s4_2_1_A : Boolean = false,
        var s4_2_1_B : Boolean = false,
        var s4_2_1_B_f : String = "",
                //4.3
        var s4_3_1 : Boolean = false,
        var s4_3_2 : Boolean = false,
        var s4_3_3 : Boolean = false,
                //4.3.3
        var s4_3_3_A : Boolean = false,
        var s4_3_3_A_f : String = "",
        var s4_3_3_B : Boolean = false,
        var s4_3_3_B_f : String = "",
        var s4_3_3_C : Boolean = false,
        var s4_3_3_C_f : String = "",
                //4.3.4
        var s4_3_4 : Boolean = false,
        var s4_3_4_A : Boolean = false,
        var s4_3_4_B : Boolean = false,
        var s4_3_4_C : Boolean = false,
        var s4_3_4_D : Boolean = false,
        var s4_3_4_E : Boolean = false,
        var s4_3_4_F : Boolean = false,
        var s4_3_4_G : Boolean = false,
        var s4_3_4_H : Boolean = false,
        var s4_3_4_I : Boolean = false,
        var s4_3_4_J : Boolean = false,
        var s4_3_4_J_f : String = "",
                //4.4
        var s4_4 : Boolean = false,
        var s4_4_f : String = "",
                //4.5
        var s4_5_1 : Boolean = false,
        var s4_5_2 : Boolean = false,
                //4.5.2
        var s4_5_2_A : Boolean = false,
        var s4_5_2_B : Boolean = false,
        var s4_5_2_C : Boolean = false,
        var s4_5_2_1 : String = "",
                //4.5.3
        var s4_5_3 : Boolean = false,
                //4.6
        var s4_6_A : Boolean = false,
        var s4_6_B : Boolean = false,
        var s4_6_C : Boolean = false,
        var s4_6_D : Boolean = false,
        var s4_6_1_f : String = "",
        ) {

}