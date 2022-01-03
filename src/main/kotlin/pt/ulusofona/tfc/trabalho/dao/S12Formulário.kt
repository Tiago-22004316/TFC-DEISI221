package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S12Formulário(
        @Id @GeneratedValue
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
        ) {

}