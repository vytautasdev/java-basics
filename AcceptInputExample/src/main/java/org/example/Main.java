package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.next();
        System.out.println("Hello " + name);
        System.out.println("Please enter your age: ");
        var age = scanner.nextInt();
        System.out.println("You are " + age + " years old ");
        System.out.println("Hello " + name + "! You are " + age + " years old.");
        var x = 10;
        var y = 20;
        var z = x + y;
        System.out.println(x + y);
        System.out.println(z);
    }
}