package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class S21Formulario(
        @Id @GeneratedValue
       //secção 21
        val id: Long = 0,

        @Column(length = 50, unique = true)
        var processId: String = "",
                //21.1
        var s21_1_A : Boolean = false,
        var s21_1_B : Boolean = false,
        var s21_1_C : Boolean = false,
        var s21_1_D: Boolean = false,
        var s21_1_E : Boolean = false,
                //21.1.1
        @Column(length = 2000)
        var s21_1_1 : String = "",
                //21.1.2
        var s21_1_2_A : Boolean = false,
        var s21_1_2_B : Boolean = false,
        @Column(length = 2000)
        var s21_1_2_B_f : String = "",
                //21.2
        var s21_2_A : Boolean = false,
        var s21_2_B : Boolean = false,
        var s21_2_C : Boolean = false,
        var s21_2_D : Boolean = false,
        var s21_2_E : Boolean = false,
                //21.2.1
        @Column(length = 2000)
        var s21_2_1 : String = "",
                //21.2.2
        var s21_2_2_A : Boolean = false,
        var s21_2_2_B : Boolean = false,
        @Column(length = 2000)
        var s21_2_2_B_f : String = "",
                //21.3
        var s21_3_A : Boolean = false,
        var s21_3_B : Boolean = false,
        var s21_3_C : Boolean = false,
        var s21_3_D : Boolean = false,
        var s21_3_E : Boolean = false,
                //21.3.1
        @Column(length = 2000)
        var s21_3_1 : String = "",
                //21.3.2
        var s21_3_2_A : Boolean = false,
        var s21_3_2_B : Boolean = false,
        @Column(length = 2000)
        var s21_3_2_B_f : String = "",
                //21.4
        var s21_4_A : Boolean = false,
        var s21_4_B : Boolean = false,
        var s21_4_1_A: Boolean = false,
        var s21_4_1_B : Boolean = false,
)