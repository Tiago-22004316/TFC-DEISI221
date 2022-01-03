package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S1Formulário(
        @Id @GeneratedValue
        //secção 1
        val id: Long = 0,
        var processId: String,
        ) {

}