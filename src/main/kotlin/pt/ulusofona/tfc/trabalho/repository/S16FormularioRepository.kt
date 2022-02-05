package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S16Formulario

interface S16FormularioRepository: JpaRepository<S16Formulario, Long> {

    fun findByProcessId(processId : String) : S16Formulario?

}