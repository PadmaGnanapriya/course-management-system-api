package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/get-all-students")
    public List<Student> list() {
        return studentService.listAll();
    }

    @PostMapping("/add-student")
    public void add(@RequestBody Student student) {
        studentService.add(student);
    }

    @DeleteMapping("/delete-student/{id}")
    public void delete(@PathVariable("id") String id){
        studentService.delete(id);
    }

}
