package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S20Formulario(
        @Id @GeneratedValue
       //secção 13
        val id: Long = 0,

        @Column(length = 50, unique = true)
        var processId: String = "",
                //20.1
        var s20_1 : String = "",

)