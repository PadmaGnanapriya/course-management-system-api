package com.example.demo.service;

import com.example.demo.CourseEnrolledRepository;
import com.example.demo.model.CourseEnrolled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseEnrolledService {

    @Autowired
    private CourseEnrolledRepository repo;

    public List<CourseEnrolled> listAll() {
        return repo.findAll();
    }

    public void add(CourseEnrolled course) {
        repo.save(course);
    }

    public CourseEnrolled get(String id) {
        return repo.findById(id).get();
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}
