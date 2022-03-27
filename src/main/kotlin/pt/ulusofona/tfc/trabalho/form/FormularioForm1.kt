package pt.ulusofona.tfc.trabalho.form

import java.util.*
import javax.validation.constraints.Min
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size


data class FormularioForm1(

        //secção 1
        @field:NotEmpty(message = "Erro: O número do processo têm que estar preenchido")
        @field:Size(max = 50, message = "Erro: O número de processo não pode ter mais do que 50 caracteres")
        var processId: String = "",

        @field:NotEmpty(message = "Erro: A comarca têm que estaer preenchida")
        var comarca : String = "",

        @field:NotEmpty(message = "Erro: O juizo têm que estar preenchido")
        var juizo : String = "",

        var submetido: Boolean = false,

        var username : String = "",

        // pode ser "Gravar" ou "Avançar >>"
        var operation: String = "",
        var edit: Boolean = false,

        //secção 1.2
        var s1_2_A : Boolean = false,
        var s1_2_B : Boolean = false,
        var s1_2_B_f : String = "",

        //secção 2
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
        //4.1.1
        var s4_1_1 : Boolean = false,
        var s4_1_1_A : Boolean = false,
        var s4_1_1_B : Boolean = false,
        //4.1.2
        var s4_1_2 : Boolean = false,
        var s4_1_2_f : String = "",

        //secção 5
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