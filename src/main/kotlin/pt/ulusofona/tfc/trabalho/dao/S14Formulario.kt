package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S14Formulario(
        @Id @GeneratedValue
       //secção 14
        val id: Long = 0,
        var processId: String = "",
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