package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.*

@Entity
data class S1Formulario(
        //secção 1
        @Id @GeneratedValue
        val id: Long = 0,
        var username : String = "",
        var estado : String = "Em edição",
        var lastUpdate : String = "",
        var comarca : String = "",
        var juizo : String = "",
        var s1_2_A : Boolean = false,
        var s1_2_B : Boolean = false,
        var s1_2_B_f : String = "",
        var duracaoData1 : Long = 0,
        var duracaoData2 : Long = 0,
        var duracaoMediaData1 : Long = 0,
        var duracaoMediaData2 : Long = 0,

        @Column(length = 50, unique = true)
        var processId: String = ""
        )