package com.luv2code.jdbc.testDb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.Driver;
import java.sql.Connection;

@WebServlet(name="test",urlPatterns = "/test")
public class TestDbServlet extends javax.servlet.http.HttpServlet {

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //setup connection variables
        String jdbcUrl = "jdbc:mysql://localhost:3306/hotel?useSSL=false";
        String user = "root";
        String pass = "root";

        String driver = "com.mysql.jdbc.Driver";

        //get Connection

        try {
            PrintWriter out = response.getWriter();
            out.println("Connectiong on database :"+ jdbcUrl);

            Class.forName(driver);
            Connection conn = DriverManager.getConnection(jdbcUrl,user,pass);
            out.println("SUCCESS!!");
            conn.close();

        }catch(Exception ex){
            ex.printStackTrace();
            throw new ServletException(ex);
        }

    }
}
