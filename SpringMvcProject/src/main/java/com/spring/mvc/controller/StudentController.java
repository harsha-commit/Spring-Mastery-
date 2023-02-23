package com.spring.mvc.controller;

import com.spring.mvc.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @PostMapping("/create")
    // sending data along with response codes
    public ResponseEntity<List<Student>> createStudent(@RequestBody List<Student> students){
        // using Student class to maintain a standard
        System.out.println("Total no. of students: " + students.size());
        System.out.println(students);

        // creating the ResponseEntity and returning the value
        ResponseEntity<List<Student>> response = new ResponseEntity<>(students, HttpStatus.OK);
        // or, = ResponseEntity.status(HttpStatus.OK).body(student);

        return response;
    }
}
