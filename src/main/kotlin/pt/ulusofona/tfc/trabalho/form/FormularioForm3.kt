package pt.ulusofona.tfc.trabalho.form

import javax.validation.constraints.Min
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

//124
data class FormularioForm3(

        var processId: String = "",
        var submetido: Boolean = false,

        // pode ser "Gravar" ou "Submeter"
        var operation: String = "",

        var edit: Boolean = false,

        //secção 15
        //15
        var s15 : String = "",

        //secção 16
        //16.1
        var s16_1_A : Boolean = false,
        var s16_1_B : Boolean = false,
        var s16_1_B_f : String = "",

        //secção 17
        //17
        var s17_A : Boolean = false,
        var s17_B : Boolean = false,
        var s17_C : Boolean = false,
        var s17_D : Boolean = false,
        var s17_E : Boolean = false,
        var s17_E_f : String = "",
        var s17_F : Boolean = false,
        //17.1
        var s17_1_A : Boolean = false,
        var s17_1_B : Boolean = false,
        var s17_1_B_f : String = "",
        //17.2
        var s17_2 : Boolean = false,
        var s17_2_f : String = "",
        //17.3
        var s17_3 : Boolean = false,
        var s17_3_f : String = "",
        //17.4
        var s17_4 : Boolean = false,
        var s17_4_1_A : Boolean = false,
        var s17_4_1_B : Boolean = false,
        var s17_4_2_A : Boolean = false,
        var s17_4_2_B : Boolean = false,
        var s17_4_2_B_f : String = "",
        //17.5
        var s17_5 : Boolean = false,
        //17.6
        var s17_6 : Boolean = false,
        var s17_6_f : String = "",

        //secção 18
        //18.1
        var s18_1 : Boolean = false,
        var s18_1_A : Boolean = false,
        var s18_1_B : Boolean = false,
        var s18_1_C : Boolean = false,
        var s18_1_D : Boolean = false,
        var s18_1_E : Boolean = false,
        var s18_1_E_f : String = "",
        //18.2
        var s18_2 : Boolean = false,
        var s18_2_A : Boolean = false,
        var s18_2_B : Boolean = false,
        var s18_2_C : Boolean = false,
        var s18_2_D : Boolean = false,
        var s18_2_E : Boolean = false,
        var s18_2_F : Boolean = false,
        var s18_2_G : Boolean = false,
        var s18_2_G_f : String = "",
        //18.3
        var s18_3_A : Boolean = false,
        var s18_3_B : Boolean = false,
        var s18_3_B_f : String = "",
        //18.4
        var s18_4 : Boolean = false,
        var s18_4_A : Boolean = false,
        var s18_4_B : Boolean = false,
        var s18_4_C : Boolean = false,
        var s18_4_C_f : String = "",
        var s18_4_D : Boolean = false,
        var s18_4_D_f : String = "",
        var s18_4_E : Boolean = false,
        var s18_4_E_f : String = "",
        var s18_4_F : Boolean = false,
        var s18_4_F_f : String = "",
        //18.4.1
        var s18_4_1 : String = "",

        //secção 19
        //19.1
        var s19_1 : Boolean = false,
        var s19_1_A : Boolean = false,
        var s19_1_B : Boolean = false,
        var s19_1_C : Boolean = false,
        var s19_1_D : Boolean = false,
        var s19_1_E : Boolean = false,
        var s19_1_F : Boolean = false,
        var s19_1_G : Boolean = false,
        var s19_1_H : Boolean = false,
        var s19_1_I : Boolean = false,
        var s19_1_J : Boolean = false,
        var s19_1_K : Boolean = false,
        var s19_1_L : Boolean = false,
        var s19_1_M : Boolean = false,
        var s19_1_N : Boolean = false,
        var s19_1_O : Boolean = false,
        var s19_1_P : Boolean = false,
        var s19_1_Q : Boolean = false,
        var s19_1_Q_f : String = "",
        //19.2
        var s19_2 : Boolean = false,
        var s19_2_A : Boolean = false,
        var s19_2_B : Boolean = false,
        var s19_2_C : Boolean = false,
        var s19_2_D : Boolean = false,
        var s19_2_E : Boolean = false,
        var s19_2_F : Boolean = false,
        var s19_2_G : Boolean = false,
        var s19_2_H : Boolean = false,
        var s19_2_I : Boolean = false,
        var s19_2_J : Boolean = false,
        var s19_2_K : Boolean = false,
        var s19_2_L : Boolean = false,
        var s19_2_M : Boolean = false,
        var s19_2_N : Boolean = false,
        var s19_2_O : Boolean = false,
        var s19_2_P : Boolean = false,
        var s19_2_Q : Boolean = false,
        var s19_2_R : Boolean = false,
        var s19_2_S : Boolean = false,
        var s19_2_S_f : String = "",
        var s19_2_T : Boolean = false,
        var s19_2_T_f : String = "",

        //secção 20
        //20.1
        var s20_1_A : Boolean = false,
        var s20_1_B : Boolean = false,
        var s20_1_C : Boolean = false,
        var s20_1_D : Boolean = false,
        var s20_1_E : Boolean = false,
        var s20_1_F : Boolean = false,
        var s20_1_F_f : String = "",
        //20.1.1
        var s20_1_1 : String = "",
        //20.2
        var s20_2 : String = "",
        var s20_2_1 : String = "",

        //secção 21
        //21.1
        var s21_1_A : Boolean = false,
        var s21_1_B : Boolean = false,
        var s21_1_C : Boolean = false,
        var s21_1_D: Boolean = false,
        var s21_1_E : Boolean = false,
        //21.1.1
        var s21_1_1 : String = "",
        //21.1.2
        var s21_1_2_A : Boolean = false,
        var s21_1_2_B : Boolean = false,
        var s21_1_2_B_f : String = "",
        //21.2
        var s21_2_A : Boolean = false,
        var s21_2_B : Boolean = false,
        var s21_2_C : Boolean = false,
        var s21_2_D : Boolean = false,
        var s21_2_E : Boolean = false,
        //21.2.1
        var s21_2_1 : String = "",
        //21.2.2
        var s21_2_2_A : Boolean = false,
        var s21_2_2_B : Boolean = false,
        var s21_2_2_B_f : String = "",
        //21.3
        var s21_3_A : Boolean = false,
        var s21_3_B : Boolean = false,
        var s21_3_C : Boolean = false,
        var s21_3_D : Boolean = false,
        var s21_3_E : Boolean = false,
        //21.3.1
        var s21_3_1 : String = "",
        //21.3.2
        var s21_3_2_A : Boolean = false,
        var s21_3_2_B : Boolean = false,
        var s21_3_2_B_f : String = "",
        //21.4
        var s21_4_A : Boolean = false,
        var s21_4_B : Boolean = false,
        var s21_4_1_A: Boolean = false,
        var s21_4_1_B : Boolean = false,
)