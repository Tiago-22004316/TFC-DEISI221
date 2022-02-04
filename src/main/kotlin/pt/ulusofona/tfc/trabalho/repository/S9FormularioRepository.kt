package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S9Formulario

interface S9FormularioRepository: JpaRepository<S9Formulario, Long> {

    fun findByProcessId(processId : String) : S9Formulario?

}