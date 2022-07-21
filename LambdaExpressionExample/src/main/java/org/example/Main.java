package org.example;

public class Main {
    public static void main(String[] args) {


//        Doable doable = () -> {
//            System.out.println("Doing something...");
//        };
//
//        doable.doSomething();
//
//        Transferable transferable = () -> {
//            System.out.println("Transferring money...");
//        };
//
//        transferable.transfer();


//        Addition add1 = () -> {
//            System.out.println("This adds two numbers");
//        };

//        Addition add1 = (x, y) -> {
//
//            var sum = x + y;
//            System.out.println("The result is: " + sum);
//        };
//
//        add1.add(100, 5);

        Addition add1 = (x, y) -> x * y;
        var result = add1.add(1005, 5);
        System.out.println("The result is: " + result);

    }


}