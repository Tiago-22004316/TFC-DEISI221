package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S14Formulario

interface S14FormularioRepository: JpaRepository<S14Formulario, Long> {

    fun findByProcessId(processId : String) : S14Formulario?

}