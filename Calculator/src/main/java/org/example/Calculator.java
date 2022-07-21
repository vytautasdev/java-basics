package org.example;

import java.util.Scanner;

public class Calculator {
    int x;
    int y;

    public int plus() {
        var scn = new Scanner(System.in);
        System.out.println("Enter first no.");
        x = scn.nextInt();
        System.out.println("Enter second number");
        y = scn.nextInt();
        return x + y;
    }

    public int minus() {
        var scn = new Scanner(System.in);
        System.out.println("Enter first no.");
        x = scn.nextInt();
        System.out.println("Enter second number");
        y = scn.nextInt();
        return x - y;
    }

    public int division() {
        var scn = new Scanner(System.in);
        System.out.println("Enter first no.");
        x = scn.nextInt();
        System.out.println("Enter second number");
        y = scn.nextInt();
        return x / y;
    }

    public int multiply() {
        var scn = new Scanner(System.in);
        System.out.println("Enter first no.");
        x = scn.nextInt();
        System.out.println("Enter second number");
        y = scn.nextInt();
        return x * y;
    }
}
