package com.example.demo.repository

import com.example.demo.model.Users
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UsersRepository: JpaRepository<Users, Long> {
    fun findById(id: Long?): Users
}