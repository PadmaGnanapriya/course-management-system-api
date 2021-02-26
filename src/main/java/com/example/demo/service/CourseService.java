package com.example.demo.service;

import com.example.demo.CourseRepository;
import com.example.demo.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repo;

    public List<Course> listAll() {
        return repo.findAll();
    }

    public void add(Course course) {
        repo.save(course);
    }

    public Course get(String id) {
        return repo.findById(id).get();
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}
