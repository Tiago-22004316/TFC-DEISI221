package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S18Formulario

interface S18FormularioRepository: JpaRepository<S18Formulario, Long> {

    fun findByProcessId(processId : String) : S18Formulario?

}