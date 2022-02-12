package pt.ulusofona.tfc.trabalho.dao

import java.util.*
import javax.persistence.*

@Entity
data class S1Formulario(
        @Id @GeneratedValue
        //secção 1
        val id: Long = 0,
        var estado : String = "",
        var lastUpdate : Date,
        var comarca : String = "",
        var juizo : String = "",

        @Column(length = 50, unique = true)
        var processId: String = ""
        )