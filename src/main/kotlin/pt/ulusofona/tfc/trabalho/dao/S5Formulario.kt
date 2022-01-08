package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S5Formulario(
        @Id @GeneratedValue
        //secção 5
        var s5_A : Boolean = false,
        var s5_B : Boolean = false,
        var s5_B_1 : String,
        ) {

}