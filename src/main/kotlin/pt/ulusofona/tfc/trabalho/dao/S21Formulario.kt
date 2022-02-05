package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S21Formulario(
        @Id @GeneratedValue
       //secção 13
        val id: Long = 0,
        var processId: String = "",
                //13.1.2
        var s13_1_2_a : Boolean = false,
        var s13_1_2_b : Boolean = false,
                //13.1.3
        var s13_1_3_a : Boolean = false,
        var s13_1_3_b : Boolean = false,
        var s13_1_3_c : Boolean = false,
        var s13_1_3_d : Boolean = false,
                //13.1.4
        var s13_1_4_a : Boolean = false,
        var s13_1_4_b : Boolean = false,
        var s13_1_4_c : Boolean = false,
        var s13_1_4_d : Boolean = false,
        var s13_1_4_d_f: String = "",
                //13.1.5
        var s13_1_5_a : Boolean = false,
        var s13_1_5_b : Boolean = false,
        var s13_1_5_c : Boolean = false,
        var s13_1_5_d : Boolean = false,
        var s13_1_5_e : Boolean = false,
        var s13_1_5_F : Boolean = false,
        var s13_1_5_g : Boolean = false,
        var s13_1_5_h : Boolean = false,
        var s13_1_5_i : Boolean = false,
        var s13_1_5_j : Boolean = false,
        var s13_1_5_l : Boolean = false,
                //13.2
        var s13_2_a : Boolean = false,
        var s13_2_b : Boolean = false,
        var s13_2_c : Boolean = false,
        var s13_2_d : Boolean = false,
        var s13_2_e : Boolean = false,
        var s13_2_F : Boolean = false,
        var s13_2_g : Boolean = false,
        var s13_2_h : Boolean = false,
        var s13_2_i : Boolean = false,
        var s13_2_i_f : String = "",
                //13.3
        var s13_3_a : Boolean = false,
        var s13_3_b : Boolean = false,
        var s13_3_c : Boolean = false,
        var s13_3_d : Boolean = false,
        var s13_3_e : Boolean = false,
        var s13_3_F : Boolean = false,
        var s13_3_g : Boolean = false,
        var s13_3_h : Boolean = false,
        var s13_3_i : Boolean = false,
        var s13_3_j : Boolean = false,
        var s13_3_l : Boolean = false,
        var s13_3_m : Boolean = false,
        var s13_3_n : Boolean = false,
        var s13_3_o : Boolean = false,
        var s13_3_p : Boolean = false,
        var s13_3_q : Boolean = false,
)