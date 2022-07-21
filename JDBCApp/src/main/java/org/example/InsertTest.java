package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
    public static void main(String[] args) {
        var url = "jdbc:mysql://localhost:3306/qa-sample";
        var userName = "root";
        var password = "1234";
        Connection con = null;

        try {
            con = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection successful");
            var query = "insert into student values(112,'Richard','Rome',85799565)";//java statement
            var stmt = con.createStatement();//SQL statement
            stmt.executeUpdate(query);
            System.out.println("one record inserted");
        } catch (SQLException e) {
            System.out.println("something went wrong");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }


}
