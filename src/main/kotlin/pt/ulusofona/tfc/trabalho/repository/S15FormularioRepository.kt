package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S15Formulario

interface S15FormularioRepository: JpaRepository<S15Formulario, Long> {

    fun findByProcessId(processId : String) : S15Formulario?

}