package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection {
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/hotel?useSSL=false";
        String user = "root";
        String pass = "root";

        try {
            System.out.println("Connecting to database: " + jdbcUrl);

            Connection myConn =
                    DriverManager.getConnection(jdbcUrl, user, pass);

            System.out.println("Connection successful!!!");

        }
        catch (Exception exc) {
            exc.printStackTrace();
        }



    }
}
