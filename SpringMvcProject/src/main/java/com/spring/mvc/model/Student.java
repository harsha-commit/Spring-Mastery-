package com.spring.mvc.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.SplittableRandom;

public class Student {
    private String name;
    private int empId;
    private String phone;
    private String dept;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonIgnore
    // while de-serialization, Java -> JSON, this is ignored
    public String getDept() {
        return dept;
    }

   @JsonProperty
   // while serialization, JSON -> Java, take this, in case it was ignored while de-serialization
    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", phone='" + phone + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
