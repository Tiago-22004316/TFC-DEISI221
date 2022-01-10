package pt.ulusofona.tfc.trabalho.form

import javax.validation.constraints.Min
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull


data class FormularioForm(

        @field:NotEmpty(message = "Erro: O número do processo tem que estar preenchido")
        var processId: String? = null,
        var s2_A : Boolean = false,
        var s2_B : Boolean = false,
        //secção 3
        var s3_1 : String = "",
        var s3_2 : String = "",
        var s3_3 : String = "",
        var s3_4_A : Boolean = false,
        var s3_4_B : Boolean = false,
        var s3_4_1 : String = "",
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
        //secção 5
        var s5_A : Boolean = false,
        var s5_B : Boolean = false,
        var s5_B_1 : String = "",
        //secção 6
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
        //7.2
        var s7_2 : Boolean = false,
        //7.2.1
        var s7_2_1_A : Boolean = false,
        var s7_2_1_B : Boolean = false,
        var s7_2_1_B_f : String = "",
        var s7_2_1_C : Boolean = false,
        var s7_2_1_C_f : String = "",
        //7.2.2
        var s7_2_2_A : Boolean = false,
        var s7_2_2_B : Boolean = false,
        var s7_2_2_C : Boolean = false,
        var s7_2_2_D : Boolean = false,
        var s7_2_2_E : Boolean = false,
        var s7_2_2_F : Boolean = false,
        var s7_2_2_G : Boolean = false,
        var s7_2_2_H : Boolean = false,
        var s7_2_2_I : Boolean = false,
        var s7_2_2_I_f : String = "",
        var s7_2_2_J : Boolean = false,
        var s7_2_2_J_f : String = "",
        var s7_2_2_L : Boolean = false,
        var s7_2_2_L_f : String = "",
        var s7_2_2_M : Boolean = false,
        var s7_2_2_M_f : String = "",
        //7.3
        var s7_3 : Boolean = false,
        //7.3.1
        var s7_3_1_A : Boolean = false,
        var s7_3_1_A_f : String = "",
        var s7_3_1_B : Boolean = false,
        var s7_3_1_B_f : String = "",
        //7.3.2
        var s7_3_2_A : Boolean = false,
        var s7_3_2_B : Boolean = false,
        var s7_3_2_C : Boolean = false,
        var s7_3_2_D : Boolean = false,
        var s7_3_2_E : Boolean = false,
        var s7_3_2_F : Boolean = false,
        var s7_3_2_G : Boolean = false,
        var s7_3_2_H : Boolean = false,
        var s7_3_2_I : Boolean = false,
        var s7_3_2_I_f : String = "",
        var s7_3_2_J : Boolean = false,
        var s7_3_2_J_f : String = "",
        var s7_3_2_L : Boolean = false,
        var s7_3_2_L_f : String = "",
        var s7_3_2_M : Boolean = false,
        var s7_3_2_M_f : String = "",
        //7.4
        var s7_4 : Boolean = false,
        //7.4.1
        var s7_4_1_A : Boolean = false,
        var s7_4_1_B : Boolean = false,
        var s7_4_1_B_f : String = "",
        //7.4.2
        var s7_4_2_A : Boolean = false,
        var s7_4_2_B : Boolean = false,
        var s7_4_2_C : Boolean = false,
        var s7_4_2_D : Boolean = false,
        var s7_4_2_E : Boolean = false,
        var s7_4_2_F : Boolean = false,
        var s7_4_2_G : Boolean = false,
        var s7_4_2_H : Boolean = false,
        var s7_4_2_I : Boolean = false,
        var s7_4_2_I_f : String = "",
        var s7_4_2_J : Boolean = false,
        var s7_4_2_J_f : String = "",
        var s7_4_2_L : Boolean = false,
        var s7_4_2_L_f : String = "",
        var s7_4_2_M : Boolean = false,
        var s7_4_2_M_f : String = "",
        var s7_4_2_O : Boolean = false,
        //7.5
        var s7_5 : Boolean = false,
        var s7_5_A : Boolean = false,
        var s7_5_B : Boolean = false,
        var s7_5_C : Boolean = false,
        var s7_5_D : Boolean = false,
        var s7_5_E : Boolean = false,
        var s7_5_F : Boolean = false,
        var s7_5_G : Boolean = false,
        var s7_5_H : Boolean = false,
        var s7_5_H_f : String = "",
        var s7_5_I : Boolean = false,
        var s7_5_I_f : String = "",
        var s7_5_J : Boolean = false,
        var s7_5_J_f : String = "",
        var s7_5_L : Boolean = false,
        var s7_5_L_f : String = "",
        //secção 8
        var s8 : String = "",
        //secção 9
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
        var s9_4_B_f : String = "",
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

        //secção 10
        //10.1
        var s10_1_a : Boolean = false,
        var s10_1_b : Boolean = false,
        var s10_1_c : Boolean = false,
        var s10_1_d : Boolean = false,
        var s10_1_e : Boolean = false,
        var s10_1_F : Boolean = false,
        var s10_1_F_f : String = "",
        //10.2
        var s10_2 : String = "",
        //10.3
        var s10_3_1 : String = "",
        var s10_3_2 : String = "",

        //secção 11
        //11.1
        var s11_1 : String = "",

        //secção 12
        //12.1
        var s12_1_a : Boolean = false,
        var s12_1_b : Boolean = false,
        var s12_1_c : Boolean = false,
        var s12_1_d : Boolean = false,
        var s12_1_e : Boolean = false,
        //12.1.1
        var s12_1_1 : String = "",
        //12.1.2
        var s12_1_2_a : Boolean = false,
        var s12_1_2_b : Boolean = false,
        var s12_1_2_f : String = "",
        //12.2
        var s12_2_a : Boolean = false,
        var s12_2_b : Boolean = false,
        var s12_2_c : Boolean = false,
        var s12_2_d : Boolean = false,
        var s12_2_e : Boolean = false,
        //12.2.1
        var s12_2_1 : String = "",
        //12.2.2
        var s12_2_2_a : Boolean = false,
        var s12_2_2_b : Boolean = false,
        var s12_2_2_f : String = "",
        //12.3
        var s12_3_a : Boolean = false,
        var s12_3_b : Boolean = false,
        var s12_3_c : Boolean = false,
        var s12_3_d : Boolean = false,
        var s12_3_e : Boolean = false,
        //12.3.1
        var s12_3_1 : String = "",
        //12.3.2
        var s12_3_2_a : Boolean = false,
        var s12_3_2_b : Boolean = false,
        var s12_3_2_f : String = "",
        //12.4
        var s12_4_a : Boolean = false,
        var s12_4_b : Boolean = false,
        var s12_4_1_a: Boolean = false,
        var s12_4_1_b : Boolean = false,

        /*//secção 13
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
        var s13_3_q : Boolean = false,*/
)