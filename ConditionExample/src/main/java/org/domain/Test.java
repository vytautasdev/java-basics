package org.domain;

public class Test {

    public static void main(String[] args) {
        var e = new Employee();
        var s = new Student();
        var c = new Customer();

        if (s instanceof Student) {
            System.out.println("You got a customer object");
        } else
            System.out.println("You dont have a customer object");

    }

}
