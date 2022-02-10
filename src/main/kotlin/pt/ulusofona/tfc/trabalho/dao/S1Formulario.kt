package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.*

@Entity
data class S1Formulario(
        @Id @GeneratedValue
        //secção 1
        val id: Long = 0,

        @Column(length = 50, unique = true)
        var processId: String = ""
        )