package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S1Formulario
import pt.ulusofona.tfc.trabalho.dao.User

interface S1FormularioRepository: JpaRepository<S1Formulario, Long> {

}