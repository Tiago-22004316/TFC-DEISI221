package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S3Formulario(
        @Id @GeneratedValue
        //secção 3
        val id: Long = 0,

        @Column(length = 50, unique = true)
        var processId: String = "",
                //3.1
        var s3_1 : String = "",
                //3.2
        var s3_2 : String = "",
                //3.3
        var s3_3 : String = "",
                //3.4
        var s3_4 : Boolean = false,
        var s3_4_A : Boolean = false,
        var s3_4_B : Boolean = false,
                //3.4.1
        var s3_4_1 : String = "",
                //3.4.2
        var s3_4_2 : Boolean = false,
        )