package com.example.demo.controller

import com.example.demo.model.Task
import com.example.demo.service.TaskService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tasks")
class TaskController {
    @Autowired
    lateinit var taskService: TaskService
    @GetMapping
    fun getAll(): List<Task>{
        return taskService.getAll();
    }

    @PostMapping
    fun post(@RequestBody task: Task): Task{
        return taskService.postTask(task);
    }

}