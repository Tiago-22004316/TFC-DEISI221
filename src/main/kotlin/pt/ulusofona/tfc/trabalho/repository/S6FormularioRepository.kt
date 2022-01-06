package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S13Formulário
import pt.ulusofona.tfc.trabalho.dao.S6Formulário

interface S6FormularioRepository: JpaRepository<S6Formulário, Long> {

}