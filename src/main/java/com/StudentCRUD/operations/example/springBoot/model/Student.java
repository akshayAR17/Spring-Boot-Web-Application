package com.StudentCRUD.operations.example.springBoot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_crud_table")
public class Student {
    @Id
    private String usn;
    @Column
    private String name;
    @Column
    private String branch;
    @Column
    private double cgpa;
    @Column
    private int year;

    public Student() {

    }

    public Student(String usn, String name, String branch, double cgpa, int year) {
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.cgpa = cgpa;
        this.year = year;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "usn='" + usn + '\'' +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", cgpa=" + cgpa +
                ", year=" + year +
                '}';
    }
}
