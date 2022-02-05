package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S21Formulario

interface S21FormularioRepository: JpaRepository<S21Formulario, Long> {

    fun findByProcessId(processId : String) : S21Formulario?

}