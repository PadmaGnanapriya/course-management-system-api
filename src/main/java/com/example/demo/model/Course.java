package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    private String id;
    private String lecturer_id;
    private String reference_book;

    public Course(String id, String lecturer_id, String reference_book) {
        this.id = id;
        this.lecturer_id = lecturer_id;
        this.reference_book = reference_book;
    }

    public Course() {
    }

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLecturer_id() {
        return lecturer_id;
    }

    public void setLecturer_id(String lecturer_id) {
        this.lecturer_id = lecturer_id;
    }

    public String getReference_book() {
        return reference_book;
    }

    public void setReference_book(String reference_book) {
        this.reference_book = reference_book;
    }

}
