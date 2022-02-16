package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S19Formulario(
        @Id @GeneratedValue
       //secção 19
        val id: Long = 0,

        @Column(length = 50, unique = true)
        var processId: String = "",
        //19.1
        var s19_1 : Boolean = false,
        var s19_1_1 : Boolean = false,
        var s19_1_2 : Boolean = false,
        var s19_1_3 : Boolean = false,
        var s19_1_4 : Boolean = false,
        var s19_1_5 : Boolean = false,
        var s19_1_6 : Boolean = false,
        var s19_1_7 : Boolean = false,
        var s19_1_8 : Boolean = false,
        var s19_1_9 : Boolean = false,
        var s19_1_10 : Boolean = false,
        var s19_1_11 : Boolean = false,
        var s19_1_12 : Boolean = false,
        var s19_1_13 : Boolean = false,
        var s19_1_14 : Boolean = false,
        var s19_1_15 : Boolean = false,
        var s19_1_16 : Boolean = false,
        var s19_1_17 : Boolean = false,
        var s19_1_17_f : String = "",
        //19.2
        var s19_2 : Boolean = false,
        var s19_2_1 : Boolean = false,
        var s19_2_2 : Boolean = false,
        var s19_2_3 : Boolean = false,
        var s19_2_4 : Boolean = false,
        var s19_2_5 : Boolean = false,
        var s19_2_6 : Boolean = false,
        var s19_2_7 : Boolean = false,
        var s19_2_8 : Boolean = false,
        var s19_2_9 : Boolean = false,
        var s19_2_10 : Boolean = false,
        var s19_2_11 : Boolean = false,
        var s19_2_12 : Boolean = false,
        var s19_2_13 : Boolean = false,
        var s19_2_14 : Boolean = false,
        var s19_2_15 : Boolean = false,
        var s19_2_16 : Boolean = false,
        var s19_2_17 : Boolean = false,
        var s19_2_18 : Boolean = false,
        var s19_2_19 : Boolean = false,
        var s19_2_19_f : String = "",
        var s19_2_20 : Boolean = false,
        var s19_2_20_f : String = "",
)