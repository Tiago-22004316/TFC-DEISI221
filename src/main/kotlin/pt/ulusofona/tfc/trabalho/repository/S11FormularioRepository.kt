package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S11Formulário
import pt.ulusofona.tfc.trabalho.dao.S13Formulário

interface S11FormularioRepository: JpaRepository<S11Formulário, Long> {

}