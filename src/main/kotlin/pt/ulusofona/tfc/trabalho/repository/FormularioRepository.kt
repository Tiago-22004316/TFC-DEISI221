package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.Formulario
import pt.ulusofona.tfc.trabalho.dao.User

interface FormularioRepository: JpaRepository<Formulario, Long> {

}