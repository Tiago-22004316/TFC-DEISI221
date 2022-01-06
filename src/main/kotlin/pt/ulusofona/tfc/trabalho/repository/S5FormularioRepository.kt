package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S13Formulário
import pt.ulusofona.tfc.trabalho.dao.S5Formulário

interface S5FormularioRepository: JpaRepository<S5Formulário, Long> {

}