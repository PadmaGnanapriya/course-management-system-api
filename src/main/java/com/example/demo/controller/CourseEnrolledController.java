package com.example.demo.controller;

import com.example.demo.model.CourseEnrolled;
import com.example.demo.service.CourseEnrolledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseEnrolledController {

    @Autowired
    private CourseEnrolledService courseEnrolledService;

    @GetMapping("/get-all-course-enrolled")
    public List<CourseEnrolled> list(){
        return courseEnrolledService.listAll();
    }

    @PostMapping("/add-new-course")
    public void add(@RequestBody CourseEnrolled courseEnrolled){
        courseEnrolledService.add(courseEnrolled);
    }
}
