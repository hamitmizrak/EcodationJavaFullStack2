package com.hamitmizrak.tutorials;

import java.util.Objects;

public class Student {
    //Nesne değişkenleri
    private String studentName;
    private String studentSurname;
    private String studentHescode;

    //alt+ins

    //parametresiz constructor
    public Student() {
        this.studentName="adı girilmedi";
        this.studentSurname="soyadı girilmedi";
        this.studentHescode="ASDFsdf48515";
    }


    //parametreli constructor
    public Student(String studentName) {
        this.studentName = studentName;
    }

    //parametreli constructor
    public Student(String studentName, String studentSurname, String studentHescode) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentHescode = studentHescode;
    }

    //parametreli constructor
    public Student(String studentName, String studentHescode) {
        this.studentName = studentName;
        this.studentHescode = studentHescode;
    }

    //Method
    public void fullName(){
        System.out.println(this.studentName+this.studentHescode);
    }


    //toString
    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", studentHescode='" + studentHescode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentName, student.studentName) && Objects.equals(studentSurname, student.studentSurname) && Objects.equals(studentHescode, student.studentHescode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, studentSurname, studentHescode);
    }

    //getter and setter
    public String getStudentName() {
        return studentName;
    }

    public Student setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public Student setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
        return this;
    }

    public String getStudentHescode() {
        return studentHescode;
    }

    public Student setStudentHescode(String studentHescode) {
        this.studentHescode = studentHescode;
        return this;
    }
}
