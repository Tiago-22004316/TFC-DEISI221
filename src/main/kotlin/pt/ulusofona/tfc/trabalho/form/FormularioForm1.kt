package pt.ulusofona.tfc.trabalho.form

import javax.validation.constraints.Min
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull


data class FormularioForm1(

        //secção 1
        @field:NotEmpty(message = "Erro: O número do processo tem que estar preenchido")
        var processId: String = "",
        //secção 1
        var s2_A : Boolean = false,
        var s2_B : Boolean = false,
        //secção 3
        //3.1
        var s3_1 : String = "",
        //3.2
        var s3_2 : String = "",
        //3.3
        var s3_3 : String = "",
        //3.4
        var s3_4 : Boolean = false,
        var s3_4_A : Boolean = false,
        var s3_4_B : Boolean = false,
        //3.4.1
        var s3_4_1 : String = "",
        //3.4.2
        var s3_4_2 : Boolean = false,
        //secção 4
        //4.2
        var s4_2 : Boolean = false,
        var s4_2_A : Boolean = false,
        var s4_2_B : Boolean = false,
        //4.3
        var s4_3 : Boolean = false,
        var s4_3_f : String = "",
        //secção 5
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
        //secção 6
        //6
        var s6_A : Boolean = false,
        var s6_B : Boolean = false,
        var s6_B_f : String = "",
        //6.1
        var s6_1_A : Boolean = false,
        var s6_1_B : Boolean = false,
        var s6_1_B_f : String = "",
        //secção 7
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