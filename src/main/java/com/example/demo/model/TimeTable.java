package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TimeTable {
    private String id;
    private String date;
    private String time;

//    id=course_id
    public TimeTable(String id, String date, String time) {
        this.id = id;
        this.date = date;
        this.time = time;
    }

    public TimeTable() {
    }

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
