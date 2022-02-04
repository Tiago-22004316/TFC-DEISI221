package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S12Formulario

interface S12FormularioRepository: JpaRepository<S12Formulario, Long> {

    fun findByProcessId(processId : String) : S12Formulario?

}