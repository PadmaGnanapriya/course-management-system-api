package com.example.demo.controller;

import com.example.demo.model.Lecturer;
import com.example.demo.service.LecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LecturerController {

    @Autowired
    private LecturerService lecturerService;

    @GetMapping("/get-all-lecturers")
    public List<Lecturer> list() {
        return lecturerService.listAll();
    }

    @PostMapping("/add-lecturer")
    public void add(@RequestBody Lecturer Lecturer) {
        lecturerService.add(Lecturer);
    }

    @DeleteMapping("/delete-lecturer/{id}")
    public void delete(@PathVariable("id") String id) {
        lecturerService.delete(id);
    }

}
