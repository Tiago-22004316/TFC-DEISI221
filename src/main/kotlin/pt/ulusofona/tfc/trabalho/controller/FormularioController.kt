package pt.ulusofona.tfc.trabalho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.mvc.support.RedirectAttributes
import pt.ulusofona.tfc.trabalho.dao.*
import pt.ulusofona.tfc.trabalho.form.FormularioForm1
import pt.ulusofona.tfc.trabalho.form.FormularioForm2
import pt.ulusofona.tfc.trabalho.form.FormularioForm3
//import pt.ulusofona.tfc.trabalho.form.UserForm
import pt.ulusofona.tfc.trabalho.repository.*
import java.security.Principal
import java.text.SimpleDateFormat
import java.util.*
import javax.validation.Valid
import java.time.LocalDate

@Controller
@RequestMapping("/form")
public class FormularioController(val s1FormularioRepository: S1FormularioRepository,
                                  val s2FormularioRepository: S2FormularioRepository,
                                  val s3FormularioRepository: S3FormularioRepository,
                                  val s4FormularioRepository: S4FormularioRepository,
                                  val s5FormularioRepository: S5FormularioRepository,
                                  val s6FormularioRepository: S6FormularioRepository,
                                  val s7FormularioRepository: S7FormularioRepository,
                                  val s8FormularioRepository: S8FormularioRepository,
                                  val s9FormularioRepository: S9FormularioRepository,
                                  val s10FormularioRepository: S10FormularioRepository,
                                  val s11FormularioRepository: S11FormularioRepository,
                                  val s12FormularioRepository: S12FormularioRepository,
                                  val s13FormularioRepository: S13FormularioRepository,
                                  val s14FormularioRepository: S14FormularioRepository,
                                  val s15FormularioRepository: S15FormularioRepository,
                                  val s16FormularioRepository: S16FormularioRepository,
                                  val s17FormularioRepository: S17FormularioRepository,
                                  val s18FormularioRepository: S18FormularioRepository,
                                  val s19FormularioRepository: S19FormularioRepository,
                                  val s20FormularioRepository: S20FormularioRepository,
                                  val s21FormularioRepository: S21FormularioRepository,)  {

    @GetMapping(value = ["/list"])
    fun listProcesso(model: ModelMap, principal: Principal?): String {

        val processo = s1FormularioRepository.findAll()  // get all users from DB
        model["processo"] = processo

        return "list-forms"
    }

    @GetMapping(value = ["/new"])
    fun createNewForm(model:ModelMap): String {
        model["formularioForm1"] = FormularioForm1()
        model["url"] = "new"
        return "new-formulario-form1"
    }

    @GetMapping(value = ["/edit/{processId}/1"])
    fun showEditForm1(@PathVariable("processId") processId: String, model: ModelMap): String {

        //ir buscar á database
        val s1DB = s1FormularioRepository.findByProcessId(processId)
        val s2DB = s2FormularioRepository.findByProcessId(processId)
        val s3DB = s3FormularioRepository.findByProcessId(processId)
        val s4DB = s4FormularioRepository.findByProcessId(processId)
        val s5DB = s5FormularioRepository.findByProcessId(processId)
        val s6DB = s6FormularioRepository.findByProcessId(processId)
        val s7DB = s7FormularioRepository.findByProcessId(processId)

        // criar forms
        val formularioForm1 = FormularioForm1()

        formularioForm1.processId = processId

        // começar a preencher os forms ( esperar q os campos sejam reajustados )
        if (s1DB != null) {
            formularioForm1.comarca = s1DB.comarca
            formularioForm1.juizo = s1DB.juizo
            formularioForm1.s1_2_A = s1DB.s1_2_A
            formularioForm1.s1_2_B = s1DB.s1_2_B
            formularioForm1.s1_2_B_f = s1DB.s1_2_B_f
        }

        if (s2DB != null) {
            formularioForm1.s2_A = s2DB.s2_A
            formularioForm1.s2_B = s2DB.s2_B
        }

        if (s3DB != null) {
            formularioForm1.s3_1 = s3DB.s3_1
            formularioForm1.s3_2 = s3DB.s3_2
            formularioForm1.s3_3 = s3DB.s3_3
            formularioForm1.s3_4 = s3DB.s3_4
            formularioForm1.s3_4_A = s3DB.s3_4_A
            formularioForm1.s3_4_B = s3DB.s3_4_B
            formularioForm1.s3_4_1 = s3DB.s3_4_1
            formularioForm1.s3_4_2 = s3DB.s3_4_2
        }

        if (s4DB != null) {
            formularioForm1.s4_1_1 = s4DB.s4_1_1
            formularioForm1.s4_1_1_A = s4DB.s4_1_1_A
            formularioForm1.s4_1_1_B = s4DB.s4_1_1_B
            formularioForm1.s4_1_2 = s4DB.s4_1_2
            formularioForm1.s4_1_2_f = s4DB.s4_1_2_f
        }

        if (s5DB != null) {
            formularioForm1.s5_1_1_A = s5DB.s5_1_1_A
            formularioForm1.s5_1_1_B = s5DB.s5_1_1_B
            formularioForm1.s5_1_2_A = s5DB.s5_1_2_A
            formularioForm1.s5_1_2_B = s5DB.s5_1_2_B
            formularioForm1.s5_1_2_C = s5DB.s5_1_2_C
            formularioForm1.s5_1_2_D = s5DB.s5_1_2_D
            formularioForm1.s5_1_2_E = s5DB.s5_1_2_E
            formularioForm1.s5_1_3_A = s5DB.s5_1_3_A
            formularioForm1.s5_1_3_B = s5DB.s5_1_3_B
            formularioForm1.s5_1_3_C = s5DB.s5_1_3_C
            formularioForm1.s5_1_3_D = s5DB.s5_1_3_D
            formularioForm1.s5_1_3_D_f = s5DB.s5_1_3_D_f
            formularioForm1.s5_1_4_A = s5DB.s5_1_4_A
            formularioForm1.s5_1_4_B = s5DB.s5_1_4_B
            formularioForm1.s5_1_4_C = s5DB.s5_1_4_C
            formularioForm1.s5_1_4_D = s5DB.s5_1_4_D
            formularioForm1.s5_1_4_E = s5DB.s5_1_4_E
            formularioForm1.s5_1_4_F = s5DB.s5_1_4_F
            formularioForm1.s5_1_4_G = s5DB.s5_1_4_G
            formularioForm1.s5_1_4_H = s5DB.s5_1_4_H
            formularioForm1.s5_1_4_I = s5DB.s5_1_4_I
            formularioForm1.s5_1_4_J = s5DB.s5_1_4_J
            formularioForm1.s5_1_4_L = s5DB.s5_1_4_L
            formularioForm1.s5_2_A = s5DB.s5_2_A
            formularioForm1.s5_2_B = s5DB.s5_2_B
            formularioForm1.s5_2_C = s5DB.s5_2_C
            formularioForm1.s5_2_D = s5DB.s5_2_D
            formularioForm1.s5_2_E = s5DB.s5_2_E
            formularioForm1.s5_2_F = s5DB.s5_2_F
            formularioForm1.s5_2_G = s5DB.s5_2_G
            formularioForm1.s5_2_H = s5DB.s5_2_H
            formularioForm1.s5_2_I = s5DB.s5_2_I
            formularioForm1.s5_2_I_f = s5DB.s5_2_I_f
            formularioForm1.s5_3_A = s5DB.s5_3_A
            formularioForm1.s5_3_B = s5DB.s5_3_B
            formularioForm1.s5_3_C = s5DB.s5_3_C
            formularioForm1.s5_3_D = s5DB.s5_3_D
            formularioForm1.s5_3_E = s5DB.s5_3_E
            formularioForm1.s5_3_F = s5DB.s5_3_F
            formularioForm1.s5_3_G = s5DB.s5_3_G
            formularioForm1.s5_3_H = s5DB.s5_3_H
            formularioForm1.s5_3_I = s5DB.s5_3_I
            formularioForm1.s5_3_J = s5DB.s5_3_J
            formularioForm1.s5_3_L = s5DB.s5_3_L
            formularioForm1.s5_3_M = s5DB.s5_3_M
            formularioForm1.s5_3_N = s5DB.s5_3_N
            formularioForm1.s5_3_O = s5DB.s5_3_O
            formularioForm1.s5_3_P = s5DB.s5_3_P
            formularioForm1.s5_3_Q = s5DB.s5_3_Q
            formularioForm1.s5_3_R = s5DB.s5_3_R
            formularioForm1.s5_3_S = s5DB.s5_3_S
            formularioForm1.s5_3_T = s5DB.s5_3_T
            formularioForm1.s5_3_U = s5DB.s5_3_U
            formularioForm1.s5_3_V = s5DB.s5_3_V
        }

        if (s6DB != null) {
            formularioForm1.s6_A = s6DB.s6_A
            formularioForm1.s6_B = s6DB.s6_B
            formularioForm1.s6_B_f = s6DB.s6_B_f
            formularioForm1.s6_1_A = s6DB.s6_1_A
            formularioForm1.s6_1_B = s6DB.s6_1_B
            formularioForm1.s6_1_B_f = s6DB.s6_1_B_f
        }

        if (s7DB != null) {
            formularioForm1.s7_1_A = s7DB.s7_1_A
            formularioForm1.s7_1_B = s7DB.s7_1_B
            formularioForm1.s7_1_C = s7DB.s7_1_C
            formularioForm1.s7_1_D = s7DB.s7_1_D
            formularioForm1.s7_1_E = s7DB.s7_1_E
            formularioForm1.s7_1_F = s7DB.s7_1_F
            formularioForm1.s7_1_G = s7DB.s7_1_G
            formularioForm1.s7_1_H = s7DB.s7_1_H
            formularioForm1.s7_1_I = s7DB.s7_1_I
            formularioForm1.s7_1_I_f = s7DB.s7_1_I_f
            formularioForm1.s7_1_J = s7DB.s7_1_J
            formularioForm1.s7_1_J_f = s7DB.s7_1_J_f
            formularioForm1.s7_1_L = s7DB.s7_1_L
            formularioForm1.s7_1_L_f = s7DB.s7_1_L_f
            formularioForm1.s7_1_M = s7DB.s7_1_M
            formularioForm1.s7_1_M_f = s7DB.s7_1_M_f
        }

        //verificar se vai so ler ou editar/criar o form
        if (s1DB != null && s1DB.estado == "Submetido" ) {
            model["formularioForm1"] = formularioForm1

            formularioForm1.edit = true
            formularioForm1.submetido = true
            model["url"] = "edit/${processId}/1"

            return "new-formulario-form1"
        }
        model["formularioForm1"] = formularioForm1

        formularioForm1.edit = true
        formularioForm1.submetido = false
        model["url"] = "edit/${processId}/1"

        return "new-formulario-form1"
    }

    @GetMapping(value = ["/edit/{processId}/2"])
    fun showEditForm2(@PathVariable("processId") processId: String, model:ModelMap): String {

        //ir buscar á database
        val s8DB = s8FormularioRepository.findByProcessId(processId)
        val s9DB = s9FormularioRepository.findByProcessId(processId)
        val s10DB = s10FormularioRepository.findByProcessId(processId)
        val s11DB = s11FormularioRepository.findByProcessId(processId)
        val s12DB = s12FormularioRepository.findByProcessId(processId)
        val s13DB = s13FormularioRepository.findByProcessId(processId)
        val s14DB = s14FormularioRepository.findByProcessId(processId)

        // criar forms
        val formularioForm2 = FormularioForm2()

        formularioForm2.processId = processId

        if (s8DB != null) {
            formularioForm2.s8_1 = s8DB.s8_1
            formularioForm2.s8_2 = s8DB.s8_2
            formularioForm2.s8_3 = s8DB.s8_3
            formularioForm2.s8_3_A = s8DB.s8_3_A
            formularioForm2.s8_3_A_f = s8DB.s8_3_A_f
            formularioForm2.s8_3_B = s8DB.s8_3_B
            formularioForm2.s8_3_B_f = s8DB.s8_3_B_f
            formularioForm2.s8_3_C = s8DB.s8_3_C
            formularioForm2.s8_3_C_f = s8DB.s8_3_C_f
            formularioForm2.s8_4 = s8DB.s8_4
            formularioForm2.s8_4_A = s8DB.s8_4_A
            formularioForm2.s8_4_B = s8DB.s8_4_B
            formularioForm2.s8_4_C = s8DB.s8_4_C
            formularioForm2.s8_4_D = s8DB.s8_4_D
            formularioForm2.s8_4_E = s8DB.s8_4_E
            formularioForm2.s8_4_F = s8DB.s8_4_F
            formularioForm2.s8_4_G = s8DB.s8_4_G
            formularioForm2.s8_4_H = s8DB.s8_4_H
            formularioForm2.s8_4_I = s8DB.s8_4_I
            formularioForm2.s8_4_J = s8DB.s8_4_J
            formularioForm2.s8_4_J_f = s8DB.s8_4_J_f
            formularioForm2.s8_5 = s8DB.s8_5
            formularioForm2.s8_5_f = s8DB.s8_5_f
        }

        if (s9DB != null) {
            formularioForm2.s9_1_1 = s9DB.s9_1_1
            formularioForm2.s9_1_1_A = s9DB.s9_1_1_A
            formularioForm2.s9_1_1_B = s9DB.s9_1_1_B
            formularioForm2.s9_1_1_B_f = s9DB.s9_1_1_B_f
            formularioForm2.s9_2_A = s9DB.s9_2_A
            formularioForm2.s9_2_B = s9DB.s9_2_B
            formularioForm2.s9_2_C = s9DB.s9_2_C
            formularioForm2.s9_2_D = s9DB.s9_2_D
            formularioForm2.s9_2_E = s9DB.s9_2_E
            formularioForm2.s9_2_F = s9DB.s9_2_F
            formularioForm2.s9_2_G = s9DB.s9_2_G
            formularioForm2.s9_2_H = s9DB.s9_2_H
            formularioForm2.s9_2_I = s9DB.s9_2_I
            formularioForm2.s9_2_I_f = s9DB.s9_2_I_f
            formularioForm2.s9_2_J = s9DB.s9_2_J
            formularioForm2.s9_2_J_f = s9DB.s9_2_J_f
            formularioForm2.s9_2_L = s9DB.s9_2_L
            formularioForm2.s9_2_L_f = s9DB.s9_2_L_f
            formularioForm2.s9_2_M = s9DB.s9_2_M
            formularioForm2.s9_2_M_f = s9DB.s9_2_M_f
        }

        if (s10DB != null) {
            formularioForm2.s10_1 = s10DB.s10_1
            formularioForm2.s10_2 = s10DB.s10_2
            formularioForm2.s10_2_A = s10DB.s10_2_A
            formularioForm2.s10_2_B = s10DB.s10_2_B
            formularioForm2.s10_2_C = s10DB.s10_2_C
            formularioForm2.s10_2_1 = s10DB.s10_2_1
            formularioForm2.s10_3 = s10DB.s10_3
        }

        if (s11DB != null) {
            formularioForm2.s11_1_A = s11DB.s11_1_A
            formularioForm2.s11_1_B = s11DB.s11_1_B
            formularioForm2.s11_1_B_f = s11DB.s11_1_B_f
            formularioForm2.s11_1_C = s11DB.s11_1_C
            formularioForm2.s11_1_C_f = s11DB.s11_1_C_f
            formularioForm2.s11_2_A = s11DB.s11_2_A
            formularioForm2.s11_2_B = s11DB.s11_2_B
            formularioForm2.s11_2_C = s11DB.s11_2_C
            formularioForm2.s11_2_D = s11DB.s11_2_D
            formularioForm2.s11_2_E = s11DB.s11_2_E
            formularioForm2.s11_2_F = s11DB.s11_2_F
            formularioForm2.s11_2_G = s11DB.s11_2_G
            formularioForm2.s11_2_H = s11DB.s11_2_H
            formularioForm2.s11_2_I = s11DB.s11_2_I
            formularioForm2.s11_2_I_f = s11DB.s11_2_I_f
            formularioForm2.s11_2_J = s11DB.s11_2_J
            formularioForm2.s11_2_J_f = s11DB.s11_2_J_f
            formularioForm2.s11_2_L = s11DB.s11_2_L
            formularioForm2.s11_2_L_f = s11DB.s11_2_L_f
            formularioForm2.s11_2_M = s11DB.s11_2_M
            formularioForm2.s11_2_M_f = s11DB.s11_2_M_f
        }

        if (s12DB != null) {
            formularioForm2.s12_A = s12DB.s12_A
            formularioForm2.s12_B = s12DB.s12_B
            formularioForm2.s12_C = s12DB.s12_C
            formularioForm2.s12_D = s12DB.s12_D
            formularioForm2.s12_D_f = s12DB.s12_D_f
        }

        if (s13DB != null) {
            formularioForm2.s13_1_A = s13DB.s13_1_A
            formularioForm2.s13_1_B = s13DB.s13_1_B
            formularioForm2.s13_1_B_f = s13DB.s13_1_B_f
            formularioForm2.s13_2_A = s13DB.s13_2_A
            formularioForm2.s13_2_B = s13DB.s13_2_B
            formularioForm2.s13_2_C = s13DB.s13_2_C
            formularioForm2.s13_2_D = s13DB.s13_2_D
            formularioForm2.s13_2_E = s13DB.s13_2_E
            formularioForm2.s13_2_F = s13DB.s13_2_F
            formularioForm2.s13_2_G = s13DB.s13_2_G
            formularioForm2.s13_2_H = s13DB.s13_2_H
            formularioForm2.s13_2_I = s13DB.s13_2_I
            formularioForm2.s13_2_J = s13DB.s13_2_J
            formularioForm2.s13_2_J_f = s13DB.s13_2_J_f
            formularioForm2.s13_2_L = s13DB.s13_2_L
            formularioForm2.s13_2_L_f = s13DB.s13_2_L_f
            formularioForm2.s13_2_M = s13DB.s13_2_M
            formularioForm2.s13_2_M_f = s13DB.s13_2_M_f
            formularioForm2.s13_2_N = s13DB.s13_2_N
            formularioForm2.s13_2_N_f = s13DB.s13_2_N_f
            formularioForm2.s13_2_O = s13DB.s13_2_O
        }

        if (s14DB != null) {
            formularioForm2.s14_A = s14DB.s14_A
            formularioForm2.s14_B = s14DB.s14_B
            formularioForm2.s14_C = s14DB.s14_C
            formularioForm2.s14_D = s14DB.s14_D
            formularioForm2.s14_E = s14DB.s14_E
            formularioForm2.s14_F = s14DB.s14_F
            formularioForm2.s14_G = s14DB.s14_G
            formularioForm2.s14_H = s14DB.s14_H
            formularioForm2.s14_H_f = s14DB.s14_H_f
            formularioForm2.s14_I = s14DB.s14_I
            formularioForm2.s14_I_f = s14DB.s14_I_f
            formularioForm2.s14_J = s14DB.s14_J
            formularioForm2.s14_J_f = s14DB.s14_J_f
            formularioForm2.s14_L = s14DB.s14_L
            formularioForm2.s14_L_f = s14DB.s14_L_f
        }

        //verificar se vai so ler ou editar/criar o form
        val s1DB = s1FormularioRepository.findByProcessId(processId)

        if (s1DB != null && s1DB.estado == "Submetido" ) {
            model["formularioForm2"] = formularioForm2
            formularioForm2.edit = true
            formularioForm2.submetido = true
            model["url"] = "edit/${processId}/2"

            return "new-formulario-form2"
        }

        model["formularioForm2"] = formularioForm2
        formularioForm2.edit = true
        formularioForm2.submetido = false
        model["url"] = "edit/${processId}/2"

        return "new-formulario-form2"
    }

    @GetMapping(value = ["/edit/{processId}/3"])
    fun showEditForm3(@PathVariable("processId") processId: String, model:ModelMap): String {

        //ir buscar á database
        val s15DB = s15FormularioRepository.findByProcessId(processId)
        val s16DB = s16FormularioRepository.findByProcessId(processId)
        val s17DB = s17FormularioRepository.findByProcessId(processId)
        val s18DB = s18FormularioRepository.findByProcessId(processId)
        val s19DB = s19FormularioRepository.findByProcessId(processId)
        val s20DB = s20FormularioRepository.findByProcessId(processId)
        val s21DB = s21FormularioRepository.findByProcessId(processId)

        // criar forms
        val formularioForm3 = FormularioForm3()

        formularioForm3.processId = processId

        if (s15DB != null) {
            formularioForm3.s15 = s15DB.s15
        }

        if (s16DB != null) {
            formularioForm3.s16_1_A = s16DB.s16_1_A
            formularioForm3.s16_1_B = s16DB.s16_1_B
            formularioForm3.s16_1_B_f = s16DB.s16_1_B_f

        }

        if (s17DB != null) {
            formularioForm3.s17_A = s17DB.s17_A
            formularioForm3.s17_B = s17DB.s17_B
            formularioForm3.s17_C = s17DB.s17_C
            formularioForm3.s17_D = s17DB.s17_D
            formularioForm3.s17_E = s17DB.s17_E
            formularioForm3.s17_E_f = s17DB.s17_E_f
            formularioForm3.s17_F = s17DB.s17_F
            formularioForm3.s17_1_A = s17DB.s17_1_A
            formularioForm3.s17_1_B = s17DB.s17_1_B
            formularioForm3.s17_1_B_f = s17DB.s17_1_B_f
            formularioForm3.s17_2 = s17DB.s17_2
            formularioForm3.s17_2_f = s17DB.s17_2_f
            formularioForm3.s17_3 = s17DB.s17_3
            formularioForm3.s17_3_f = s17DB.s17_3_f
            formularioForm3.s17_4 = s17DB.s17_4
            formularioForm3.s17_4_1_A = s17DB.s17_4_1_A
            formularioForm3.s17_4_1_B = s17DB.s17_4_1_B
            formularioForm3.s17_4_2_A = s17DB.s17_4_2_A
            formularioForm3.s17_4_2_B = s17DB.s17_4_2_B
            formularioForm3.s17_4_2_B_f = s17DB.s17_4_2_B_f
            formularioForm3.s17_5 = s17DB.s17_5
            formularioForm3.s17_6 = s17DB.s17_6
            formularioForm3.s17_6_f = s17DB.s17_6_f
        }

        if (s18DB != null) {
            formularioForm3.s18_1 = s18DB.s18_1
            formularioForm3.s18_1_A = s18DB.s18_1_A
            formularioForm3.s18_1_B = s18DB.s18_1_B
            formularioForm3.s18_1_C = s18DB.s18_1_C
            formularioForm3.s18_1_D = s18DB.s18_1_D
            formularioForm3.s18_1_E = s18DB.s18_1_E
            formularioForm3.s18_1_E_f = s18DB.s18_1_E_f
            formularioForm3.s18_2 = s18DB.s18_2
            formularioForm3.s18_2_A = s18DB.s18_2_A
            formularioForm3.s18_2_B = s18DB.s18_2_B
            formularioForm3.s18_2_C = s18DB.s18_2_C
            formularioForm3.s18_2_D = s18DB.s18_2_D
            formularioForm3.s18_2_E = s18DB.s18_2_E
            formularioForm3.s18_2_F = s18DB.s18_2_F
            formularioForm3.s18_2_G = s18DB.s18_2_G
            formularioForm3.s18_2_G_f = s18DB.s18_2_G_f
            formularioForm3.s18_3_A = s18DB.s18_3_A
            formularioForm3.s18_3_B = s18DB.s18_3_B
            formularioForm3.s18_3_B_f = s18DB.s18_3_B_f
            formularioForm3.s18_4 = s18DB.s18_4
            formularioForm3.s18_4_A = s18DB.s18_4_A
            formularioForm3.s18_4_B = s18DB.s18_4_B
            formularioForm3.s18_4_C = s18DB.s18_4_C
            formularioForm3.s18_4_C_f = s18DB.s18_4_C_f
            formularioForm3.s18_4_D = s18DB.s18_4_D
            formularioForm3.s18_4_D_f = s18DB.s18_4_D_f
            formularioForm3.s18_4_E = s18DB.s18_4_E
            formularioForm3.s18_4_E_f = s18DB.s18_4_E_f
            formularioForm3.s18_4_F = s18DB.s18_4_F
            formularioForm3.s18_4_F_f = s18DB.s18_4_F_f
            formularioForm3.s18_4_1 = s18DB.s18_4_1
        }

        if (s19DB != null) {
            formularioForm3.s19_1 = s19DB.s19_1
            formularioForm3.s19_1_1 = s19DB.s19_1_1
            formularioForm3.s19_1_2 = s19DB.s19_1_2
            formularioForm3.s19_1_3 = s19DB.s19_1_3
            formularioForm3.s19_1_4 = s19DB.s19_1_4
            formularioForm3.s19_1_5 = s19DB.s19_1_5
            formularioForm3.s19_1_6 = s19DB.s19_1_6
            formularioForm3.s19_1_7 = s19DB.s19_1_7
            formularioForm3.s19_1_8 = s19DB.s19_1_8
            formularioForm3.s19_1_9 = s19DB.s19_1_9
            formularioForm3.s19_1_10 = s19DB.s19_1_10
            formularioForm3.s19_1_11 = s19DB.s19_1_11
            formularioForm3.s19_1_12 = s19DB.s19_1_12
            formularioForm3.s19_1_13 = s19DB.s19_1_13
            formularioForm3.s19_1_14 = s19DB.s19_1_14
            formularioForm3.s19_1_15 = s19DB.s19_1_15
            formularioForm3.s19_1_16 = s19DB.s19_1_16
            formularioForm3.s19_1_17 = s19DB.s19_1_17
            formularioForm3.s19_1_17_f = s19DB.s19_1_17_f
            formularioForm3.s19_2 = s19DB.s19_2
            formularioForm3.s19_2_1 = s19DB.s19_2_1
            formularioForm3.s19_2_2 = s19DB.s19_2_2
            formularioForm3.s19_2_3 = s19DB.s19_2_3
            formularioForm3.s19_2_4 = s19DB.s19_2_4
            formularioForm3.s19_2_5 = s19DB.s19_2_5
            formularioForm3.s19_2_6 = s19DB.s19_2_6
            formularioForm3.s19_2_7 = s19DB.s19_2_7
            formularioForm3.s19_2_8 = s19DB.s19_2_8
            formularioForm3.s19_2_9 = s19DB.s19_2_9
            formularioForm3.s19_2_10 = s19DB.s19_2_10
            formularioForm3.s19_2_11 = s19DB.s19_2_11
            formularioForm3.s19_2_12 = s19DB.s19_2_12
            formularioForm3.s19_2_13 = s19DB.s19_2_13
            formularioForm3.s19_2_14 = s19DB.s19_2_14
            formularioForm3.s19_2_15 = s19DB.s19_2_15
            formularioForm3.s19_2_16 = s19DB.s19_2_16
            formularioForm3.s19_2_17 = s19DB.s19_2_17
            formularioForm3.s19_2_18 = s19DB.s19_2_18
            formularioForm3.s19_2_19 = s19DB.s19_2_19
            formularioForm3.s19_2_19_f = s19DB.s19_2_19_f
            formularioForm3.s19_2_20 = s19DB.s19_2_20
            formularioForm3.s19_2_20_f = s19DB.s19_2_20_f
        }

        if (s20DB != null) {
            formularioForm3.s20_1_A = s20DB.s20_1_A
            formularioForm3.s20_1_B = s20DB.s20_1_B
            formularioForm3.s20_1_C = s20DB.s20_1_C
            formularioForm3.s20_1_D = s20DB.s20_1_D
            formularioForm3.s20_1_E = s20DB.s20_1_E
            formularioForm3.s20_1_F = s20DB.s20_1_F
            formularioForm3.s20_1_F_f = s20DB.s20_1_F_f
            formularioForm3.s20_1_1 = s20DB.s20_1_1
            formularioForm3.s20_2 = s20DB.s20_2
            formularioForm3.s20_2_1 = s20DB.s20_2_1
        }

        if (s21DB != null) {
            formularioForm3.s21_1_A = s21DB.s21_1_A
            formularioForm3.s21_1_B = s21DB.s21_1_B
            formularioForm3.s21_1_C = s21DB.s21_1_C
            formularioForm3.s21_1_D = s21DB.s21_1_D
            formularioForm3.s21_1_E = s21DB.s21_1_E
            formularioForm3.s21_1_1 = s21DB.s21_1_1
            formularioForm3.s21_1_2_A = s21DB.s21_1_2_A
            formularioForm3.s21_1_2_B = s21DB.s21_1_2_B
            formularioForm3.s21_1_2_B_f = s21DB.s21_1_2_B_f
            formularioForm3.s21_2_A = s21DB.s21_2_A
            formularioForm3.s21_2_B = s21DB.s21_2_B
            formularioForm3.s21_2_C = s21DB.s21_2_C
            formularioForm3.s21_2_D = s21DB.s21_2_D
            formularioForm3.s21_2_E = s21DB.s21_2_E
            formularioForm3.s21_2_1 = s21DB.s21_2_1
            formularioForm3.s21_2_2_A = s21DB.s21_2_2_A
            formularioForm3.s21_2_2_B = s21DB.s21_2_2_B
            formularioForm3.s21_2_2_B_f = s21DB.s21_2_2_B_f
            formularioForm3.s21_3_A = s21DB.s21_3_A
            formularioForm3.s21_3_B = s21DB.s21_3_B
            formularioForm3.s21_3_C = s21DB.s21_3_C
            formularioForm3.s21_3_D = s21DB.s21_3_D
            formularioForm3.s21_3_E = s21DB.s21_3_E
            formularioForm3.s21_3_1 = s21DB.s21_3_1
            formularioForm3.s21_3_2_A = s21DB.s21_3_2_A
            formularioForm3.s21_3_2_B = s21DB.s21_3_2_B
            formularioForm3.s21_3_2_B_f = s21DB.s21_3_2_B_f
            formularioForm3.s21_4_A = s21DB.s21_4_A
            formularioForm3.s21_4_B = s21DB.s21_4_B
            formularioForm3.s21_4_1_A = s21DB.s21_4_1_A
            formularioForm3.s21_4_1_B = s21DB.s21_4_1_B
        }

        //verificar se vai so ler ou editar/criar o form
        val s1DB = s1FormularioRepository.findByProcessId(processId)

        if (s1DB != null && s1DB.estado == "Submetido" ) {
            model["formularioForm3"] = formularioForm3

            formularioForm3.submetido = true
            formularioForm3.edit = true
            model["url"] = "edit/${processId}/3"

            return "new-formulario-form3"
        }

        model["formularioForm3"] = formularioForm3

        formularioForm3.submetido = false
        formularioForm3.edit = true
        model["url"] = "edit/${processId}/3"

        return "new-formulario-form3"
    }


    @PostMapping(value = ["/new", "/edit/{processId}/1"])
    fun postFormularioForm1(@PathVariable("processId") processIdParam: String?,
                            @Valid @ModelAttribute("formularioForm1") formularioForm1: FormularioForm1,
                            bindingResult: BindingResult,
                            model:ModelMap,
                            redirectAttributes: RedirectAttributes) : String {

        if (processIdParam == null) {
            model["url"] = "new"
        } else {
            model["url"] = "edit/${processIdParam}/1"
        }

        val s1DB = if (formularioForm1.processId == null) null else s1FormularioRepository.findByProcessId(formularioForm1.processId)

        if (bindingResult.hasErrors() && (s1DB == null || s1DB.estado != "Submetido")) {
            return "new-formulario-form1"
        }

        val date = LocalDate.now().toString()
        if (formularioForm1.s3_1 > date){
            bindingResult.rejectValue("s3_1", "invalidDate", "Erro: A data não pode ser superior à data atual")
            return "new-formulario-form1"
        }
        if (formularioForm1.s3_2 > date){
            bindingResult.rejectValue("s3_2", "invalidDate", "Erro: A data não pode ser superior à data atual")
            return "new-formulario-form1"
        }
        if (formularioForm1.s3_3 > date){
            bindingResult.rejectValue("s3_3", "invalidDate", "Erro: A data não pode ser superior à data atual")
            return "new-formulario-form1"
        }
        if (formularioForm1.s3_4_1 > date){
            bindingResult.rejectValue("s3_4_1", "invalidDate", "Erro: A data não pode ser superior à data atual")
            return "new-formulario-form1"
        }

        val processId = formularioForm1.processId!!  // it is safe doing this since processId is a mandatory field

        // se já estiver submetido não faz nada
        if (s1DB == null || s1DB.estado != "Submetido") {

            if (processIdParam == null) {
                if (s1FormularioRepository.findByProcessId(processId) != null) {
                    bindingResult.rejectValue("processId", "processId.existent", "Já existe um processo com esse número. Use a opção editar.")
                    return "new-formulario-form1"
                }

                //guardar na base de dados
                val s1FormularioDAO = S1Formulario(
                    processId = processId,
                    comarca = formularioForm1.comarca,
                    juizo = formularioForm1.juizo,
                    s1_2_A = formularioForm1.s1_2_A,
                    s1_2_B = formularioForm1.s1_2_B,
                    s1_2_B_f = formularioForm1.s1_2_B_f

                )
                s1FormularioRepository.save(s1FormularioDAO)

                val s2FormularioDAO = S2Formulario(
                    processId = processId,
                    s2_A = formularioForm1.s2_A,
                    s2_B = formularioForm1.s2_B
                )
                s2FormularioRepository.save(s2FormularioDAO)

                val s3FormularioDAO = S3Formulario(
                    processId = processId,
                    s3_1 = formularioForm1.s3_1,
                    s3_2 = formularioForm1.s3_2,
                    s3_3 = formularioForm1.s3_2,
                    s3_4_A = formularioForm1.s3_4_A,
                    s3_4_B = formularioForm1.s3_4_B,
                    s3_4_1 = formularioForm1.s3_4_1,
                    s3_4_2 = formularioForm1.s3_4_2
                )
                s3FormularioRepository.save(s3FormularioDAO)

                val s4FormularioDAO = S4Formulario(
                    processId = processId,
                    s4_1_1 = formularioForm1.s4_1_1,
                    s4_1_1_A = formularioForm1.s4_1_1_A,
                    s4_1_1_B = formularioForm1.s4_1_1_B,
                    s4_1_2 = formularioForm1.s4_1_2,
                    s4_1_2_f = formularioForm1.s4_1_2_f
                )
                s4FormularioRepository.save(s4FormularioDAO)

                val s5FormularioDAO = S5Formulario(
                    processId = processId,
                    s5_1_1_A = formularioForm1.s5_1_1_A,
                    s5_1_1_B = formularioForm1.s5_1_1_B,
                    s5_1_2_A = formularioForm1.s5_1_2_A,
                    s5_1_2_B = formularioForm1.s5_1_2_B,
                    s5_1_2_C = formularioForm1.s5_1_2_C,
                    s5_1_2_D = formularioForm1.s5_1_2_D,
                        s5_1_2_E = formularioForm1.s5_1_2_E,
                    s5_1_3_A = formularioForm1.s5_1_3_A,
                    s5_1_3_B = formularioForm1.s5_1_3_B,
                    s5_1_3_C = formularioForm1.s5_1_3_C,
                    s5_1_3_D = formularioForm1.s5_1_3_D,
                    s5_1_3_D_f = formularioForm1.s5_1_3_D_f,
                    s5_1_4_A = formularioForm1.s5_1_4_A,
                    s5_1_4_B = formularioForm1.s5_1_4_B,
                    s5_1_4_C = formularioForm1.s5_1_4_C,
                    s5_1_4_D = formularioForm1.s5_1_4_D,
                    s5_1_4_E = formularioForm1.s5_1_4_E,
                    s5_1_4_F = formularioForm1.s5_1_4_F,
                    s5_1_4_G = formularioForm1.s5_1_4_G,
                    s5_1_4_H = formularioForm1.s5_1_4_H,
                    s5_1_4_I = formularioForm1.s5_1_4_I,
                    s5_1_4_J = formularioForm1.s5_1_4_J,
                    s5_1_4_L = formularioForm1.s5_1_4_L,
                    s5_2_A = formularioForm1.s5_2_A,
                    s5_2_B = formularioForm1.s5_2_B,
                    s5_2_C = formularioForm1.s5_2_C,
                    s5_2_D = formularioForm1.s5_2_D,
                    s5_2_E = formularioForm1.s5_2_E,
                    s5_2_F = formularioForm1.s5_2_F,
                    s5_2_G = formularioForm1.s5_2_G,
                    s5_2_H = formularioForm1.s5_2_H,
                    s5_2_I = formularioForm1.s5_2_I,
                    s5_2_I_f = formularioForm1.s5_2_I_f,
                    s5_3_A = formularioForm1.s5_3_A,
                    s5_3_B = formularioForm1.s5_3_B,
                    s5_3_C = formularioForm1.s5_3_C,
                    s5_3_D = formularioForm1.s5_3_D,
                    s5_3_E = formularioForm1.s5_3_E,
                    s5_3_F = formularioForm1.s5_3_F,
                    s5_3_G = formularioForm1.s5_3_G,
                    s5_3_H = formularioForm1.s5_3_H,
                    s5_3_I = formularioForm1.s5_3_I,
                    s5_3_J = formularioForm1.s5_3_J,
                    s5_3_L = formularioForm1.s5_3_L,
                    s5_3_M = formularioForm1.s5_3_M,
                    s5_3_N = formularioForm1.s5_3_N,
                    s5_3_O = formularioForm1.s5_3_O,
                    s5_3_P = formularioForm1.s5_3_P,
                    s5_3_Q = formularioForm1.s5_3_Q,
                    s5_3_R = formularioForm1.s5_3_R,
                    s5_3_S = formularioForm1.s5_3_S,
                    s5_3_T = formularioForm1.s5_3_T,
                    s5_3_U = formularioForm1.s5_3_U,
                    s5_3_V = formularioForm1.s5_3_V,
                )
                s5FormularioRepository.save(s5FormularioDAO)

                val s6FormularioDAO = S6Formulario(
                    processId = processId,
                    s6_A = formularioForm1.s6_A,
                    s6_B = formularioForm1.s6_B,
                    s6_B_f = formularioForm1.s6_B_f,
                    s6_1_A = formularioForm1.s6_1_A,
                    s6_1_B = formularioForm1.s6_1_B,
                    s6_1_B_f = formularioForm1.s6_1_B_f,
                )
                s6FormularioRepository.save(s6FormularioDAO)

                val s7FormularioDAO = S7Formulario(
                    processId = processId,
                    s7_1_A = formularioForm1.s7_1_A,
                    s7_1_B = formularioForm1.s7_1_B,
                    s7_1_C = formularioForm1.s7_1_C,
                    s7_1_D = formularioForm1.s7_1_D,
                    s7_1_E = formularioForm1.s7_1_E,
                    s7_1_F = formularioForm1.s7_1_F,
                    s7_1_G = formularioForm1.s7_1_G,
                    s7_1_H = formularioForm1.s7_1_H,
                    s7_1_I = formularioForm1.s7_1_I,
                    s7_1_I_f = formularioForm1.s7_1_I_f,
                    s7_1_J = formularioForm1.s7_1_J,
                    s7_1_J_f = formularioForm1.s7_1_J_f,
                    s7_1_L = formularioForm1.s7_1_L,
                    s7_1_L_f = formularioForm1.s7_1_L_f,
                    s7_1_M = formularioForm1.s7_1_M,
                    s7_1_M_f = formularioForm1.s7_1_M_f,
                )
                s7FormularioRepository.save(s7FormularioDAO)


            } else {  // edit

                val s2DB = s2FormularioRepository.findByProcessId(processId)!!
                val s3DB = s3FormularioRepository.findByProcessId(processId)!!
                val s4DB = s4FormularioRepository.findByProcessId(processId)!!
                val s5DB = s5FormularioRepository.findByProcessId(processId)!!
                val s6DB = s6FormularioRepository.findByProcessId(processId)!!
                val s7DB = s7FormularioRepository.findByProcessId(processId)!!

                s2DB.s2_A = formularioForm1.s2_A
                s2DB.s2_B = formularioForm1.s2_B
                s2FormularioRepository.save(s2DB)

                s3DB.s3_1 = formularioForm1.s3_1
                s3DB.s3_2 = formularioForm1.s3_2
                s3DB.s3_3 = formularioForm1.s3_3
                s3DB.s3_4 = formularioForm1.s3_4
                s3DB.s3_4_A = formularioForm1.s3_4_A
                s3DB.s3_4_B = formularioForm1.s3_4_B
                s3DB.s3_4_1 = formularioForm1.s3_4_1
                s3DB.s3_4_2 = formularioForm1.s3_4_2
                s3FormularioRepository.save(s3DB)

                s4DB.s4_1_1 = formularioForm1.s4_1_1
                s4DB.s4_1_1_A = formularioForm1.s4_1_1_A
                s4DB.s4_1_1_B = formularioForm1.s4_1_1_B
                s4DB.s4_1_2 = formularioForm1.s4_1_2
                s4DB.s4_1_2_f = formularioForm1.s4_1_2_f
                s4FormularioRepository.save(s4DB)

                s5DB.s5_1_1_A = formularioForm1.s5_1_1_A
                s5DB.s5_1_1_B = formularioForm1.s5_1_1_B
                s5DB.s5_1_2_A = formularioForm1.s5_1_2_A
                s5DB.s5_1_2_B = formularioForm1.s5_1_2_B
                s5DB.s5_1_2_C = formularioForm1.s5_1_2_C
                s5DB.s5_1_2_D = formularioForm1.s5_1_2_D
                s5DB.s5_1_2_E = formularioForm1.s5_1_2_E
                s5DB.s5_1_3_A = formularioForm1.s5_1_3_A
                s5DB.s5_1_3_B = formularioForm1.s5_1_3_B
                s5DB.s5_1_3_C = formularioForm1.s5_1_3_C
                s5DB.s5_1_3_D = formularioForm1.s5_1_3_D
                s5DB.s5_1_3_D_f = formularioForm1.s5_1_3_D_f
                s5DB.s5_1_4_A = formularioForm1.s5_1_4_A
                s5DB.s5_1_4_B = formularioForm1.s5_1_4_B
                s5DB.s5_1_4_C = formularioForm1.s5_1_4_C
                s5DB.s5_1_4_D = formularioForm1.s5_1_4_D
                s5DB.s5_1_4_E = formularioForm1.s5_1_4_E
                s5DB.s5_1_4_F = formularioForm1.s5_1_4_F
                s5DB.s5_1_4_G = formularioForm1.s5_1_4_G
                s5DB.s5_1_4_H = formularioForm1.s5_1_4_H
                s5DB.s5_1_4_I = formularioForm1.s5_1_4_I
                s5DB.s5_1_4_J = formularioForm1.s5_1_4_J
                s5DB.s5_1_4_L = formularioForm1.s5_1_4_L
                s5DB.s5_2_A = formularioForm1.s5_2_A
                s5DB.s5_2_B = formularioForm1.s5_2_B
                s5DB.s5_2_C = formularioForm1.s5_2_C
                s5DB.s5_2_D = formularioForm1.s5_2_D
                s5DB.s5_2_E = formularioForm1.s5_2_E
                s5DB.s5_2_F = formularioForm1.s5_2_F
                s5DB.s5_2_G = formularioForm1.s5_2_G
                s5DB.s5_2_H = formularioForm1.s5_2_H
                s5DB.s5_2_I = formularioForm1.s5_2_I
                s5DB.s5_2_I_f = formularioForm1.s5_2_I_f
                s5DB.s5_3_A = formularioForm1.s5_3_A
                s5DB.s5_3_B = formularioForm1.s5_3_B
                s5DB.s5_3_C = formularioForm1.s5_3_C
                s5DB.s5_3_D = formularioForm1.s5_3_D
                s5DB.s5_3_E = formularioForm1.s5_3_E
                s5DB.s5_3_F = formularioForm1.s5_3_F
                s5DB.s5_3_G = formularioForm1.s5_3_G
                s5DB.s5_3_H = formularioForm1.s5_3_H
                s5DB.s5_3_I = formularioForm1.s5_3_I
                s5DB.s5_3_J = formularioForm1.s5_3_J
                s5DB.s5_3_L = formularioForm1.s5_3_L
                s5DB.s5_3_M = formularioForm1.s5_3_M
                s5DB.s5_3_N = formularioForm1.s5_3_N
                s5DB.s5_3_O = formularioForm1.s5_3_O
                s5DB.s5_3_P = formularioForm1.s5_3_P
                s5DB.s5_3_Q = formularioForm1.s5_3_Q
                s5DB.s5_3_R = formularioForm1.s5_3_R
                s5DB.s5_3_S = formularioForm1.s5_3_S
                s5DB.s5_3_T = formularioForm1.s5_3_T
                s5DB.s5_3_U = formularioForm1.s5_3_U
                s5DB.s5_3_V = formularioForm1.s5_3_V
                s5FormularioRepository.save(s5DB)

                s6DB.s6_A = formularioForm1.s6_A
                s6DB.s6_B = formularioForm1.s6_B
                s6DB.s6_B_f = formularioForm1.s6_B_f
                s6DB.s6_1_A = formularioForm1.s6_1_A
                s6DB.s6_1_B = formularioForm1.s6_1_B
                s6DB.s6_1_B_f = formularioForm1.s6_1_B_f
                s6FormularioRepository.save(s6DB)

                s7DB.s7_1_A = formularioForm1.s7_1_A
                s7DB.s7_1_B = formularioForm1.s7_1_B
                s7DB.s7_1_C = formularioForm1.s7_1_C
                s7DB.s7_1_D = formularioForm1.s7_1_D
                s7DB.s7_1_E = formularioForm1.s7_1_E
                s7DB.s7_1_F = formularioForm1.s7_1_F
                s7DB.s7_1_G = formularioForm1.s7_1_G
                s7DB.s7_1_H = formularioForm1.s7_1_H
                s7DB.s7_1_I = formularioForm1.s7_1_I
                s7DB.s7_1_I_f = formularioForm1.s7_1_I_f
                s7DB.s7_1_J = formularioForm1.s7_1_J
                s7DB.s7_1_J_f = formularioForm1.s7_1_J_f
                s7DB.s7_1_L = formularioForm1.s7_1_L
                s7DB.s7_1_L_f = formularioForm1.s7_1_L_f
                s7DB.s7_1_M = formularioForm1.s7_1_M
                s7DB.s7_1_M_f = formularioForm1.s7_1_M_f
                s7FormularioRepository.save(s7DB)
            }

            redirectAttributes.addFlashAttribute("message", "Página 1 do formulário gravada. Pode continuar a preencher")
        }

        when (formularioForm1.operation) {
            "Gravar" -> {
                val s1DB = s1FormularioRepository.findByProcessId(processId)
                val data1 = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
                if (s1DB != null) {
                    s1DB.lastUpdate = data1.format(Date())
                    s1FormularioRepository.save(s1DB);
                }
                return "redirect:/form/edit/${processId}/1"
            }  // volta a mostrar a página 1 em edição
            "Avançar >>" -> return "redirect:/form/edit/${processId}/2"
            else -> throw Exception("invalid operation: ${formularioForm1.operation}")
        }
    }



    @PostMapping(value = [ "/edit/{processId}/2"])
    fun postFormularioForm2(@Valid @ModelAttribute("formularioForm2") formularioForm2: FormularioForm2,
                            @PathVariable("processId") processIdParam: String?,
                            bindingResult: BindingResult, model:ModelMap,
                            redirectAttributes: RedirectAttributes) : String {

        val s1DB = if (formularioForm2.processId == null) null else s1FormularioRepository.findByProcessId(formularioForm2.processId)

        if (bindingResult.hasErrors() && (s1DB == null || s1DB.estado != "Submetido")) {
            return "new-formulario-form2"
        }

        val processId = formularioForm2.processId!!  // it is safe doing this since processId is a mandatory field


        if (s1DB == null || s1DB.estado != "Submetido"){
            //ir buscar á database
            val s8DB = s8FormularioRepository.findByProcessId(processId)
            val s9DB = s9FormularioRepository.findByProcessId(processId)
            val s10DB = s10FormularioRepository.findByProcessId(processId)
            val s11DB = s11FormularioRepository.findByProcessId(processId)
            val s12DB = s12FormularioRepository.findByProcessId(processId)
            val s13DB = s13FormularioRepository.findByProcessId(processId)
            val s14DB = s14FormularioRepository.findByProcessId(processId)

            if (s8DB != null) {
                s8DB.s8_1 = formularioForm2.s8_1
                s8DB.s8_2 = formularioForm2.s8_2
                s8DB.s8_3 = formularioForm2.s8_3
                s8DB.s8_3_A = formularioForm2.s8_3_A
                s8DB.s8_3_A_f = formularioForm2.s8_3_A_f
                s8DB.s8_3_B = formularioForm2.s8_3_B
                s8DB.s8_3_B_f = formularioForm2.s8_3_B_f
                s8DB.s8_3_C = formularioForm2.s8_3_C
                s8DB.s8_3_C_f = formularioForm2.s8_3_C_f
                s8DB.s8_4 = formularioForm2.s8_4
                s8DB.s8_4_A = formularioForm2.s8_4_A
                s8DB.s8_4_B = formularioForm2.s8_4_B
                s8DB.s8_4_C = formularioForm2.s8_4_C
                s8DB.s8_4_D = formularioForm2.s8_4_D
                s8DB.s8_4_E = formularioForm2.s8_4_E
                s8DB.s8_4_F = formularioForm2.s8_4_F
                s8DB.s8_4_G = formularioForm2.s8_4_G
                s8DB.s8_4_H = formularioForm2.s8_4_H
                s8DB.s8_4_I = formularioForm2.s8_4_I
                s8DB.s8_4_J = formularioForm2.s8_4_J
                s8DB.s8_4_J_f = formularioForm2.s8_4_J_f
                s8DB.s8_5 = formularioForm2.s8_5
                s8DB.s8_5_f = formularioForm2.s8_5_f
                s8FormularioRepository.save(s8DB)
            } else {
                val s8FormularioDAO = S8Formulario(processId = formularioForm2.processId,
                        s8_1 = formularioForm2.s8_1,
                        s8_2 = formularioForm2.s8_2,
                        s8_3 = formularioForm2.s8_3,
                        s8_3_A = formularioForm2.s8_3_A,
                        s8_3_A_f = formularioForm2.s8_3_A_f,
                        s8_3_B = formularioForm2.s8_3_B,
                        s8_3_B_f = formularioForm2.s8_3_B_f,
                        s8_3_C = formularioForm2.s8_3_C,
                        s8_3_C_f = formularioForm2.s8_3_C_f,
                        s8_4 = formularioForm2.s8_4,
                        s8_4_A = formularioForm2.s8_4_A,
                        s8_4_B = formularioForm2.s8_4_B,
                        s8_4_C = formularioForm2.s8_4_C,
                        s8_4_D = formularioForm2.s8_4_D,
                        s8_4_E = formularioForm2.s8_4_E,
                        s8_4_F = formularioForm2.s8_4_F,
                        s8_4_G = formularioForm2.s8_4_G,
                        s8_4_H = formularioForm2.s8_4_H,
                        s8_4_I = formularioForm2.s8_4_I,
                        s8_4_J = formularioForm2.s8_4_J,
                        s8_4_J_f = formularioForm2.s8_4_J_f,
                        s8_5 = formularioForm2.s8_5,
                        s8_5_f = formularioForm2.s8_5_f
                )
                s8FormularioRepository.save(s8FormularioDAO)
            }

            if (s9DB != null) {
                s9DB.s9_1_1 = formularioForm2.s9_1_1
                s9DB.s9_1_1_A = formularioForm2.s9_1_1_A
                s9DB.s9_1_1_B = formularioForm2.s9_1_1_B
                s9DB.s9_1_1_B_f = formularioForm2.s9_1_1_B_f
                s9DB.s9_2_A = formularioForm2.s9_2_A
                s9DB.s9_2_B = formularioForm2.s9_2_B
                s9DB.s9_2_C = formularioForm2.s9_2_C
                s9DB.s9_2_D = formularioForm2.s9_2_D
                s9DB.s9_2_E = formularioForm2.s9_2_E
                s9DB.s9_2_F = formularioForm2.s9_2_F
                s9DB.s9_2_G = formularioForm2.s9_2_G
                s9DB.s9_2_H = formularioForm2.s9_2_H
                s9DB.s9_2_I = formularioForm2.s9_2_I
                s9DB.s9_2_I_f = formularioForm2.s9_2_I_f
                s9DB.s9_2_J = formularioForm2.s9_2_J
                s9DB.s9_2_J_f = formularioForm2.s9_2_J_f
                s9DB.s9_2_L = formularioForm2.s9_2_L
                s9DB.s9_2_L_f = formularioForm2.s9_2_L_f
                s9DB.s9_2_M = formularioForm2.s9_2_M
                s9DB.s9_2_M_f = formularioForm2.s9_2_M_f
                s9FormularioRepository.save(s9DB)
            } else {
                val s9FormularioDAO = S9Formulario(processId = formularioForm2.processId,
                        s9_1_1 = formularioForm2.s9_1_1,
                        s9_1_1_A = formularioForm2.s9_1_1_A,
                        s9_1_1_B = formularioForm2.s9_1_1_B,
                        s9_1_1_B_f = formularioForm2.s9_1_1_B_f,
                        s9_2_A = formularioForm2.s9_2_A,
                        s9_2_B = formularioForm2.s9_2_B,
                        s9_2_C = formularioForm2.s9_2_C,
                        s9_2_D = formularioForm2.s9_2_D,
                        s9_2_E = formularioForm2.s9_2_E,
                        s9_2_F = formularioForm2.s9_2_F,
                        s9_2_G = formularioForm2.s9_2_G,
                        s9_2_H = formularioForm2.s9_2_H,
                        s9_2_I = formularioForm2.s9_2_I,
                        s9_2_I_f = formularioForm2.s9_2_I_f,
                        s9_2_J = formularioForm2.s9_2_J,
                        s9_2_J_f = formularioForm2.s9_2_J_f,
                        s9_2_L_f = formularioForm2.s9_2_L_f,
                        s9_2_L = formularioForm2.s9_2_L,
                        s9_2_M_f = formularioForm2.s9_2_M_f,
                        s9_2_M = formularioForm2.s9_2_M
                )
                s9FormularioRepository.save(s9FormularioDAO)
            }

            if (s10DB != null) {
                s10DB.s10_1 = formularioForm2.s10_1
                s10DB.s10_2 = formularioForm2.s10_2
                s10DB.s10_2_A = formularioForm2.s10_2_A
                s10DB.s10_2_B = formularioForm2.s10_2_B
                s10DB.s10_2_C = formularioForm2.s10_2_C
                s10DB.s10_2_1 = formularioForm2.s10_2_1
                s10DB.s10_3 = formularioForm2.s10_3
                s10FormularioRepository.save(s10DB)
            } else {
                val s10FormularioDAO = S10Formulario(processId = formularioForm2.processId,
                        s10_1 = formularioForm2.s10_1,
                        s10_2 = formularioForm2.s10_2,
                        s10_2_A = formularioForm2.s10_2_A,
                        s10_2_B = formularioForm2.s10_2_B,
                        s10_2_C = formularioForm2.s10_2_C,
                        s10_2_1 = formularioForm2.s10_2_1,
                        s10_3 = formularioForm2.s10_3
                )
                s10FormularioRepository.save(s10FormularioDAO)
            }

            if (s11DB != null) {
                s11DB.s11_1_A = formularioForm2.s11_1_A
                s11DB.s11_1_B = formularioForm2.s11_1_B
                s11DB.s11_1_B_f = formularioForm2.s11_1_B_f
                s11DB.s11_1_C = formularioForm2.s11_1_C
                s11DB.s11_1_C_f = formularioForm2.s11_1_C_f
                s11DB.s11_2_A = formularioForm2.s11_2_A
                s11DB.s11_2_B = formularioForm2.s11_2_B
                s11DB.s11_2_C = formularioForm2.s11_2_C
                s11DB.s11_2_D = formularioForm2.s11_2_D
                s11DB.s11_2_E = formularioForm2.s11_2_E
                s11DB.s11_2_F = formularioForm2.s11_2_F
                s11DB.s11_2_G = formularioForm2.s11_2_G
                s11DB.s11_2_H = formularioForm2.s11_2_H
                s11DB.s11_2_I = formularioForm2.s11_2_I
                s11DB.s11_2_I_f = formularioForm2.s11_2_I_f
                s11DB.s11_2_J = formularioForm2.s11_2_J
                s11DB.s11_2_J_f = formularioForm2.s11_2_J_f
                s11DB.s11_2_L = formularioForm2.s11_2_L
                s11DB.s11_2_L_f = formularioForm2.s11_2_L_f
                s11DB.s11_2_M = formularioForm2.s11_2_M
                s11DB.s11_2_M_f = formularioForm2.s11_2_M_f
                s11FormularioRepository.save(s11DB)
            } else {
                val s11FormularioDAO = S11Formulario(processId = formularioForm2.processId,
                        s11_1_A = formularioForm2.s11_1_A,
                        s11_1_B = formularioForm2.s11_1_B,
                        s11_1_B_f = formularioForm2.s11_1_B_f,
                        s11_1_C = formularioForm2.s11_1_C,
                        s11_1_C_f = formularioForm2.s11_1_C_f,
                        s11_2_A = formularioForm2.s11_2_A,
                        s11_2_B = formularioForm2.s11_2_B,
                        s11_2_C = formularioForm2.s11_2_C,
                        s11_2_D = formularioForm2.s11_2_D,
                        s11_2_E = formularioForm2.s11_2_E,
                        s11_2_F = formularioForm2.s11_2_F,
                        s11_2_G = formularioForm2.s11_2_G,
                        s11_2_H = formularioForm2.s11_2_H,
                        s11_2_I = formularioForm2.s11_2_I,
                        s11_2_I_f = formularioForm2.s11_2_I_f,
                        s11_2_J = formularioForm2.s11_2_J,
                        s11_2_J_f = formularioForm2.s11_2_J_f,
                        s11_2_L = formularioForm2.s11_2_L,
                        s11_2_L_f = formularioForm2.s11_2_L_f,
                        s11_2_M = formularioForm2.s11_2_M,
                        s11_2_M_f = formularioForm2.s11_2_M_f
                )
                s11FormularioRepository.save(s11FormularioDAO)
            }

            if (s12DB != null) {
                s12DB.s12_A = formularioForm2.s12_A
                s12DB.s12_B = formularioForm2.s12_B
                s12DB.s12_C = formularioForm2.s12_C
                s12DB.s12_D = formularioForm2.s12_D
                s12DB.s12_D_f = formularioForm2.s12_D_f
                s12FormularioRepository.save(s12DB)
            } else {
                val s12FormularioDAO = S12Formulario(
                        processId = formularioForm2.processId,
                        s12_A = formularioForm2.s12_A,
                        s12_B = formularioForm2.s12_B,
                        s12_C = formularioForm2.s12_C,
                        s12_D = formularioForm2.s12_D,
                        s12_D_f = formularioForm2.s12_D_f
                )
                s12FormularioRepository.save(s12FormularioDAO)
            }

            if (s13DB != null) {
                s13DB.s13_1_A = formularioForm2.s13_1_A
                s13DB.s13_1_B = formularioForm2.s13_1_B
                s13DB.s13_1_B_f = formularioForm2.s13_1_B_f
                s13DB.s13_2_A = formularioForm2.s13_2_A
                s13DB.s13_2_B = formularioForm2.s13_2_B
                s13DB.s13_2_C = formularioForm2.s13_2_C
                s13DB.s13_2_D = formularioForm2.s13_2_D
                s13DB.s13_2_E = formularioForm2.s13_2_E
                s13DB.s13_2_F = formularioForm2.s13_2_F
                s13DB.s13_2_G = formularioForm2.s13_2_G
                s13DB.s13_2_H = formularioForm2.s13_2_H
                s13DB.s13_2_I = formularioForm2.s13_2_I
                s13DB.s13_2_J = formularioForm2.s13_2_J
                s13DB.s13_2_J_f = formularioForm2.s13_2_J_f
                s13DB.s13_2_L = formularioForm2.s13_2_L
                s13DB.s13_2_L_f = formularioForm2.s13_2_L_f
                s13DB.s13_2_M = formularioForm2.s13_2_M
                s13DB.s13_2_M_f = formularioForm2.s13_2_M_f
                s13DB.s13_2_N = formularioForm2.s13_2_N
                s13DB.s13_2_N_f = formularioForm2.s13_2_N_f
                s13DB.s13_2_O = formularioForm2.s13_2_O
                s13FormularioRepository.save(s13DB)
            } else {
                val s13FormularioDAO = S13Formulario(processId = formularioForm2.processId,
                        s13_1_A = formularioForm2.s13_1_A,
                        s13_1_B = formularioForm2.s13_1_B,
                        s13_1_B_f = formularioForm2.s13_1_B_f,
                        s13_2_A = formularioForm2.s13_2_A,
                        s13_2_B = formularioForm2.s13_2_B,
                        s13_2_C = formularioForm2.s13_2_C,
                        s13_2_D = formularioForm2.s13_2_D,
                        s13_2_E = formularioForm2.s13_2_E,
                        s13_2_F = formularioForm2.s13_2_F,
                        s13_2_G = formularioForm2.s13_2_G,
                        s13_2_H = formularioForm2.s13_2_H,
                        s13_2_I = formularioForm2.s13_2_I,
                        s13_2_J = formularioForm2.s13_2_J,
                        s13_2_J_f = formularioForm2.s13_2_J_f,
                        s13_2_L = formularioForm2.s13_2_L,
                        s13_2_L_f = formularioForm2.s13_2_L_f,
                        s13_2_M = formularioForm2.s13_2_M,
                        s13_2_M_f = formularioForm2.s13_2_M_f,
                        s13_2_N = formularioForm2.s13_2_N,
                        s13_2_N_f = formularioForm2.s13_2_N_f,
                        s13_2_O = formularioForm2.s13_2_O
                )
                s13FormularioRepository.save(s13FormularioDAO)
            }

            if (s14DB != null) {
                s14DB.s14_A = formularioForm2.s14_A
                s14DB.s14_B = formularioForm2.s14_B
                s14DB.s14_C = formularioForm2.s14_C
                s14DB.s14_D = formularioForm2.s14_D
                s14DB.s14_E = formularioForm2.s14_E
                s14DB.s14_F = formularioForm2.s14_F
                s14DB.s14_G = formularioForm2.s14_G
                s14DB.s14_H = formularioForm2.s14_H
                s14DB.s14_H_f = formularioForm2.s14_H_f
                s14DB.s14_I = formularioForm2.s14_I
                s14DB.s14_I_f = formularioForm2.s14_I_f
                s14DB.s14_J = formularioForm2.s14_J
                s14DB.s14_J_f = formularioForm2.s14_J_f
                s14DB.s14_L = formularioForm2.s14_L
                s14DB.s14_L_f = formularioForm2.s14_L_f
                s14FormularioRepository.save(s14DB)
            } else {
                val s14FormularioDAO = S14Formulario(processId = formularioForm2.processId,
                        s14_A = formularioForm2.s14_A,
                        s14_B = formularioForm2.s14_B,
                        s14_C = formularioForm2.s14_C,
                        s14_D = formularioForm2.s14_D,
                        s14_E = formularioForm2.s14_E,
                        s14_F = formularioForm2.s14_F,
                        s14_G = formularioForm2.s14_G,
                        s14_H = formularioForm2.s14_H,
                        s14_H_f = formularioForm2.s14_H_f,
                        s14_I = formularioForm2.s14_I,
                        s14_I_f = formularioForm2.s14_I_f,
                        s14_J = formularioForm2.s14_J,
                        s14_J_f = formularioForm2.s14_J_f,
                        s14_L = formularioForm2.s14_L,
                        s14_L_f = formularioForm2.s14_L_f
                )
                s14FormularioRepository.save(s14FormularioDAO)
            }
        }


        redirectAttributes.addFlashAttribute("message", "Página 2 do formulário gravada. Pode continuar a preencher")

        when (formularioForm2.operation) {

            "<< Recuar" -> return "redirect:/form/edit/${processId}/1"

            "Gravar" -> {
                val s1DB = s1FormularioRepository.findByProcessId(processId)
                val data1 = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
                if (s1DB != null) {
                    s1DB.lastUpdate = data1.format(Date())
                    s1FormularioRepository.save(s1DB);
                }
                return "redirect:/form/edit/${processId}/2"}  // volta a mostrar a página 2 em edição

            "Avançar >>" -> return "redirect:/form/edit/${processId}/3"
            else -> throw Exception("invalid operation: ${formularioForm2.operation}")
        }
    }



    @PostMapping(value = [ "/edit/{processId}/3"])
    fun postFormularioForm3(@Valid @ModelAttribute("formularioForm3") formularioForm3: FormularioForm3,
                            @PathVariable("processId") processIdParam: String?,
                            bindingResult: BindingResult, model:ModelMap,
                            redirectAttributes: RedirectAttributes) : String {

        val s1DB = if (formularioForm3.processId == null) null else s1FormularioRepository.findByProcessId(formularioForm3.processId)

        if (bindingResult.hasErrors() && (s1DB == null || s1DB.estado != "Submetido")) {
            return "new-formulario-form3"
        }

        val processId = formularioForm3.processId!!

        if (s1DB == null || s1DB.estado != "Submetido"){
            //ir buscar á database
            val s15DB = s15FormularioRepository.findByProcessId(processId)
            val s16DB = s16FormularioRepository.findByProcessId(processId)
            val s17DB = s17FormularioRepository.findByProcessId(processId)
            val s18DB = s18FormularioRepository.findByProcessId(processId)
            val s19DB = s19FormularioRepository.findByProcessId(processId)
            val s20DB = s20FormularioRepository.findByProcessId(processId)
            val s21DB = s21FormularioRepository.findByProcessId(processId)


            if(s15DB != null){
                s15DB.s15 = formularioForm3.s15
            } else {
                val s15FormularioDAO = S15Formulario(processId = formularioForm3.processId,
                        s15 = formularioForm3.s15,
                )
                s15FormularioRepository.save(s15FormularioDAO)
            }

            if (s16DB != null){
                s16DB.s16_1_A = formularioForm3.s16_1_A
                s16DB.s16_1_B = formularioForm3.s16_1_B
                s16DB.s16_1_B_f = formularioForm3.s16_1_B_f
            } else {
                val s16FormularioDAO = S16Formulario(processId = formularioForm3.processId,
                        s16_1_A = formularioForm3.s16_1_A,
                        s16_1_B = formularioForm3.s16_1_B,
                        s16_1_B_f = formularioForm3.s16_1_B_f,
                )
                s16FormularioRepository.save(s16FormularioDAO)
            }

            if(s17DB != null){
                s17DB.s17_A = formularioForm3.s17_A
                s17DB.s17_B = formularioForm3.s17_B
                s17DB.s17_C = formularioForm3.s17_C
                s17DB.s17_D = formularioForm3.s17_D
                s17DB.s17_E = formularioForm3.s17_E
                s17DB.s17_E_f = formularioForm3.s17_E_f
                s17DB.s17_F = formularioForm3.s17_F
                s17DB.s17_1_A = formularioForm3.s17_1_A
                s17DB.s17_1_B = formularioForm3.s17_1_B
                s17DB.s17_1_B_f = formularioForm3.s17_1_B_f
                s17DB.s17_2 = formularioForm3.s17_2
                s17DB.s17_2_f = formularioForm3.s17_2_f
                s17DB.s17_3 = formularioForm3.s17_3
                s17DB.s17_3_f = formularioForm3.s17_3_f
                s17DB.s17_4 = formularioForm3.s17_4
                s17DB.s17_4_1_A = formularioForm3.s17_4_1_A
                s17DB.s17_4_1_B = formularioForm3.s17_4_1_B
                s17DB.s17_4_2_A = formularioForm3.s17_4_2_A
                s17DB.s17_4_2_B = formularioForm3.s17_4_2_B
                s17DB.s17_4_2_B_f = formularioForm3.s17_4_2_B_f
                s17DB.s17_5 = formularioForm3.s17_5
                s17DB.s17_6 = formularioForm3.s17_6
                s17DB.s17_6_f = formularioForm3.s17_6_f
            } else {
                val s17FormularioDAO = S17Formulario(processId = formularioForm3.processId,
                        s17_A = formularioForm3.s17_A,
                        s17_B = formularioForm3.s17_B,
                        s17_C = formularioForm3.s17_C,
                        s17_D = formularioForm3.s17_D,
                        s17_E = formularioForm3.s17_E,
                        s17_E_f = formularioForm3.s17_E_f,
                        s17_F = formularioForm3.s17_F,
                        s17_1_A = formularioForm3.s17_1_A,
                        s17_1_B = formularioForm3.s17_1_B,
                        s17_1_B_f = formularioForm3.s17_1_B_f,
                        s17_2 = formularioForm3.s17_2,
                        s17_2_f = formularioForm3.s17_2_f,
                        s17_3 = formularioForm3.s17_3,
                        s17_3_f = formularioForm3.s17_3_f,
                        s17_4 = formularioForm3.s17_4,
                        s17_4_1_A = formularioForm3.s17_4_1_A,
                        s17_4_1_B = formularioForm3.s17_4_1_B,
                        s17_4_2_A = formularioForm3.s17_4_2_A,
                        s17_4_2_B = formularioForm3.s17_4_2_B,
                        s17_4_2_B_f = formularioForm3.s17_4_2_B_f,
                        s17_5 = formularioForm3.s17_5,
                        s17_6 = formularioForm3.s17_6,
                        s17_6_f = formularioForm3.s17_6_f,
                )
                s17FormularioRepository.save(s17FormularioDAO)
            }

            if (s18DB != null){
                s18DB.s18_1 = formularioForm3.s18_1
                s18DB.s18_1_A = formularioForm3.s18_1_A
                s18DB.s18_1_B = formularioForm3.s18_1_B
                s18DB.s18_1_C = formularioForm3.s18_1_C
                s18DB.s18_1_D = formularioForm3.s18_1_D
                s18DB.s18_1_E = formularioForm3.s18_1_E
                s18DB.s18_1_E_f = formularioForm3.s18_1_E_f
                s18DB.s18_2 = formularioForm3.s18_2
                s18DB.s18_2_A = formularioForm3.s18_2_A
                s18DB.s18_2_B = formularioForm3.s18_2_B
                s18DB.s18_2_C = formularioForm3.s18_2_C
                s18DB.s18_2_D = formularioForm3.s18_2_D
                s18DB.s18_2_E = formularioForm3.s18_2_E
                s18DB.s18_2_F = formularioForm3.s18_2_F
                s18DB.s18_2_G = formularioForm3.s18_2_G
                s18DB.s18_2_G_f = formularioForm3.s18_2_G_f
                s18DB.s18_3_A = formularioForm3.s18_3_A
                s18DB.s18_3_B = formularioForm3.s18_3_B
                s18DB.s18_3_B_f = formularioForm3.s18_3_B_f
                s18DB.s18_4 = formularioForm3.s18_4
                s18DB.s18_4_A = formularioForm3.s18_4_A
                s18DB.s18_4_B = formularioForm3.s18_4_B
                s18DB.s18_4_C = formularioForm3.s18_4_C
                s18DB.s18_4_C_f = formularioForm3.s18_4_C_f
                s18DB.s18_4_D = formularioForm3.s18_4_D
                s18DB.s18_4_D_f = formularioForm3.s18_4_D_f
                s18DB.s18_4_E = formularioForm3.s18_4_E
                s18DB.s18_4_E_f = formularioForm3.s18_4_E_f
                s18DB.s18_4_F = formularioForm3.s18_4_F
                s18DB.s18_4_F_f = formularioForm3.s18_4_F_f
                s18DB.s18_4_1 = formularioForm3.s18_4_1
            } else {
                val s18FormularioDAO = S18Formulario(processId = formularioForm3.processId,
                        s18_1 = formularioForm3.s18_1,
                        s18_1_A = formularioForm3.s18_1_A,
                        s18_1_B = formularioForm3.s18_1_B,
                        s18_1_C = formularioForm3.s18_1_C,
                        s18_1_D = formularioForm3.s18_1_D,
                        s18_1_E = formularioForm3.s18_1_E,
                        s18_1_E_f = formularioForm3.s18_1_E_f,
                        s18_2 = formularioForm3.s18_2,
                        s18_2_A = formularioForm3.s18_2_A,
                        s18_2_B = formularioForm3.s18_2_B,
                        s18_2_C = formularioForm3.s18_2_C,
                        s18_2_D = formularioForm3.s18_2_D,
                        s18_2_E = formularioForm3.s18_2_E,
                        s18_2_F = formularioForm3.s18_2_F,
                        s18_2_G = formularioForm3.s18_2_G,
                        s18_2_G_f = formularioForm3.s18_2_G_f,
                        s18_3_A = formularioForm3.s18_3_A,
                        s18_3_B = formularioForm3.s18_3_B,
                        s18_3_B_f = formularioForm3.s18_3_B_f,
                        s18_4 = formularioForm3.s18_4,
                        s18_4_A = formularioForm3.s18_4_A,
                        s18_4_B = formularioForm3.s18_4_B,
                        s18_4_C = formularioForm3.s18_4_C,
                        s18_4_C_f = formularioForm3.s18_4_C_f,
                        s18_4_D = formularioForm3.s18_4_D,
                        s18_4_D_f = formularioForm3.s18_4_D_f,
                        s18_4_E = formularioForm3.s18_4_E,
                        s18_4_E_f = formularioForm3.s18_4_E_f,
                        s18_4_F = formularioForm3.s18_4_F,
                        s18_4_F_f = formularioForm3.s18_4_F_f,
                        s18_4_1 = formularioForm3.s18_4_1,
                )
                s18FormularioRepository.save(s18FormularioDAO)
            }

            if(s19DB != null){
                s19DB.s19_1 = formularioForm3.s19_1
                s19DB.s19_1_1 = formularioForm3.s19_1_1
                s19DB.s19_1_2 = formularioForm3.s19_1_2
                s19DB.s19_1_3 = formularioForm3.s19_1_3
                s19DB.s19_1_4 = formularioForm3.s19_1_4
                s19DB.s19_1_5 = formularioForm3.s19_1_5
                s19DB.s19_1_6 = formularioForm3.s19_1_6
                s19DB.s19_1_7 = formularioForm3.s19_1_7
                s19DB.s19_1_8 = formularioForm3.s19_1_8
                s19DB.s19_1_9 = formularioForm3.s19_1_9
                s19DB.s19_1_10 = formularioForm3.s19_1_10
                s19DB.s19_1_11 = formularioForm3.s19_1_11
                s19DB.s19_1_12 = formularioForm3.s19_1_12
                s19DB.s19_1_13 = formularioForm3.s19_1_13
                s19DB.s19_1_14 = formularioForm3.s19_1_14
                s19DB.s19_1_15 = formularioForm3.s19_1_15
                s19DB.s19_1_16 = formularioForm3.s19_1_16
                s19DB.s19_1_17 = formularioForm3.s19_1_17
                s19DB.s19_1_17_f = formularioForm3.s19_1_17_f
                s19DB.s19_2 = formularioForm3.s19_2
                s19DB.s19_2_1 = formularioForm3.s19_2_1
                s19DB.s19_2_2 = formularioForm3.s19_2_2
                s19DB.s19_2_3 = formularioForm3.s19_2_3
                s19DB.s19_2_4 = formularioForm3.s19_2_4
                s19DB.s19_2_5 = formularioForm3.s19_2_5
                s19DB.s19_2_6 = formularioForm3.s19_2_6
                s19DB.s19_2_7 = formularioForm3.s19_2_7
                s19DB.s19_2_8 = formularioForm3.s19_2_8
                s19DB.s19_2_9 = formularioForm3.s19_2_9
                s19DB.s19_2_10 = formularioForm3.s19_2_10
                s19DB.s19_2_11 = formularioForm3.s19_2_11
                s19DB.s19_2_12 = formularioForm3.s19_2_12
                s19DB.s19_2_13 = formularioForm3.s19_2_13
                s19DB.s19_2_14 = formularioForm3.s19_2_14
                s19DB.s19_2_15 = formularioForm3.s19_2_15
                s19DB.s19_2_16 = formularioForm3.s19_2_16
                s19DB.s19_2_17 = formularioForm3.s19_2_17
                s19DB.s19_2_18 = formularioForm3.s19_2_17
                s19DB.s19_2_19 = formularioForm3.s19_2_19
                s19DB.s19_2_19_f = formularioForm3.s19_2_19_f
                s19DB.s19_2_20 = formularioForm3.s19_2_20
                s19DB.s19_2_20_f = formularioForm3.s19_2_20_f
            } else {
                val s19FormularioDAO = S19Formulario(processId = formularioForm3.processId,
                        s19_1 = formularioForm3.s19_1 ,
                        s19_1_1 = formularioForm3.s19_1_1,
                        s19_1_2 = formularioForm3.s19_1_2,
                        s19_1_3 = formularioForm3.s19_1_3,
                        s19_1_4 = formularioForm3.s19_1_4,
                        s19_1_5 = formularioForm3.s19_1_5,
                        s19_1_6 = formularioForm3.s19_1_6,
                        s19_1_7 = formularioForm3.s19_1_7,
                        s19_1_8 = formularioForm3.s19_1_8,
                        s19_1_9 = formularioForm3.s19_1_9,
                        s19_1_10 = formularioForm3.s19_1_10,
                        s19_1_11 = formularioForm3.s19_1_11,
                        s19_1_12 = formularioForm3.s19_1_12,
                        s19_1_13 = formularioForm3.s19_1_13,
                        s19_1_14 = formularioForm3.s19_1_14,
                        s19_1_15 = formularioForm3.s19_1_15,
                        s19_1_16 = formularioForm3.s19_1_16,
                        s19_1_17 = formularioForm3.s19_1_17,
                        s19_1_17_f = formularioForm3.s19_1_17_f,
                        s19_2 = formularioForm3.s19_2,
                        s19_2_1 = formularioForm3.s19_2_1,
                        s19_2_2 = formularioForm3.s19_2_2,
                        s19_2_3 = formularioForm3.s19_2_3,
                        s19_2_4 = formularioForm3.s19_2_4,
                        s19_2_5 = formularioForm3.s19_2_5,
                        s19_2_6 = formularioForm3.s19_2_6,
                        s19_2_7 = formularioForm3.s19_2_7,
                        s19_2_8 = formularioForm3.s19_2_8,
                        s19_2_9 = formularioForm3.s19_2_9,
                        s19_2_10 = formularioForm3.s19_2_10,
                        s19_2_11 = formularioForm3.s19_2_11,
                        s19_2_12 = formularioForm3.s19_2_12,
                        s19_2_13 = formularioForm3.s19_2_13,
                        s19_2_14 = formularioForm3.s19_2_14,
                        s19_2_15 = formularioForm3.s19_2_15,
                        s19_2_16 = formularioForm3.s19_2_16,
                        s19_2_17 = formularioForm3.s19_2_17,
                        s19_2_18 = formularioForm3.s19_2_17,
                        s19_2_19 = formularioForm3.s19_2_19,
                        s19_2_19_f = formularioForm3.s19_2_19_f,
                        s19_2_20 = formularioForm3.s19_2_20,
                        s19_2_20_f = formularioForm3.s19_2_20_f,
                )
                s19FormularioRepository.save(s19FormularioDAO)
            }

            if (s20DB != null){
                s20DB.s20_1_A = formularioForm3.s20_1_A
                s20DB.s20_1_B = formularioForm3.s20_1_B
                s20DB.s20_1_C = formularioForm3.s20_1_C
                s20DB.s20_1_D = formularioForm3.s20_1_D
                s20DB.s20_1_E = formularioForm3.s20_1_E
                s20DB.s20_1_F = formularioForm3.s20_1_F
                s20DB.s20_1_F_f = formularioForm3.s20_1_F_f
                s20DB.s20_1_1 = formularioForm3.s20_1_1
                s20DB.s20_2 = formularioForm3.s20_2
                s20DB.s20_2_1 = formularioForm3.s20_2_1
            } else {
                val s20FormularioDAO = S20Formulario(processId = formularioForm3.processId,
                        s20_1_A = formularioForm3.s20_1_A,
                        s20_1_B = formularioForm3.s20_1_B,
                        s20_1_C = formularioForm3.s20_1_C,
                        s20_1_D = formularioForm3.s20_1_D,
                        s20_1_E =  formularioForm3.s20_1_E,
                        s20_1_F = formularioForm3.s20_1_F,
                        s20_1_F_f = formularioForm3.s20_1_F_f,
                        s20_1_1 = formularioForm3.s20_1_1,
                        s20_2 = formularioForm3.s20_2,
                        s20_2_1 = formularioForm3.s20_2_1,
                )
                s20FormularioRepository.save(s20FormularioDAO)
            }

            if (s21DB != null){
                s21DB.s21_1_A = formularioForm3.s21_1_A
                s21DB.s21_1_B = formularioForm3.s21_1_B
                s21DB.s21_1_C = formularioForm3.s21_1_C
                s21DB.s21_1_D = formularioForm3.s21_1_D
                s21DB.s21_1_E = formularioForm3.s21_1_E
                s21DB.s21_1_1 = formularioForm3.s21_1_1
                s21DB.s21_1_2_A = formularioForm3.s21_1_2_A
                s21DB.s21_1_2_B = formularioForm3.s21_1_2_B
                s21DB.s21_1_2_B_f = formularioForm3.s21_1_2_B_f
                s21DB.s21_3_A = formularioForm3.s21_3_A
                s21DB.s21_3_B = formularioForm3.s21_3_B
                s21DB.s21_3_C = formularioForm3.s21_3_C
                s21DB.s21_3_D = formularioForm3.s21_3_D
                s21DB.s21_3_E = formularioForm3.s21_3_E
                s21DB.s21_3_1 = formularioForm3.s21_3_1
                s21DB.s21_3_2_A = formularioForm3.s21_3_2_A
                s21DB.s21_3_2_B = formularioForm3.s21_3_2_B
                s21DB.s21_3_2_B_f = formularioForm3.s21_3_2_B_f
                s21DB.s21_4_A = formularioForm3.s21_4_A
                s21DB.s21_4_B = formularioForm3.s21_4_B
                s21DB.s21_4_1_A = formularioForm3.s21_4_1_A
                s21DB.s21_4_1_B = formularioForm3.s21_4_1_B
            } else {
                val s21FormularioDAO = S21Formulario(processId = formularioForm3.processId,
                        s21_1_A = formularioForm3.s21_1_A,
                        s21_1_B = formularioForm3.s21_1_B,
                        s21_1_C = formularioForm3.s21_1_C,
                        s21_1_D = formularioForm3.s21_1_D,
                        s21_1_E = formularioForm3.s21_1_E,
                        s21_1_1 = formularioForm3.s21_1_1,
                        s21_1_2_A = formularioForm3.s21_1_2_A,
                        s21_1_2_B = formularioForm3.s21_1_2_B,
                        s21_1_2_B_f = formularioForm3.s21_1_2_B_f,
                        s21_3_A = formularioForm3.s21_3_A,
                        s21_3_B = formularioForm3.s21_3_B,
                        s21_3_C = formularioForm3.s21_3_C,
                        s21_3_D = formularioForm3.s21_3_D,
                        s21_3_E = formularioForm3.s21_3_E,
                        s21_3_1 = formularioForm3.s21_3_1,
                        s21_3_2_A = formularioForm3.s21_3_2_A,
                        s21_3_2_B = formularioForm3.s21_3_2_B,
                        s21_3_2_B_f = formularioForm3.s21_3_2_B_f,
                        s21_4_A = formularioForm3.s21_4_A,
                        s21_4_B = formularioForm3.s21_4_B,
                        s21_4_1_A = formularioForm3.s21_4_1_A,
                        s21_4_1_B = formularioForm3.s21_4_1_B,
                )
                s21FormularioRepository.save(s21FormularioDAO)
            }
        }

        when (formularioForm3.operation) {

            "<< Recuar" -> return "redirect:/form/edit/${processId}/2"

            "Gravar" -> {
                val s1DB = s1FormularioRepository.findByProcessId(processId)
                redirectAttributes.addFlashAttribute("message", "Página 3 do formulário gravada. Pode continuar a preencher")
                val data1 = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
                if (s1DB != null) {
                    s1DB.lastUpdate = data1.format(Date())
                    s1FormularioRepository.save(s1DB);
                }
                return "redirect:/form/edit/${processIdParam}/3"  // volta a mostrar a página 3 em edição
            }
            "Submeter" -> {
                val s1DB = s1FormularioRepository.findByProcessId(processId)
                val data1 = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
                if (s1DB != null){
                    s1DB.estado = "Submetido"
                    s1DB.lastUpdate = data1.format(Date())
                    s1FormularioRepository.save(s1DB);
                }
                redirectAttributes.addFlashAttribute("message", "Processo ${processIdParam} submetido com sucesso.")
                return "redirect:/form/list"
            }
            "Fechar" -> {
                return "redirect:/form/list"  // volta para a lista de processos
            }
            else -> throw Exception("invalid operation: ${formularioForm3.operation}")
        }
    }
}