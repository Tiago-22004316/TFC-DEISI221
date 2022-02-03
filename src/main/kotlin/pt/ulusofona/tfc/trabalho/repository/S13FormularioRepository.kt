package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S13Formulario

interface S13FormularioRepository: JpaRepository<S13Formulario, Long> {

    fun findByProcessId(processId : String) : S13Formulario

}