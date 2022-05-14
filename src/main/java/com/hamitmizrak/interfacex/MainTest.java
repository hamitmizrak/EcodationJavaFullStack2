package com.hamitmizrak.interfacex;

public class MainTest {
    public static void main(String[] args) {
        MysqlDb mysqlDb=new MysqlDb();

        mysqlDb.create();
        mysqlDb.update();
        mysqlDb.delete();
    }
}
