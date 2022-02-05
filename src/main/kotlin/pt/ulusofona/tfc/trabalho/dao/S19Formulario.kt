package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S19Formulario(
        @Id @GeneratedValue
       //secção 19
        val id: Long = 0,
        var processId: String = "",
                //19.1
        var s19_1_a : Boolean = false,
        var s19_1_b : Boolean = false,
        var s10_1_c : Boolean = false,
        var s19_1_d : Boolean = false,
        var s19_1_e : Boolean = false,
        var s19_1_F : Boolean = false,
        var s19_1_F_f : String = "",
                //19.2
        var s19_2 : String = "",
                //19.3
        var s19_3_1 : String = "",
        var s19_3_2 : String = "",
)