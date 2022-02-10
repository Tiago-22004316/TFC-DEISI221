package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S17Formulario(
        @Id @GeneratedValue
       //secção 17
        val id: Long = 0,

        @Column(length = 50, unique = true)
        var processId: String = "",
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
)