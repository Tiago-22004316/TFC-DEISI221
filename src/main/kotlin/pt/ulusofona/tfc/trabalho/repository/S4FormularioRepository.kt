package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S4Formulario

interface S4FormularioRepository: JpaRepository<S4Formulario, Long> {

    fun findByProcessId(processId : String) : S4Formulario?

}