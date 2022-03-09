package pt.ulusofona.tfc.trabalho.form

import java.util.*
import javax.validation.constraints.Min
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size


data class LoginForm(

        var username : String = "",
        var password : String = "",
)