package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
    public static void main(String[] args) {
        var url = "jdbc:mysql://localhost:3306/qa-sample";
        var userName = "root";
        var password = "1234";
        Connection con = null;

        try {
            con = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection successful");
            var query = "select * from student";//java statement
            var stmt = con.createStatement();//SQL statement
            var rs = stmt.executeQuery(query);//execute the statement and store the result
            while (rs.next()) //iterate through the result
            {
                var id = rs.getInt(1);
                var name = rs.getString(2);
                var address = rs.getString(3);
                var phone = rs.getLong(4);
                System.out.println(id + "--" + name + "--" + address + "--" + phone);
            }

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
