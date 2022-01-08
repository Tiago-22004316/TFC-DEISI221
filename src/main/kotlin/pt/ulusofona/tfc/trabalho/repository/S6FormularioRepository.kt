package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S6Formulario

interface S6FormularioRepository: JpaRepository<S6Formulario, Long> {

}