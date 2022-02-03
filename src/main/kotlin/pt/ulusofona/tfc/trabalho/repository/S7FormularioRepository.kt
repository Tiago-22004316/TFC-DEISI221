package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S7Formulario

interface S7FormularioRepository: JpaRepository<S7Formulario, Long> {

    fun findByProcessId(processId : String) : S7Formulario

}