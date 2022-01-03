package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S8Formulário(
        @Id @GeneratedValue
        //secção 8
        var s8 : String = ""
        ) {

}