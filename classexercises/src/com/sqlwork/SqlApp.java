package com.sqlwork;

import java.sql.*;

public class SqlApp {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/classicmodels";
            String user = "root";
            String password = "zubur123";
            String[] flags = {"useSSL=false", "autoReconnect=true"};
            String connStr = String.format("%s?%s", url, String.join("&", flags));
            Connection conn = DriverManager.getConnection(connStr, user, password);

            Statement stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * from employees");

            while(resultSet.next()){
                System.out.println(resultSet.getString("lastName"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
