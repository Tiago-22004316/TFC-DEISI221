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
        var s5_6_1_R : Boolean = false,
        var s5_6_1_S : Boolean = false,
        var s5_6_1_T : Boolean = false,
        var s5_6_1_U : Boolean = false,
        var s5_6_1_V : Boolean = false,

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