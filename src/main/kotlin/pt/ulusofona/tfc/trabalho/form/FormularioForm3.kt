package pt.ulusofona.tfc.trabalho.form

import javax.validation.constraints.Min
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

//124
data class FormularioForm3(

        var processId: String = "",
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

        //secção 13
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