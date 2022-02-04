package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S3Formulario

interface S3FormularioRepository: JpaRepository<S3Formulario, Long> {

    fun findByProcessId(processId : String) : S3Formulario?

}