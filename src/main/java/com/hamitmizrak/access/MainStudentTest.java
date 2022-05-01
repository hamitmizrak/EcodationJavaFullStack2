package com.hamitmizrak.access;

public class MainStudentTest {


    public static void main(String[] args) {
        Student student=new Student("Hamit");
        System.out.println(student);

        if(student instanceof Student){
            System.out.println("Aynı Object");
        }else{
            System.out.println("Farklı Object");
        }

        StudentLombok studentLombok=StudentLombok.builder().studentName("Hamit").build();
        System.out.println(studentLombok);


//        System.out.println(student.getStudentName());
//        System.out.println(student.getStudentHescode());
//        //Override
//        student.setStudentHescode("6481515115");
//        System.out.println(student.getStudentHescode());
    }

}
