package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCOperation {
    String url = "jdbc:mysql://localhost:3306/qa-sample";
    String userName = "root";
    String password = "1234";
    Connection con = null;

    public void readData() {
        try {
            con = DriverManager.getConnection
                    (url, userName, password);
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

    public void addData() {
        try {
            con = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection successful");
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter id");
            int id = scn.nextInt();
            System.out.println("Enter name");
            String name = scn.next();
            System.out.println("Enter address");
            String address = scn.next();
            System.out.println("Enter phone");
            long phone = scn.nextLong();
            //String query="insert into student values(112,'Richard','Rome',85799565)";
            //String query="insert into student values(?,?,?,?)";
            String query = "insert into student values(" + id + ",'" + name + "','" + address + "'," + phone + ")";//java statement
            Statement stmt = con.createStatement();//SQL statement
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

    public void updateData() throws SQLException {
        con = DriverManager.getConnection(url, userName, password);
        System.out.println("Connection successful");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter id");
        int id = scn.nextInt();
        System.out.println("Enter name");
        String name = scn.next();
        System.out.println("Enter address");
        String address = scn.next();
        System.out.println("Enter phone");
        long phone = scn.nextLong();
        //String query="insert into student values(112,'Richard','Rome',85799565)";
        //String query="insert into student values(?,?,?,?)";
        String query = "insert into student values(" + id + ",'" + name + "','" + address + "'," + phone + ")";//java statement
        Statement stmt = con.createStatement();//SQL statement
        stmt.executeUpdate(query);
        System.out.println("one record inserted");
    }
}
