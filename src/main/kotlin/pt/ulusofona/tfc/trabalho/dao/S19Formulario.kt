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
        var s19_1_A : Boolean = false,
        var s19_1_B : Boolean = false,
        var s19_1_C : Boolean = false,
        var s19_1_D : Boolean = false,
        var s19_1_E : Boolean = false,
        var s19_1_F : Boolean = false,
        var s19_1_F_f : String = "",
                //19.1.1
        var s19_1_1 : String = "",
                //19.2.1
        var s19_2_1 : String = "",
        var s19_2_2 : String = "",
)