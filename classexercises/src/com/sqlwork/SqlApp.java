package com.sqlwork;

import java.sql.*;

public class SqlApp {
    public static void main(String[] args) {

        String url = "jdbc:mysql://127.0.0.1:3306/classicmodels";
        String[] flags = {"useSSL=false", "autoReconnect=true", "serverTimezone=UTC"};
        String connStr = String.format("%s?%s", url, String.join("&", flags));
        String queryUpdate = "update `employees` SET `lastName` = ? where `employeeNumber` = ?";
        String querySelect = "select e.*, o.city from employees as e left join offices o on e.officeCode = o.officeCode";
        try (
                Connection conn = DriverManager.getConnection(connStr, "root", "zubur123");
                PreparedStatement stmtSelect = conn.prepareStatement(querySelect);
                PreparedStatement stmtUpdate = conn.prepareStatement(queryUpdate)
        ){
            stmtUpdate.setString(1, "Tahat");
            stmtUpdate.setInt(2, 1002);

            System.out.println(stmtUpdate.executeUpdate());
            ResultSet resultSet = stmtSelect.executeQuery();
            while(resultSet.next()){

                int employeeNumber = resultSet.getInt("employeeNumber");
                String lastName = resultSet.getString("lastName");
                String city = resultSet.getString("city");

                System.out.println(employeeNumber + " " + lastName + " " + city);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
