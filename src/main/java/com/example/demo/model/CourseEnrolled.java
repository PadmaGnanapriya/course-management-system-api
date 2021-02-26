package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CourseEnrolled{
    private String id;
    private String course_id;
    private String student_id;

    public CourseEnrolled(String id, String course_id, String student_id) {
        this.id =  id;
        this.course_id = course_id;
        this.student_id = student_id;
    }

    public CourseEnrolled() {
    }

    @Id
    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }
}
