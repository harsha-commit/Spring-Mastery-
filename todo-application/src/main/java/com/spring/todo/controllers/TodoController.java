package com.spring.todo.controllers;

import com.spring.todo.services.TodoService;
import com.spring.todo.models.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
public class TodoController {

    Logger logger = LoggerFactory.getLogger(TodoController.class);
    @Autowired
    private TodoService todoService;

    // Create Todo
    @PostMapping("/")
    public Todo createTodo(@RequestBody Todo todo){
        logger.info("Creating Todo");
        // calling service to create a Todo Object
        Todo createdTodo = todoService.createTodo(todo);
        return createdTodo;
    }

}
