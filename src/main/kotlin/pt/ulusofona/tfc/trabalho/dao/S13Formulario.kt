package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S13Formulario(
        @Id @GeneratedValue
       //secção 13
        val id: Long = 0,

        @Column(length = 50, unique = true)
        var processId: String = "",
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
)