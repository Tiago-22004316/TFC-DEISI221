package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S18Formulario(
        @Id @GeneratedValue
       //secção 13
        val id: Long = 0,
        var processId: String = "",
           //18.1
        var s18_1 : Boolean = false,
        var s18_1_A : Boolean = false,
        var s18_1_B : Boolean = false,
        var s18_1_C : Boolean = false,
        var s18_1_D : Boolean = false,
        var s18_1_E : Boolean = false,
        var s18_1_E_f : String = "",
            //18.2
        var s18_2 : Boolean = false,
        var s18_2_A : Boolean = false,
        var s18_2_B : Boolean = false,
        var s18_2_C : Boolean = false,
        var s18_2_D : Boolean = false,
        var s18_2_E : Boolean = false,
        var s18_2_F : Boolean = false,
        var s18_2_G : Boolean = false,
        var s18_2_G_f : String = "",
                //18.3
        var s18_3_A : Boolean = false,
        var s18_3_B : Boolean = false,
        var s18_3_B_f : String = "",
                //18.4
        var s18_4 : Boolean = false,
        var s18_4_A : Boolean = false,
        var s18_4_B : Boolean = false,
        var s18_4_C : Boolean = false,
        var s18_4_C_f : String = "",
        var s18_4_D : Boolean = false,
        var s18_4_D_f : String = "",
        var s18_4_E : Boolean = false,
        var s18_4_E_f : String = "",
        var s18_4_F : Boolean = false,
        var s18_4_F_f : String = "",
                //18.4.1
        var s18_4_1 : String = "",
)