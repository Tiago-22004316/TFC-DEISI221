package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S12Formulário
import pt.ulusofona.tfc.trabalho.dao.S13Formulário

interface S12FormularioRepository: JpaRepository<S12Formulário, Long> {

}