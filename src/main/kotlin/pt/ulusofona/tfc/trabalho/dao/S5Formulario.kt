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
        var s5_2_a : Boolean = false,
        var s5_2_b : Boolean = false,
                //5.3
        var s5_3_a : Boolean = false,
        var s5_3_b : Boolean = false,
        var s5_3_c : Boolean = false,
        var s5_3_d : Boolean = false,
                //5.4
        var s5_4_a : Boolean = false,
        var s5_4_b : Boolean = false,
        var s5_4_c : Boolean = false,
        var s5_4_d : Boolean = false,
        var s5_4_d_f: String = "",
                //5.5
        var s5_5_a : Boolean = false,
        var s5_5_b : Boolean = false,
        var s5_5_c : Boolean = false,
        var s5_5_d : Boolean = false,
        var s5_5_e : Boolean = false,
        var s5_5_F : Boolean = false,
        var s5_5_g : Boolean = false,
        var s5_5_h : Boolean = false,
        var s5_5_i : Boolean = false,
        var s5_5_j : Boolean = false,
        var s5_5_l : Boolean = false,
                //5.6
        var s5_6_a : Boolean = false,
        var s5_6_b : Boolean = false,
        var s5_6_c : Boolean = false,
        var s5_6_d : Boolean = false,
        var s5_6_e : Boolean = false,
        var s5_6_F : Boolean = false,
        var s5_6_g : Boolean = false,
        var s5_6_h : Boolean = false,
        var s5_6_i : Boolean = false,
        var s5_6_i_f : String = "",
                //5.6.1
        var s5_6_1_a : Boolean = false,
        var s5_6_1_b : Boolean = false,
        var s5_6_1_c : Boolean = false,
        var s5_6_1_d : Boolean = false,
        var s5_6_1_e : Boolean = false,
        var s5_6_1_F : Boolean = false,
        var s5_6_1_g : Boolean = false,
        var s5_6_1_h : Boolean = false,
        var s5_6_1_i : Boolean = false,
        var s5_6_1_j : Boolean = false,
        var s5_6_1_l : Boolean = false,
        var s5_6_1_m : Boolean = false,
        var s5_6_1_n : Boolean = false,
        var s5_6_1_o : Boolean = false,
        var s5_6_1_p : Boolean = false,
        var s5_6_1_q : Boolean = false,
)