package com.example.demo.service

import com.example.demo.controller.UsersController
import com.example.demo.model.Task
import com.example.demo.repository.TaskRepository
import com.example.demo.repository.UsersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TaskService {
    @Autowired
    lateinit var taskRepository: TaskRepository

    fun getAll(): List<Task>{
        return taskRepository.findAll();
    }

    fun postTask(task: Task): Task{

        return taskRepository.save(task)

    }
}