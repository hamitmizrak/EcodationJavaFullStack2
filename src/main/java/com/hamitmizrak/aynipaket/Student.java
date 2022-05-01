package com.hamitmizrak.aynipaket;

public class Student {
                      // aynı paket farklı class / aynı paket aynı class
    // public:Cömert  //+                          +
    // protected:Araf //+                          +
    // private:Cimri  //-                          +
    // -(default)     //+                          +

    public String studentPublic="public";
    protected String studentProtected="protected";
    private String studentNamePrivate="private";
     String studentDefault="default";

    public static void main(String[] args) {
        Student stu=new Student();

        String exam1=stu.studentPublic;
        System.out.println(exam1);

        String exam2=stu.studentProtected;
        System.out.println(exam2);

        String exam3=stu.studentNamePrivate;
        System.out.println(exam3);

        String exam4=stu.studentDefault;
        System.out.println(exam4);
    }
}
