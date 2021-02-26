package com.example.demo;

import com.example.demo.model.CourseEnrolled;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseEnrolledRepository extends JpaRepository<CourseEnrolled, String> {
}
