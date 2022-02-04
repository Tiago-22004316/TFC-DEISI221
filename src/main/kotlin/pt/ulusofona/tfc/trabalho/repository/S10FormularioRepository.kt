package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S10Formulario

interface S10FormularioRepository: JpaRepository<S10Formulario, Long> {

    fun findByProcessId(processId : String) : S10Formulario?

}