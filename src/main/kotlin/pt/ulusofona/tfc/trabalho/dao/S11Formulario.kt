package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S11Formulario(
        @Id @GeneratedValue
        //secção 11
        val id: Long = 0,

        @Column(length = 50, unique = true)
        var processId: String = "",
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
        )