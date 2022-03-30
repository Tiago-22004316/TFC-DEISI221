package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S15Formulario(
        @Id @GeneratedValue
       //secção 15
        val id: Long = 0,

        @Column(length = 50, unique = true)
        var processId: String = "",
                //15
        @Column(length = 2000)
        var s15 : String = ""
)