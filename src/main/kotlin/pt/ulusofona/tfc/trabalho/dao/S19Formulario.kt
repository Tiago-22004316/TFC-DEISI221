package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S19Formulario(
        @Id @GeneratedValue
       //secção 19
        val id: Long = 0,

        @Column(length = 50, unique = true)
        var processId: String = "",
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
)