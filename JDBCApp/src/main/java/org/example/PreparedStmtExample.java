package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStmtExample {
    public static void main(String[] args) {
//        var statement = conn.prepareStatement("INSERT INTO customer VALUES(?,?)")) {
        var url = "jdbc:mysql://localhost:3306/qa-sample";
        var userName = "root";
        var password = "1234";
        Connection con = null;

        try {
            con = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection successful");
            //String query = "select * from student where id=?";// java statement
            var pstmt = con.prepareStatement("select * from student where id=? or name=? or address=?");
            pstmt.setInt(1, 107);
            pstmt.setString(2, "Upasana");
            pstmt.setString(3, "London");
            var rs = pstmt.executeQuery();// execute the statement and store the result
            while (rs.next()) // iterate through the result
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
