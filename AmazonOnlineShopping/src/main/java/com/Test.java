package com;

public class Test {
    public static void main(String[] args) {

//        System.out.println(Sample.y);
//        Sample.y = Sample.y + 100;
//        System.out.println(Sample.y);
//
//        Sample.y = Sample.y + 100;
//        System.out.println(Sample.y);
//
//        System.out.println(Math.PI);
//        System.out.println(Math.max(20, 30));

        var obj1 = new Sample();
        obj1.x = 10;
        System.out.println(obj1.incrementX());
        var obj2 = new Sample();
        obj2.x = 100;
        System.out.println(obj2.incrementX());


        System.out.println(Sample.increment());
        System.out.println(Sample.increment());
        System.out.println(Sample.increment());
        System.out.println(Sample.increment());
        System.out.println(Sample.increment());


    }

}
