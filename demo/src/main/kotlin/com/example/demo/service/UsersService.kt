package com.example.demo.service

import com.example.demo.model.Users
import com.example.demo.repository.UsersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import java.lang.Exception

@Service
class UsersService {
    @Autowired
    lateinit var usersRepository: UsersRepository

    fun getAll(): List<Users>{
        return usersRepository.findAll()
    }

    fun getById(id: Long?): Users{
        return usersRepository.findById(id)
    }

    fun postNew(user: Users): Users{
        return usersRepository.save(user)
    }

    fun updateDescription(user: Users): Users{
        try {
            var response = usersRepository.findById(user.id)?: throw Exception("element doesn't exist")
            response.apply { description = user.description }
            return usersRepository.save(response)
        }catch (ex: Exception){
            throw  ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }

    }

    fun updateName(user: Users, id: Long){

    }

    fun delete(id: Long){
        return usersRepository.deleteById(id)
    }
}