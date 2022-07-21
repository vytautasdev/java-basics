package org.methods;

public class Calculator {
    int num1;
    int num2;

    // does not accept anything does not return anything
    public void show() {
        System.out.println(num1);
        System.out.println(num2);
    }

    // accepts something does not return anything
    public void add(int one, int two) {
        System.out.println(one + two);
    }

    // accepts something returns something
    public int add1(int m, int n) {
        return m + n;
    }
}
