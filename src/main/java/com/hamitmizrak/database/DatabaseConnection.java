package com.hamitmizrak.database;

import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Log4j2
public class DatabaseConnection extends DataBaseInformation {

    private String url = this.getUrl();
    private String userName = this.getUserName();
    private String userPassword = this.getUserPassword();
    private String forNameData = this.getForNameData();
    private Connection connection;


    //singleton design pattern
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        try {
            Class.forName(this.getForNameData());
            log.info("Driver Success");
            connection = DriverManager.getConnection(url, userName, userPassword);
            log.info("Connection Success");
        } catch (Exception e) {
            log.error("Database Error is not");
            e.printStackTrace();
        }
    }

    public static DatabaseConnection getInstance() {
        try {
            if (instance == null || instance.connection.isClosed()) {
                instance = new DatabaseConnection();
            }
        } catch (SQLException sql) {
            log.error("is not working sql");
            sql.printStackTrace();
        }
        return instance;
    }

    //connection
    public Connection getConnection() {
        return connection;
    }

    public DatabaseConnection setConnection(Connection connection) {
        this.connection = connection;
        return this;
    }
    //Main Test
    public static void main(String[] args) {
        DatabaseConnection connection1=new DatabaseConnection();
    }
}
