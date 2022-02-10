package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S9Formulario(
        @Id @GeneratedValue
        //secção 9
        val id: Long = 0,

        @Column(length = 50, unique = true)
        var processId: String = "",
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
        )