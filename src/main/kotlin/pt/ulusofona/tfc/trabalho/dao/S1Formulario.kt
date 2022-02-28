package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.*

@Entity
data class S1Formulario(
        @Id @GeneratedValue
        //secção 1
        val id: Long = 0,
        var estado : String = "Em edição",
        var lastUpdate : String = "",
        var comarca : String = "",
        var juizo : String = "",
        var s1_2_A : Boolean = false,
        var s1_2_B : Boolean = false,
        var s1_2_B_f : String = "",

        @Column(length = 50, unique = true)
        var processId: String = ""
        )