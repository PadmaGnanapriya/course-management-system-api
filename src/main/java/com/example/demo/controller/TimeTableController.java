package com.example.demo.controller;

import com.example.demo.model.TimeTable;
import com.example.demo.service.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TimeTableController {

    @Autowired
    private TimeTableService timeTableService;

    @GetMapping("/get-timetable")
    public List<TimeTable> list(){
        return timeTableService.listAll();
    }

    //    @PostMapping("/add")
//    public ResponseEntity<SpringTestProduct> add(@RequestBody SpringTestProduct item) {
//        SpringTestProduct newProduct = service.add(item);
//    }
    @PostMapping("/add-time-data")
    public void add(@RequestBody TimeTable timeTable){
        timeTableService.add(timeTable);
    }
}
