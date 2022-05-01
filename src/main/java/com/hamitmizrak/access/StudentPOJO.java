package com.hamitmizrak.access;


import lombok.Getter;
import lombok.Setter;

//@Getter @Setter
public class StudentPOJO {
    private String studentName;
    private String studentSurname;
    private String studentHescode;

    public String getStudentName() {
        return studentName;
    }

    public StudentPOJO setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public StudentPOJO setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
        return this;
    }

    public String getStudentHescode() {
        return studentHescode;
    }

    public StudentPOJO setStudentHescode(String studentHescode) {
        this.studentHescode = studentHescode;
        return this;
    }
}
