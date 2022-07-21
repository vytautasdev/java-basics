package org.methods;

public class Test {
    public static void main(String[] args) {
        var cal = new Calculator();
        cal.num1 = 100;
        cal.num2 = 200;
        cal.show();
        cal.add(200, 400);
        System.out.println(cal.add1(200, 40));

        var num4 = 100 + cal.add1(1200, 440);
        System.out.println(num4);
    }

}
