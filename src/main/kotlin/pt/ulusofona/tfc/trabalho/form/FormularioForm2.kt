package pt.ulusofona.tfc.trabalho.form

import javax.validation.constraints.Min
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull


data class FormularioForm2(

        var processId: String = "",
        //secção 8
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

        //secção 9
        //9.1
        //9.1.1
        var s9_1_1 : Boolean = false,
        var s9_1_1_A : Boolean = false,
        var s9_1_1_B : Boolean = false,
        var s9_1_1_B_f : String = "",
        //9.2
        var s9_2_A : Boolean = false,
        var s9_2_B : Boolean = false,
        var s9_2_C : Boolean = false,
        var s9_2_D : Boolean = false,
        var s9_2_E : Boolean = false,
        var s9_2_F : Boolean = false,
        var s9_2_G : Boolean = false,
        var s9_2_H : Boolean = false,
        var s9_2_I : Boolean = false,
        var s9_2_I_f : String = "",
        var s9_2_J : Boolean = false,
        var s9_2_J_f : String = "",
        var s9_2_L : Boolean = false,
        var s9_2_L_f : String = "",
        var s9_2_M : Boolean = false,
        var s9_2_M_f : String = "",

        //secção 10
        //10.1
        var s10_1 : Boolean = false,
        //10.2
        var s10_2 : Boolean = false,
        var s10_2_A : Boolean = false,
        var s10_2_B : Boolean = false,
        var s10_2_C : Boolean = false,
        //10.2.1
        var s10_2_1 : String = "",
        //10.3
        var s10_3 : Boolean = false,

        //secção 11
        //11.1
        var s11_1_A : Boolean = false,
        var s11_1_B : Boolean = false,
        var s11_1_B_f : String = "",
        var s11_1_C : Boolean = false,
        var s11_1_C_f : String = "",
        //11.2
        var s11_2_A : Boolean = false,
        var s11_2_B : Boolean = false,
        var s11_2_C : Boolean = false,
        var s11_2_D : Boolean = false,
        var s11_2_E : Boolean = false,
        var s11_2_F : Boolean = false,
        var s11_2_G : Boolean = false,
        var s11_2_H : Boolean = false,
        var s11_2_I : Boolean = false,
        var s11_2_I_f : String = "",
        var s11_2_J : Boolean = false,
        var s11_2_J_f : String = "",
        var s11_2_L : Boolean = false,
        var s11_2_L_f : String = "",
        var s11_2_M : Boolean = false,
        var s11_2_M_f : String = "",

        //secção 12
        var s12_A : Boolean = false,
        var s12_B : Boolean = false,
        var s12_C : Boolean = false,
        var s12_D : Boolean = false,
        var s12_D_f : String = "",

        //secção 13
        //13.1
        var s13_1_A : Boolean = false,
        var s13_1_B : Boolean = false,
        var s13_1_B_f : String = "",
        //13.2
        var s13_2_A : Boolean = false,
        var s13_2_B : Boolean = false,
        var s13_2_C : Boolean = false,
        var s13_2_D : Boolean = false,
        var s13_2_E : Boolean = false,
        var s13_2_F : Boolean = false,
        var s13_2_G : Boolean = false,
        var s13_2_H : Boolean = false,
        var s13_2_I : Boolean = false,
        var s13_2_J : Boolean = false,
        var s13_2_J_f : String = "",
        var s13_2_L : Boolean = false,
        var s13_2_L_f : String = "",
        var s13_2_M : Boolean = false,
        var s13_2_M_f : String = "",
        var s13_2_N : Boolean = false,
        var s13_2_N_f : String = "",
        var s13_2_O : Boolean = false,

        //secção 14
        //14
        var s14_A : Boolean = false,
        var s14_B : Boolean = false,
        var s14_C : Boolean = false,
        var s14_D : Boolean = false,
        var s14_E : Boolean = false,
        var s14_F : Boolean = false,
        var s14_G : Boolean = false,
        var s14_H : Boolean = false,
        var s14_H_f : String = "",
        var s14_I : Boolean = false,
        var s14_I_f : String = "",
        var s14_J : Boolean = false,
        var s14_J_f : String = "",
        var s14_L : Boolean = false,
        var s14_L_f : String = "",
)