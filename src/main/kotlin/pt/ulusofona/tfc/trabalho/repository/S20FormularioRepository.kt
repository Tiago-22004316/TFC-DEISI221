package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S20Formulario

interface S20FormularioRepository: JpaRepository<S20Formulario, Long> {

    fun findByProcessId(processId : String) : S20Formulario?

}