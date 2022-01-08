package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.S5Formulario

interface S5FormularioRepository: JpaRepository<S5Formulario, Long> {

}