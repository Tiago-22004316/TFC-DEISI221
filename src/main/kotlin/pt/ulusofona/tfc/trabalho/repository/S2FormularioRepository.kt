package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S13Formulário
import pt.ulusofona.tfc.trabalho.dao.S2Formulário

interface S2FormularioRepository: JpaRepository<S2Formulário, Long> {

}