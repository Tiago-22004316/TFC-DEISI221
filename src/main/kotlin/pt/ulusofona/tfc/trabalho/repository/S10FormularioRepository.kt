package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S10Formulário
import pt.ulusofona.tfc.trabalho.dao.S13Formulário

interface S10FormularioRepository: JpaRepository<S10Formulário, Long> {

}