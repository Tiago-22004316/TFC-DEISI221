package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S17Formulario

interface S17FormularioRepository: JpaRepository<S17Formulario, Long> {

    fun findByProcessId(processId : String) : S17Formulario?

}