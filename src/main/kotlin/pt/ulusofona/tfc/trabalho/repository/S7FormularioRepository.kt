package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S13Formulário
import pt.ulusofona.tfc.trabalho.dao.S7Formulário

interface S7FormularioRepository: JpaRepository<S7Formulário, Long> {

}