package pt.ulusofona.tfc.trabalho.repository

import org.springframework.data.jpa.repository.JpaRepository
import pt.ulusofona.tfc.trabalho.dao.Login

interface LoginRepository: JpaRepository<Login, Long> {

    fun findByUsername(username : String) : Login?
}