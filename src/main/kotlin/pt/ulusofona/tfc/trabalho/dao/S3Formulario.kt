package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S3Formulario(
        @Id @GeneratedValue
        //secção 3
        var s3_1 : String = "",
        var s3_2 : String = "",
        var s3_3 : String = "",
        var s3_4 : Boolean = false,
        var s3_4_1 : String = "",

        ) {

}