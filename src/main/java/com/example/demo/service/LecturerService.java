package com.example.demo.service;

import com.example.demo.LecturerRepository;
import com.example.demo.model.Lecturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LecturerService {

    @Autowired
    private LecturerRepository repo;

    public List<Lecturer> listAll() {
        return repo.findAll();
    }

    public void add(Lecturer lecturer) {
        repo.save(lecturer);
    }

    public Lecturer get(String id) {
        return repo.findById(id).get();
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}
