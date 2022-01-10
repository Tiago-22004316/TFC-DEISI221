package pt.ulusofona.tfc.trabalho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes
import pt.ulusofona.tfc.trabalho.dao.*
import pt.ulusofona.tfc.trabalho.form.FormularioForm
import pt.ulusofona.tfc.trabalho.repository.*
import javax.validation.Valid

@Controller
@RequestMapping("/form")
public class FormularioController(val s13FormularioRepository: S13FormularioRepository,
                                  val s1FormularioRepository: S1FormularioRepository,
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
                                  val s12FormularioRepository: S12FormularioRepository)  {

    @GetMapping(value = ["/new"])
    fun showFormularioForm(model:ModelMap): String {
        model["formularioForm"] = FormularioForm()
        return "new-formulario-form"
    }

    @PostMapping(value = ["/new"])
    fun formForm(@Valid @ModelAttribute("formularioForm") formularioForm: FormularioForm,
                 bindingResult: BindingResult,
                 redirectAttributes: RedirectAttributes) : String{

        if (bindingResult.hasErrors()){
            return "new-formulario-form"
        }

        //guardar na base de dados
        val s1FormularioDAO = S1Formulario(processId = formularioForm.processId!!)
        s1FormularioRepository.save(s1FormularioDAO)

        val s2FormularioDAO = S2Formulario(s2_A = formularioForm.s2_A,  s2_B = formularioForm.s2_B)
        s2FormularioRepository.save(s2FormularioDAO)

        val s3FormularioDAO = S3Formulario(s3_1 = formularioForm.s3_1,
                s3_2 = formularioForm.s3_2,
                s3_3 = formularioForm.s3_2,
                s3_4_A = formularioForm.s3_4_A,
                s3_4_B = formularioForm.s3_4_B,
                s3_4_1 = formularioForm.s3_4_1)
        s3FormularioRepository.save(s3FormularioDAO)

        val s4FormularioDAO = S4Formulario(s4_1_A = formularioForm.s4_1_A,
                s4_1_A_n = formularioForm.s4_1_A,
                s4_1_A_s = formularioForm.s4_1_A_s,
                s4_1_B = formularioForm.s4_1_B,
                s4_1_B_f = formularioForm.s4_1_B_f,
                s4_2_1_A = formularioForm.s4_2_1_A,
                s4_2_1_B = formularioForm.s4_2_1_B,
                s4_2_1_B_f = formularioForm.s4_2_1_B_f,
                s4_2_A = formularioForm.s4_2_A,
                s4_2_B = formularioForm.s4_2_B,
                s4_2_B_f = formularioForm.s4_2_B_f,
                s4_3_1 = formularioForm.s4_3_1,
                s4_3_2 = formularioForm.s4_3_2,
                s4_3_3 = formularioForm.s4_3_3,
                s4_3_3_A = formularioForm.s4_3_3_A,
                s4_3_3_A_f = formularioForm.s4_3_3_A_f,
                s4_3_3_B = formularioForm.s4_3_3_B,
                s4_3_3_B_f = formularioForm.s4_3_3_B_f,
                s4_3_3_C = formularioForm.s4_3_3_C,
                s4_3_3_C_f = formularioForm.s4_3_3_C_f,
                s4_3_4 = formularioForm.s4_3_4,
                s4_3_4_A = formularioForm.s4_3_3_A,
                s4_3_4_B = formularioForm.s4_3_3_B,
                s4_3_4_C = formularioForm.s4_3_3_C,
                s4_3_4_D = formularioForm.s4_3_4_D,
                s4_3_4_E = formularioForm.s4_3_4_E,
                s4_3_4_F = formularioForm.s4_3_4_F,
                s4_3_4_G = formularioForm.s4_3_4_G,
                s4_3_4_H = formularioForm.s4_3_4_H,
                s4_3_4_I = formularioForm.s4_3_4_I,
                s4_3_4_J = formularioForm.s4_3_4_J,
                s4_3_4_J_f = formularioForm.s4_3_4_J_f,
                s4_4 = formularioForm.s4_4,
                s4_4_f = formularioForm.s4_4_f,
                s4_5_1 = formularioForm.s4_5_1,
                s4_5_2 = formularioForm.s4_5_2,
                s4_5_2_1 = formularioForm.s4_5_2_1,
                s4_5_2_A = formularioForm.s4_5_2_A,
                s4_5_2_B = formularioForm.s4_5_2_B,
                s4_5_2_C = formularioForm.s4_5_2_C,
                s4_5_3 = formularioForm.s4_5_3,
                s4_6_1_f = formularioForm.s4_6_1_f,
                s4_6_A = formularioForm.s4_6_A,
                s4_6_B = formularioForm.s4_6_B,
                s4_6_C = formularioForm.s4_6_C,
                s4_6_D = formularioForm.s4_6_D)
        s4FormularioRepository.save(s4FormularioDAO)

        val s5FormularioDAO = S5Formulario(s5_A = formularioForm.s5_A,
                s5_B = formularioForm.s5_B,
                s5_B_1 = formularioForm.s5_B_1)
        s5FormularioRepository.save(s5FormularioDAO)

        val s6FormularioDAO = S6Formulario(s6_A = formularioForm.s6_A,
                s6_B = formularioForm.s6_B,
                s6_C = formularioForm.s6_C,
                s6_D = formularioForm.s6_D,
                s6_E = formularioForm.s6_E,
                s6_E_f = formularioForm.s6_E_f,
                s6_F = formularioForm.s6_F,
                s6_1_A = formularioForm.s6_1_A,
                s6_1_B = formularioForm.s6_1_B,
                s6_1_B_f = formularioForm.s6_1_B_f,
                s6_2 = formularioForm.s6_2,
                s6_2_f = formularioForm.s6_2_f,
                s6_3 = formularioForm.s6_3,
                s6_3_f = formularioForm.s6_3_f,
                s6_4 = formularioForm.s6_4,
                s6_4_1_A = formularioForm.s6_4,
                s6_4_1_B = formularioForm.s6_4_1_B,
                s6_4_2_A = formularioForm.s6_4_2_A,
                s6_4_2_B = formularioForm.s6_4_2_B,
                s6_4_2_B_f = formularioForm.s6_4_2_B_f,
                s6_5 = formularioForm.s6_5,
                s6_6 = formularioForm.s6_6,
                s6_6_f = formularioForm.s6_6_f)
        s6FormularioRepository.save(s6FormularioDAO)

        val s7FormularioDAO = S7Formulario(s7_1 = formularioForm.s7_1,
                s7_1_A = formularioForm.s7_1_A,
                s7_1_B = formularioForm.s7_1_B,
                s7_1_C = formularioForm.s7_1_C,
                s7_1_D = formularioForm.s7_1_D,
                s7_1_E = formularioForm.s7_1_E,
                s7_1_F = formularioForm.s7_1_F,
                s7_1_G = formularioForm.s7_1_G,
                s7_1_H = formularioForm.s7_1_H,
                s7_1_I = formularioForm.s7_1_I,
                s7_1_I_f = formularioForm.s7_1_I_f,
                s7_1_J = formularioForm.s7_1_J,
                s7_1_J_f = formularioForm.s7_1_J_f,
                s7_1_L = formularioForm.s7_1_L,
                s7_1_L_f = formularioForm.s7_1_L_f,
                s7_1_M = formularioForm.s7_1_M,
                s7_1_M_f = formularioForm.s7_1_M_f,
                s7_2 = formularioForm.s7_2,
                s7_2_1_A = formularioForm.s7_2_1_A,
                s7_2_1_B = formularioForm.s7_2_1_B,
                s7_2_1_B_f = formularioForm.s7_2_1_B_f,
                s7_2_1_C = formularioForm.s7_2_1_C,
                s7_2_1_C_f = formularioForm.s7_2_1_C_f,
                s7_2_2_A = formularioForm.s7_2_2_A,
                s7_2_2_B = formularioForm.s7_2_2_B,
                s7_2_2_C = formularioForm.s7_2_2_C,
                s7_2_2_D = formularioForm.s7_2_2_D,
                s7_2_2_E = formularioForm.s7_2_2_E,
                s7_2_2_F = formularioForm.s7_2_2_F,
                s7_2_2_G = formularioForm.s7_2_2_G,
                s7_2_2_H = formularioForm.s7_2_2_H,
                s7_2_2_I = formularioForm.s7_2_2_I,
                s7_2_2_I_f = formularioForm.s7_2_2_I_f,
                s7_2_2_J = formularioForm.s7_2_2_J,
                s7_2_2_J_f = formularioForm.s7_2_2_J_f,
                s7_2_2_L = formularioForm.s7_2_2_L,
                s7_2_2_L_f = formularioForm.s7_2_2_L_f,
                s7_2_2_M = formularioForm.s7_2_2_M,
                s7_2_2_M_f = formularioForm.s7_2_2_M_f,
                s7_3 = formularioForm.s7_3,
                s7_3_1_A = formularioForm.s7_3_1_A,
                s7_3_1_A_f = formularioForm.s7_3_1_A_f,
                s7_3_1_B = formularioForm.s7_3_1_B,
                s7_3_1_B_f = formularioForm.s7_3_1_B_f,
                s7_3_2_A = formularioForm.s7_3_2_A,
                s7_3_2_B = formularioForm.s7_3_2_B,
                s7_3_2_C = formularioForm.s7_3_2_C,
                s7_3_2_D = formularioForm.s7_3_2_D,
                s7_3_2_E = formularioForm.s7_3_2_E,
                s7_3_2_F = formularioForm.s7_3_2_F,
                s7_3_2_G = formularioForm.s7_3_2_G,
                s7_3_2_H = formularioForm.s7_3_2_H,
                s7_3_2_I = formularioForm.s7_3_2_I,
                s7_3_2_I_f = formularioForm.s7_3_2_I_f,
                s7_3_2_J = formularioForm.s7_3_2_J,
                s7_3_2_J_f = formularioForm.s7_3_2_J_f,
                s7_3_2_L = formularioForm.s7_3_2_L,
                s7_3_2_L_f = formularioForm.s7_3_2_L_f,
                s7_3_2_M = formularioForm.s7_3_2_M,
                s7_3_2_M_f = formularioForm.s7_3_2_M_f,
                s7_4 = formularioForm.s7_4,
                s7_4_1_A = formularioForm.s7_4_1_A,
                s7_4_1_B = formularioForm.s7_4_1_B,
                s7_4_1_B_f = formularioForm.s7_4_1_B_f,
                s7_4_2_A = formularioForm.s7_4_2_A,
                s7_4_2_B = formularioForm.s7_4_2_B,
                s7_4_2_C = formularioForm.s7_4_2_C,
                s7_4_2_D = formularioForm.s7_4_2_D,
                s7_4_2_E = formularioForm.s7_4_2_E,
                s7_4_2_F = formularioForm.s7_4_2_F,
                s7_4_2_G = formularioForm.s7_4_2_G,
                s7_4_2_H = formularioForm.s7_4_2_H,
                s7_4_2_I = formularioForm.s7_4_2_I,
                s7_4_2_I_f = formularioForm.s7_4_2_I_f,
                s7_4_2_J = formularioForm.s7_4_2_J,
                s7_4_2_J_f = formularioForm.s7_4_2_J_f,
                s7_4_2_L = formularioForm.s7_4_2_L,
                s7_4_2_L_f = formularioForm.s7_4_2_L_f,
                s7_4_2_M = formularioForm.s7_4_2_M,
                s7_4_2_M_f = formularioForm.s7_4_2_M_f,
                s7_4_2_O = formularioForm.s7_4_2_O,
                s7_5 = formularioForm.s7_5,
                s7_5_A = formularioForm.s7_5_A,
                s7_5_B = formularioForm.s7_5_B,
                s7_5_C = formularioForm.s7_5_C,
                s7_5_D = formularioForm.s7_5_D,
                s7_5_E = formularioForm.s7_5_E,
                s7_5_F = formularioForm.s7_5_F,
                s7_5_G = formularioForm.s7_5_G,
                s7_5_H = formularioForm.s7_5_H,
                s7_5_H_f = formularioForm.s7_5_H_f,
                s7_5_I = formularioForm.s7_5_I,
                s7_5_I_f = formularioForm.s7_5_I_f,
                s7_5_J = formularioForm.s7_5_J,
                s7_5_J_f = formularioForm.s7_5_J_f,
                s7_5_L = formularioForm.s7_5_L,
                s7_5_L_f = formularioForm.s7_5_L_f)
        s7FormularioRepository.save(s7FormularioDAO)

        val s8FormularioDAO = S8Formulario(s8 = formularioForm.s8)
        s8FormularioRepository.save(s8FormularioDAO)

        val s9FormularioDAO = S9Formulario(s9_1 = formularioForm.s9_1,
                s9_1_A = formularioForm.s9_1_A,
                s9_1_B = formularioForm.s9_1_B,
                s9_1_C = formularioForm.s9_1_C,
                s9_1_D = formularioForm.s9_1_D,
                s9_1_E = formularioForm.s9_1_E,
                s9_1_E_f = formularioForm.s9_1_E_f,
                s9_2 = formularioForm.s9_2,
                s9_2_A = formularioForm.s9_2_A,
                s9_2_B = formularioForm.s9_2_B,
                s9_2_C = formularioForm.s9_2_C,
                s9_2_D = formularioForm.s9_1_D,
                s9_2_E = formularioForm.s9_2_E,
                s9_2_F = formularioForm.s9_2_F,
                s9_2_G = formularioForm.s9_2_G,
                s9_2_G_f = formularioForm.s9_2_G_f,
                s9_3 = formularioForm.s9_3,
                s9_3_A = formularioForm.s9_3_A,
                s9_3_B = formularioForm.s9_3_B,
                s9_3_B_f = formularioForm.s9_3_B_f,
                s9_4 = formularioForm.s9_4,
                s9_4_A = formularioForm.s9_4_A,
                s9_4_B = formularioForm.s9_4_B,
                s9_4_B_f = formularioForm.s9_4_B_f,
                s9_4_C = formularioForm.s9_4_C,
                s9_4_C_f = formularioForm.s9_4_C_f,
                s9_4_D = formularioForm.s9_4_D,
                s9_4_D_f = formularioForm.s9_4_D_f,
                s9_4_E = formularioForm.s9_4_E,
                s9_4_E_f = formularioForm.s9_4_E_f,
                s9_4_F = formularioForm.s9_4_F,
                s9_4_F_f = formularioForm.s9_4_F_f,
                s9_4_1 = formularioForm.s9_4_1)
        s9FormularioRepository.save(s9FormularioDAO)

        val s10FormularioDAO = S10Formulario(s10_1_a = formularioForm.s10_1_a,
                s10_1_b = formularioForm.s10_1_b,
                s10_1_c = formularioForm.s10_1_c,
                s10_1_d = formularioForm.s10_1_d,
                s10_1_e = formularioForm.s10_1_e,
                s10_1_F = formularioForm.s10_1_F,
                s10_1_F_f = formularioForm.s10_1_F_f,
                s10_2 = formularioForm.s10_2,
                s10_3_1 = formularioForm.s10_3_1,
                s10_3_2 = formularioForm.s10_3_2)
        s10FormularioRepository.save(s10FormularioDAO)

        val s11FormularioDAO = S11Formulario(s11_1 = formularioForm.s11_1)
        s11FormularioRepository.save(s11FormularioDAO)

        val s12FormularioDAO = S12Formulario(s12_1_a = formularioForm.s12_1_a,
                s12_1_b = formularioForm.s12_1_b,
                s12_1_c = formularioForm.s9_1_C,
                s12_1_d = formularioForm.s12_1_d,
                s12_1_e = formularioForm.s9_1_E,
                s12_1_1 = formularioForm.s12_1_1,
                s12_1_2_a = formularioForm.s12_1_2_a,
                s12_1_2_b = formularioForm.s12_1_2_b,
                s12_1_2_f = formularioForm.s12_1_2_f,
                s12_2_1 = formularioForm.s12_1_1,
                s12_2_a = formularioForm.s12_2_a,
                s12_2_b = formularioForm.s12_2_b,
                s12_2_c = formularioForm.s12_2_c,
                s12_2_d = formularioForm.s12_2_d,
                s12_2_e = formularioForm.s12_2_e,
                s12_2_2_a = formularioForm.s12_1_2_a,
                s12_2_2_b = formularioForm.s12_1_2_b,
                s12_2_2_f = formularioForm.s12_1_2_f,
                s12_3_1 = formularioForm.s12_3_1,
                s12_3_2_a = formularioForm.s12_3_2_a,
                s12_3_2_b = formularioForm.s12_3_2_b,
                s12_3_2_f = formularioForm.s12_1_2_f,
                s12_3_a = formularioForm.s12_3_a,
                s12_3_b = formularioForm.s12_3_b,
                s12_3_c = formularioForm.s12_3_c,
                s12_3_d = formularioForm.s12_3_d,
                s12_3_e = formularioForm.s12_3_e,
                s12_4_1_a = formularioForm.s12_4_1_a,
                s12_4_1_b = formularioForm.s12_4_1_b,
                s12_4_a = formularioForm.s12_4_a,
                s12_4_b = formularioForm.s12_4_b)
        s12FormularioRepository.save(s12FormularioDAO)

        /*val s13FormularioDAO = S13Formulario( s13_1_2_a = formularioForm.s13_1_2_a,
                s13_1_2_b = formularioForm.s13_1_2_b,
                s13_1_3_a = formularioForm.s13_1_3_a,
                s13_1_3_b = formularioForm.s13_1_3_b,
                s13_1_3_c = formularioForm.s13_1_3_c,
                s13_1_3_d = formularioForm.s13_1_3_d,
                s13_1_4_a = formularioForm.s13_1_4_a,
                s13_1_4_b = formularioForm.s13_1_4_b,
                s13_1_4_c = formularioForm.s13_1_4_c,
                s13_1_4_d = formularioForm.s13_1_4_d,
                s13_1_4_d_f = formularioForm.s13_1_4_d_f,
                s13_1_5_a = formularioForm.s13_1_5_a,
                s13_1_5_b = formularioForm.s13_1_5_b,
                s13_1_5_c = formularioForm.s13_1_5_c,
                s13_1_5_d = formularioForm.s13_1_5_d,
                s13_1_5_e = formularioForm.s13_1_5_e,
                s13_1_5_F = formularioForm.s13_1_5_F,
                s13_1_5_g = formularioForm.s13_1_5_g,
                s13_1_5_h = formularioForm.s13_1_5_h,
                s13_1_5_i = formularioForm.s13_1_5_i,
                s13_1_5_j = formularioForm.s13_1_5_j,
                s13_1_5_l = formularioForm.s13_1_5_l,
                s13_2_a = formularioForm.s13_2_a,
                s13_2_b = formularioForm.s13_2_b,
                s13_2_c = formularioForm.s13_2_c,
                s13_2_d = formularioForm.s13_2_d,
                s13_2_e = formularioForm.s13_2_e,
                s13_2_F = formularioForm.s13_2_F,
                s13_2_g = formularioForm.s13_2_g,
                s13_2_h = formularioForm.s13_2_h,
                s13_2_i = formularioForm.s13_2_i,
                s13_2_i_f = formularioForm.s13_2_i_f,
                s13_3_a = formularioForm.s13_3_a,
                s13_3_b = formularioForm.s13_3_b,
                s13_3_c = formularioForm.s13_3_c,
                s13_3_d = formularioForm.s13_3_d,
                s13_3_e = formularioForm.s13_3_e,
                s13_3_F = formularioForm.s13_3_F,
                s13_3_g = formularioForm.s13_3_g,
                s13_3_h = formularioForm.s13_3_h,
                s13_3_i = formularioForm.s13_3_i,
                s13_3_j = formularioForm.s13_3_j,
                s13_3_l = formularioForm.s13_3_l,
                s13_3_m = formularioForm.s13_3_m,
                s13_3_n = formularioForm.s13_3_n,
                s13_3_o = formularioForm.s13_3_o,
                s13_3_p = formularioForm.s13_3_p,
                s13_3_q = formularioForm.s13_3_q)
        s13FormularioRepository.save(s13FormularioDAO)*/

        // se ele chegou aqui, teve sucesso
        redirectAttributes.addFlashAttribute("message", "Processo inserido com sucesso")

        return ""
    }
}