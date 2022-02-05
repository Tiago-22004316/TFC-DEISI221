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
import javax.validation.Valid

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

    @GetMapping(value = ["/edit/{processId}"])
    fun editForm(@PathVariable("processId") processId: String, model: ModelMap): String {

        //ir buscar á database
        val s1DB = s1FormularioRepository.findByProcessId(processId)
        val s2DB = s2FormularioRepository.findByProcessId(processId)
        val s3DB = s3FormularioRepository.findByProcessId(processId)
        val s4DB = s4FormularioRepository.findByProcessId(processId)
        val s5DB = s5FormularioRepository.findByProcessId(processId)
        val s6DB = s6FormularioRepository.findByProcessId(processId)
        val s7DB = s7FormularioRepository.findByProcessId(processId)
        val s8DB = s8FormularioRepository.findByProcessId(processId)
        val s9DB = s9FormularioRepository.findByProcessId(processId)
        val s10DB = s10FormularioRepository.findByProcessId(processId)
        val s11DB = s11FormularioRepository.findByProcessId(processId)
        val s12DB = s12FormularioRepository.findByProcessId(processId)
        val s13DB = s13FormularioRepository.findByProcessId(processId)

        // criar forms
        val formularioForm1 = FormularioForm1()
        val formularioForm2 = FormularioForm2()
        val formularioForm3 = FormularioForm3()

        formularioForm1.processId = processId
        formularioForm2.processId = processId
        formularioForm3.processId = processId

        // começar a preencher os forms ( esperar q os campos sejam reajustados )
        if (s2DB != null) {
            formularioForm1.s2_A = s2DB.s2_A
            formularioForm1.s2_B = s2DB.s2_B
        }

        model["formularioForm1"] = formularioForm1
        model["formularioForm2"] = formularioForm2
        model["formularioForm3"] = formularioForm3

        return "new-formulario-form1"
    }

    @GetMapping(value = ["/1"])
    fun showFormularioForm1(model:ModelMap): String {
        model["formularioForm1"] = FormularioForm1()
        return "new-formulario-form1"
    }

    @GetMapping(value = ["/2"])
    fun showFormularioForm2(model:ModelMap): String {
        model["formularioForm2"] = FormularioForm2()
        return "new-formulario-form2"
    }

    @GetMapping(value = ["/3"])
    fun showFormularioForm3(model:ModelMap): String {
        model["formularioForm3"] = FormularioForm3()
        return "new-formulario-form3"
    }


    @PostMapping(value = ["/1"])
    fun postFormularioForm1(@Valid @ModelAttribute("formularioForm1") formularioForm1: FormularioForm1,
                 bindingResult: BindingResult,
                 redirectAttributes: RedirectAttributes) : String {

        if (bindingResult.hasErrors()) {
            return "new-formulario-form1"
        }

        val processId = formularioForm1.processId!!  // it is safe doing this since processId is a mandatory field
        val s1DB = s1FormularioRepository.findByProcessId(processId)

        if (s1DB == null) {  // new form

            //guardar na base de dados
            val s1FormularioDAO = S1Formulario(processId = processId)
            s1FormularioRepository.save(s1FormularioDAO)

            val s2FormularioDAO = S2Formulario(processId = processId, s2_A = formularioForm1.s2_A, s2_B = formularioForm1.s2_B)
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
                s4_2 = formularioForm1.s4_2,
                s4_2_A = formularioForm1.s4_2_A,
                    s4_2_B = formularioForm1.s4_2_B,
                    s4_3 = formularioForm1.s4_3,
                    s4_3_f = formularioForm1.s4_3_f
            )
            s4FormularioRepository.save(s4FormularioDAO)

            val s5FormularioDAO = S5Formulario(
                processId = processId,
                s5_2_A = formularioForm1.s5_2_A,
                    s5_2_B = formularioForm1.s5_2_B,
                    s5_3_A = formularioForm1.s5_3_A,
                    s5_3_B = formularioForm1.s5_3_B,
                    s5_3_C = formularioForm1.s5_3_C,
                    s5_3_D = formularioForm1.s5_3_D,
                    s5_4_A = formularioForm1.s5_4_A,
                    s5_4_B = formularioForm1.s5_4_B,
                    s5_4_C = formularioForm1.s5_4_C,
                    s5_4_D = formularioForm1.s5_4_D,
                    s5_4_D_f = formularioForm1.s5_4_D_f,
                    s5_5_A = formularioForm1.s5_5_A,
                    s5_5_B = formularioForm1.s5_5_B,
                    s5_5_C = formularioForm1.s5_5_C,
                    s5_5_D = formularioForm1.s5_5_D,
                    s5_5_E = formularioForm1.s5_5_E,
                    s5_5_F = formularioForm1.s5_5_F,
                    s5_5_G = formularioForm1.s5_5_G,
                    s5_5_H = formularioForm1.s5_5_H,
                    s5_5_I = formularioForm1.s5_5_I,
                    s5_5_J = formularioForm1.s5_5_J,
                    s5_5_L = formularioForm1.s5_5_L,
                    s5_6_1_A = formularioForm1.s5_6_1_A,
                    s5_6_1_B = formularioForm1.s5_6_1_B,
                    s5_6_1_C = formularioForm1.s5_6_1_C,
                    s5_6_1_D = formularioForm1.s5_6_1_D,
                    s5_6_1_E = formularioForm1.s5_6_1_E,
                    s5_6_1_F = formularioForm1.s5_6_1_F,
                    s5_6_1_G = formularioForm1.s5_6_1_G,
                    s5_6_1_H = formularioForm1.s5_6_1_H,
                    s5_6_1_I = formularioForm1.s5_6_1_I,
                    s5_6_1_J = formularioForm1.s5_6_1_J,
                    s5_6_1_L = formularioForm1.s5_6_1_L,
                    s5_6_1_M = formularioForm1.s5_6_1_M,
                    s5_6_1_N = formularioForm1.s5_6_1_N,
                    s5_6_1_O = formularioForm1.s5_6_1_O,
                    s5_6_1_P = formularioForm1.s5_6_1_P,
                    s5_6_1_Q = formularioForm1.s5_6_1_Q
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

            val s7FormularioDAO = S7Formulario(s7_1 = formularioForm1.s7_1,
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
            s2DB.s2_A = formularioForm1.s2_A
            s2DB.s2_B = formularioForm1.s2_B
            s2FormularioRepository.save(s2DB)

            // TODO falta fazer as restantes secções

        }

        return "redirect:/form/2"
    }



    @PostMapping(value = ["/2"])
    fun formForm(@Valid @ModelAttribute("formularioForm2") formularioForm2: FormularioForm2,
                 bindingResult: BindingResult,
                 redirectAttributes: RedirectAttributes) : String {

        if (bindingResult.hasErrors()) {
            return "new-formulario-form2"
        }

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

        val s12FormularioDAO = S12Formulario(processId = formularioForm2.processId,
            s12_A = formularioForm2.s12_A,
            s12_B = formularioForm2.s12_B,
            s12_C = formularioForm2.s12_C,
            s12_D = formularioForm2.s12_D,
            s12_D_f = formularioForm2.s12_D_f
            )
        s12FormularioRepository.save(s12FormularioDAO)

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

        return "redirect:/form/3"
    }



    @PostMapping(value = ["/3"])
    fun formForm(@Valid @ModelAttribute("formularioForm3") formularioForm3: FormularioForm3,
                 bindingResult: BindingResult,
                 redirectAttributes: RedirectAttributes) : String {

        if (bindingResult.hasErrors()) {
            return "new-formulario-form3"
        }

        val s10FormularioDAO = S10Formulario(s10_1_a = formularioForm3.s10_1_a,
                s10_1_b = formularioForm3.s10_1_b,
                s10_1_c = formularioForm3.s10_1_c,
                s10_1_d = formularioForm3.s10_1_d,
                s10_1_e = formularioForm3.s10_1_e,
                s10_1_F = formularioForm3.s10_1_F,
                s10_1_F_f = formularioForm3.s10_1_F_f,
                s10_2 = formularioForm3.s10_2,
                s10_3_1 = formularioForm3.s10_3_1,
                s10_3_2 = formularioForm3.s10_3_2)
        s10FormularioRepository.save(s10FormularioDAO)

        val s11FormularioDAO = S11Formulario(s11_1 = formularioForm3.s11_1)
        s11FormularioRepository.save(s11FormularioDAO)

        val s12FormularioDAO = S12Formulario(s12_1_a = formularioForm3.s12_1_a,
                s12_1_b = formularioForm3.s12_1_b,
                s12_1_c = formularioForm3.s12_1_c,
                s12_1_d = formularioForm3.s12_1_d,
                s12_1_e = formularioForm3.s12_1_e,
                s12_1_1 = formularioForm3.s12_1_1,
                s12_1_2_a = formularioForm3.s12_1_2_a,
                s12_1_2_b = formularioForm3.s12_1_2_b,
                s12_1_2_f = formularioForm3.s12_1_2_f,
                s12_2_1 = formularioForm3.s12_1_1,
                s12_2_a = formularioForm3.s12_2_a,
                s12_2_b = formularioForm3.s12_2_b,
                s12_2_c = formularioForm3.s12_2_c,
                s12_2_d = formularioForm3.s12_2_d,
                s12_2_e = formularioForm3.s12_2_e,
                s12_2_2_a = formularioForm3.s12_1_2_a,
                s12_2_2_b = formularioForm3.s12_1_2_b,
                s12_2_2_f = formularioForm3.s12_1_2_f,
                s12_3_1 = formularioForm3.s12_3_1,
                s12_3_2_a = formularioForm3.s12_3_2_a,
                s12_3_2_b = formularioForm3.s12_3_2_b,
                s12_3_2_f = formularioForm3.s12_1_2_f,
                s12_3_a = formularioForm3.s12_3_a,
                s12_3_b = formularioForm3.s12_3_b,
                s12_3_c = formularioForm3.s12_3_c,
                s12_3_d = formularioForm3.s12_3_d,
                s12_3_e = formularioForm3.s12_3_e,
                s12_4_1_a = formularioForm3.s12_4_1_a,
                s12_4_1_b = formularioForm3.s12_4_1_b,
                s12_4_a = formularioForm3.s12_4_a,
                s12_4_b = formularioForm3.s12_4_b)
        s12FormularioRepository.save(s12FormularioDAO)

        val s13FormularioDAO = S13Formulario( s13_1_2_a = formularioForm3.s13_1_2_a,
                s13_1_2_b = formularioForm3.s13_1_2_b,
                s13_1_3_a = formularioForm3.s13_1_3_a,
                s13_1_3_b = formularioForm3.s13_1_3_b,
                s13_1_3_c = formularioForm3.s13_1_3_c,
                s13_1_3_d = formularioForm3.s13_1_3_d,
                s13_1_4_a = formularioForm3.s13_1_4_a,
                s13_1_4_b = formularioForm3.s13_1_4_b,
                s13_1_4_c = formularioForm3.s13_1_4_c,
                s13_1_4_d = formularioForm3.s13_1_4_d,
                s13_1_4_d_f = formularioForm3.s13_1_4_d_f,
                s13_1_5_a = formularioForm3.s13_1_5_a,
                s13_1_5_b = formularioForm3.s13_1_5_b,
                s13_1_5_c = formularioForm3.s13_1_5_c,
                s13_1_5_d = formularioForm3.s13_1_5_d,
                s13_1_5_e = formularioForm3.s13_1_5_e,
                s13_1_5_F = formularioForm3.s13_1_5_F,
                s13_1_5_g = formularioForm3.s13_1_5_g,
                s13_1_5_h = formularioForm3.s13_1_5_h,
                s13_1_5_i = formularioForm3.s13_1_5_i,
                s13_1_5_j = formularioForm3.s13_1_5_j,
                s13_1_5_l = formularioForm3.s13_1_5_l,
                s13_2_a = formularioForm3.s13_2_a,
                s13_2_b = formularioForm3.s13_2_b,
                s13_2_c = formularioForm3.s13_2_c,
                s13_2_d = formularioForm3.s13_2_d,
                s13_2_e = formularioForm3.s13_2_e,
                s13_2_F = formularioForm3.s13_2_F,
                s13_2_g = formularioForm3.s13_2_g,
                s13_2_h = formularioForm3.s13_2_h,
                s13_2_i = formularioForm3.s13_2_i,
                s13_2_i_f = formularioForm3.s13_2_i_f,
                s13_3_a = formularioForm3.s13_3_a,
                s13_3_b = formularioForm3.s13_3_b,
                s13_3_c = formularioForm3.s13_3_c,
                s13_3_d = formularioForm3.s13_3_d,
                s13_3_e = formularioForm3.s13_3_e,
                s13_3_F = formularioForm3.s13_3_F,
                s13_3_g = formularioForm3.s13_3_g,
                s13_3_h = formularioForm3.s13_3_h,
                s13_3_i = formularioForm3.s13_3_i,
                s13_3_j = formularioForm3.s13_3_j,
                s13_3_l = formularioForm3.s13_3_l,
                s13_3_m = formularioForm3.s13_3_m,
                s13_3_n = formularioForm3.s13_3_n,
                s13_3_o = formularioForm3.s13_3_o,
                s13_3_p = formularioForm3.s13_3_p,
                s13_3_q = formularioForm3.s13_3_q)
        s13FormularioRepository.save(s13FormularioDAO)

        // se ele chegou aqui, teve sucesso
        redirectAttributes.addFlashAttribute("message", "Processo inserido com sucesso")

        return "redirect:/form/list"
    }
}