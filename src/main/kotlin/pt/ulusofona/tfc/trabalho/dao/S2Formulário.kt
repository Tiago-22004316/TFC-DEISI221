package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S2Formulário(
        @Id @GeneratedValue
        //secção 2
        var s2_A : Boolean,
        var s2_B : Boolean,
        ) {

}