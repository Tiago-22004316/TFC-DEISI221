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

            //guardar na base de dados
            val s1FormularioDAO = S1Formulario(processId = processId)
            s1FormularioRepository.save(s1FormularioDAO)

            val s2FormularioDAO = S2Formulario(processId = processId,
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

            val s7FormularioDAO = S7Formulario(processId = processId,
                    s7_1 = formularioForm1.s7_1,
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

        val s15FormularioDAO = S15Formulario(processId = formularioForm3.processId,
                s15 = formularioForm3.s15,
                )
        s15FormularioRepository.save(s15FormularioDAO)

        val s16FormularioDAO = S16Formulario(processId = formularioForm3.processId,
            s16_1_A = formularioForm3.s16_1_A,
            s16_1_B = formularioForm3.s16_1_B,
            s16_1_B_f = formularioForm3.s16_1_B_f,
            )
        s16FormularioRepository.save(s16FormularioDAO)

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

        val s19FormularioDAO = S19Formulario(processId = formularioForm3.processId,
            s19_1_A = formularioForm3.s19_1_A,
            s19_1_B = formularioForm3.s19_1_B,
            s19_1_C = formularioForm3.s19_1_C,
            s19_1_D = formularioForm3.s19_1_D,
            s19_1_E = formularioForm3.s19_1_E,
            s19_1_F = formularioForm3.s19_1_F,
            s19_1_F_f = formularioForm3.s19_1_F_f,
            s19_2 = formularioForm3.s19_2,
            s19_3_1 = formularioForm3.s19_3_1,
            s19_3_2 = formularioForm3.s19_3_2,
            )
        s19FormularioRepository.save(s19FormularioDAO)

        val s20FormularioDAO = S20Formulario(processId = formularioForm3.processId,
            s20_1 = formularioForm3.s20_1,
            )
        s20FormularioRepository.save(s20FormularioDAO)

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

        // se ele chegou aqui, teve sucesso
        redirectAttributes.addFlashAttribute("message", "Processo inserido com sucesso")

        return "redirect:/form/list"
    }
}