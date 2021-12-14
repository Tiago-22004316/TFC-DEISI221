package pt.ulusofona.tfc.trabalho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes
import pt.ulusofona.tfc.trabalho.dao.Formulario
import pt.ulusofona.tfc.trabalho.form.FormularioForm
import pt.ulusofona.tfc.trabalho.repository.FormularioRepository
import javax.validation.Valid

@Controller
@RequestMapping("/form")
public class FormularioController(val formularioRepository: FormularioRepository)  {

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
        val form = Formulario(
                processId = formularioForm.processId!!,
                a2 = formularioForm.a2,
                b2 = formularioForm.b2,
                a3 = formularioForm.a3,
                b3 = formularioForm.b3,
                c3 = formularioForm.c3,
                d3 = formularioForm.d3,
                d3_1 = formularioForm.d3_1,
                a5 = formularioForm.a5,
                b5 = formularioForm.b5,
                b5_1 = formularioForm.b5_1)
        formularioRepository.save(form)

        // se ele chegou aqui, teve sucesso
        redirectAttributes.addFlashAttribute("message", "Processo inserido com sucesso")

        return ""
    }
}