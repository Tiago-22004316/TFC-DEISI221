package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S8Formulario

interface S8FormularioRepository: JpaRepository<S8Formulario, Long> {

    fun findByProcessId(processId : String) : S8Formulario?

}