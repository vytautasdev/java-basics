package org.example;


import java.util.Scanner;

public class TestJDBSOperations {

    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var ops = new JDBCOperation();
        var ans = 'y';
        System.out.println("Hello welcome to my application");
        System.out.println("------------------------------");
        System.out.println("What would you like to do? please enter a number");
        System.out.println("1.Read Records");
        System.out.println("2.Add record");
        ///while(ans){
        var choice = scn.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Good choice- reading records");
                ops.readData();
                break;
            case 2:
                System.out.println("Good choice- add record");
                ops.addData();
                break;
            default:
                System.out.println("Enter correct choice");
                //sysout(do you want to continue)
                //ans=scn.nextChar();
                //}
        }
    }
}
