package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S20Formulario(
        @Id @GeneratedValue
        //secção 20
        val id: Long = 0,

        @Column(length = 50, unique = true)
        var processId: String = "",
        //20.1
        var s20_1_A : Boolean = false,
        var s20_1_B : Boolean = false,
        var s20_1_C : Boolean = false,
        var s20_1_D : Boolean = false,
        var s20_1_E : Boolean = false,
        var s20_1_F : Boolean = false,
        var s20_1_F_f : String = "",
        //20.1.1
        var s20_1_1 : String = "",
        //20.2
        var s20_2 : String = "",
        var s20_2_1 : String = "",

)