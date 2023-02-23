package com.spring.todo.services;

import com.spring.todo.models.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TodoService {
    // Creating a todo object, using fake data
    List<Todo> todos = new ArrayList<>();
    Logger logger = LoggerFactory.getLogger(TodoService.class);

    public Todo createTodo(Todo todo){
        // change the logic here
        todos.add(todo);
        logger.info("Updated Todos {}", todos);
        return todo;
    }

}
