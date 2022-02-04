package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S2Formulario

interface S2FormularioRepository: JpaRepository<S2Formulario, Long> {

    fun findByProcessId(processId : String) : S2Formulario?

}