package com.example.demo.controller;

import com.example.demo.model.Course;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/get-all-courses")
    public List<Course> list(){
        return courseService.listAll();
    }

    @PostMapping("/add-course")
    public void add(@RequestBody Course course){
        courseService.add(course);
    }

    @DeleteMapping("/delete-course/{id}")
    public void delete(@PathVariable("id") String id) {
        courseService.delete(id);
    }
}
