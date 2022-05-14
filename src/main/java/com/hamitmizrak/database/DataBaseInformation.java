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
        this.forNameData="com.mysql.jdbc.Driver";
    }
}
