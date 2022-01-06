package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S13Formulário
import pt.ulusofona.tfc.trabalho.dao.S3Formulário

interface S3FormularioRepository: JpaRepository<S3Formulário, Long> {

}