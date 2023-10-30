package com.example.demo.controller

import com.example.demo.model.Users
import com.example.demo.service.UsersService
import org.apache.catalina.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UsersController {
    @Autowired
    lateinit var usersService: UsersService

    @GetMapping
    fun getAll(): List<Users>{
        return usersService.getAll()
    }

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: Long?): Users{
        return usersService.getById(id)
    }

    @PostMapping
    fun postNew(@RequestBody user: Users): Users{
        return usersService.postNew(user)
    }

    @PatchMapping
    fun updateDescription(@RequestBody user: Users): Users{
        return usersService.updateDescription(user)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long){
        return usersService.delete(id)
    }
}