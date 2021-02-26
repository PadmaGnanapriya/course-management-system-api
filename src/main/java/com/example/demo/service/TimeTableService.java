package com.example.demo.service;

import com.example.demo.TimeTableRepository;
import com.example.demo.model.TimeTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeTableService {

    @Autowired
    private TimeTableRepository repo;

    public List<TimeTable> listAll() {
        return repo.findAll();
    }

    public void add(TimeTable TimeTable) {
        repo.save(TimeTable);
    }

    public TimeTable get(String id) {
        return repo.findById(id).get();
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}
