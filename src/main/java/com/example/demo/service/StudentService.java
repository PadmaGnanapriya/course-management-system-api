package com.example.demo.service;

import com.example.demo.StudentRepository;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo2;

    public List<Student> listAll(){
        return repo2.findAll();
    }

    public void add(Student Student){
        repo2.save(Student);
    }

    public Student get(String id){
        return repo2.findById(id).get();
    }

    public void delete(String id){
        repo2.deleteById(id);
    }
}
