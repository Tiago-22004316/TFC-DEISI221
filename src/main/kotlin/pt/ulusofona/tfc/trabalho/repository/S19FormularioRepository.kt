package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S19Formulario

interface S19FormularioRepository: JpaRepository<S19Formulario, Long> {

    fun findByProcessId(processId : String) : S19Formulario?

}