package org.org;

public class Test {
    public static void main(String[] args) {
		var x = 10;
		var y = 20;
		var z = 5;

        if (x > y && y > z) // ||
        {
            System.out.println("x is biggest");
        } else if (y > x && x > z) {
            System.out.println("y is biggest");
        } else
            System.out.println("z is biggest");


    }

}
