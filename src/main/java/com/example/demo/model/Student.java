package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    private String id;
    private String name;
    private String contactNo;
    private String nic;
    private String email;
    private String birthday;
    private String password;

    public Student(String id, String name, String contactNo, String nic, String email, String birthday, String password) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.nic = nic;
        this.email = email;
        this.birthday = birthday;
        this.password = password;
    }

    public Student() {
    }

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", nic='" + nic + '\'' +
                ", email='" + email + '\'' +
                ", birthday='" + birthday + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
