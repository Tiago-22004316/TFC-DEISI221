package pt.ulusofona.tfc.trabalho.controller

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.client.support.BasicAuthenticationInterceptor
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.*
import org.springframework.web.client.RestTemplate
import org.springframework.web.servlet.mvc.support.RedirectAttributes
import pt.ulusofona.tfc.trabalho.dao.User
import pt.ulusofona.tfc.trabalho.form.UserForm
import pt.ulusofona.tfc.trabalho.repository.UserRepository
import java.security.Principal
import javax.validation.Valid


@Controller
@RequestMapping("/users")
class UsersController(val userRepository: UserRepository) {

    @Value("\${ciencia.vitae.token}")
    lateinit var token: String

    @Value("\${ciencia.vitae.secret}")
    lateinit var secret: String

    @GetMapping(value = ["/list"])
    fun listUsers(@RequestParam("age") age: Int?, model: ModelMap, principal: Principal?): String {
        val users = if (age == null) {
            userRepository.findAll()  // get all users from DB
        } else {
            model["age"] = age
            userRepository.findByAge(age)
        }
        model["users"] = users

        return "list-users"
    }

    @GetMapping(value = ["/new"])
    fun showUserForm(model: ModelMap): String {
        model["userForm"] = UserForm()
        return "new-user-form"
    }

    @GetMapping(value = ["/edit/{id}"])
    fun showUserForm(@PathVariable("id") id: Long, model: ModelMap): String {

        val userOptional = userRepository.findById(id)
        if (userOptional.isPresent) {
            val user = userOptional.get()
            model["userForm"] = UserForm(userId = user.id.toString(), name = user.name, age = user.age)
        }

        return "new-user-form"
    }

    @PostMapping(value = ["/new"])
    fun createOrUpdateUser(@Valid @ModelAttribute("userForm") userForm: UserForm,
                   bindingResult: BindingResult,
                   redirectAttributes: RedirectAttributes) : String {

        if (bindingResult.hasErrors()) {
            return "new-user-form"
        }

        val user: User =
                if (userForm.userId.isNullOrBlank()) {  // new user
                    User(name = userForm.name!!, age = userForm.age!!)
                } else { // edit user
                    val u = userRepository.findById(userForm.userId!!.toLong()).get()
                    u.name = userForm.name!!
                    u.age = userForm.age!!
                    u
                }

        userRepository.save(user)

        if (userForm.userId == null) {
            redirectAttributes.addFlashAttribute("message", "Utilizador inserido com sucesso")
        } else {
            redirectAttributes.addFlashAttribute("message", "Utilizador editado com sucesso")
        }
        return "redirect:/users/list"
    }

    @GetMapping(value = ["/showCV"])
    fun showCienciaVitae(@RequestParam(name="id") id: String, model: ModelMap): String {

        val restTemplate = RestTemplate()
        restTemplate.interceptors.add(BasicAuthenticationInterceptor(token, secret))
        val response = restTemplate.getForEntity("https://vitaeapi.playdev.ulusofona.pt/curriculum/$id", String::class.java)

        val mapper = ObjectMapper()
        val root: JsonNode = mapper.readTree(response.body)
        val fullName = root.at("/identifying-info/person-info/full-name").asText()

        val article = root.at("/outputs/output/0/conference-paper/paper-title")

        model["fullName"] = fullName
        model["article"] = article

        return "cv"
    }
}