package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S1Formulario

interface S1FormularioRepository: JpaRepository<S1Formulario, Long> {

    fun findByProcessId(processId : String) : S1Formulario?
    fun findAllByProcessIdContaining(processId : String) : List<S1Formulario?>

}