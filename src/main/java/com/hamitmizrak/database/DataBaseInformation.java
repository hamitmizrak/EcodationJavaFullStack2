package com.hamitmizrak.database;

import lombok.Data;

@Data
public class DataBaseInformation {
    private String url;
    private String userName;
    private String userPassword;
    private String forNameData;

    public DataBaseInformation() {
        //Mysql
        this.url="jdbc:mysql://localhost:3306/employee_management_system";
        this.userName="root";
        this.userPassword="root";
        //this.forNameData="com.mysql.jdbc.Driver";
        this.forNameData="com.mysql.cj.jdbc.Driver";

        //H2Db
        //http://localhost:8080/h2-console
//        this.url="jdbc:h2:file:./memory_persist/denemedb";
//        this.userName="root";
//        this.userPassword="root";
//        this.forNameData="org.h2.Driver";
    }
}
