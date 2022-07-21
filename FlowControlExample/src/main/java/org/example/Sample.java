package org.example;

import java.util.Scanner;

public class Sample {
    public static void action1() {
        System.out.println("Hello");
        //return
    }

    public static void action2() {
        System.out.println("Hello world");
    }

    public static void action3() {
        var scn = new Scanner(System.in);
        System.out.println("enter first name");
        var fName = scn.next();
        System.out.println("enter last name");
        var lName = scn.next();
        var fullName = fName + " " + lName;
        System.out.println("Hello " + fName + " " + lName);
        System.out.println("Hello " + fullName);
    }

    public static int action4() {
        var scn = new Scanner(System.in);
        System.out.println("Enter amount");
        var amount = scn.nextInt();
        System.out.println("Enter rate");
        var rate = scn.nextInt();
        System.out.println("Enter time");
        var time = scn.nextInt();
        var simInt = amount * rate * time / 100;
        var finalAmt = amount + simInt;
        //System.out.println(simInt);
        //System.out.println(finalAmt);
        return finalAmt;
    }

    //Execution point
    public static void main(String[] args) {
        var name = "John";
        action1();
        action2();
        action3();
        var z = action4();
        System.out.println(action4());
        System.out.println(z);

    }

}
