/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.domain;

/**
 *
 * @author sunil
 */
public class Student {
    private String studentFullName;
    private String batch;
    private int year;
    
    public Student(String studentName,String batch,int year){
        this.studentFullName=studentName;
        this.batch=batch;
        this.year=year;
    }

    public String getStudentFullName() {
        return studentFullName;
    }

    public void setStudentFullName(String studentFullName) {
        this.studentFullName = studentFullName;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}
