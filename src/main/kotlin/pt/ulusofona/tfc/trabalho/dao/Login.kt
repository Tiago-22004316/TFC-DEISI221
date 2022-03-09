package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.*

@Entity
data class Login(
        @Id @GeneratedValue
        //secção 1
        val id: Long = 0,
        var username : String = "",
        )