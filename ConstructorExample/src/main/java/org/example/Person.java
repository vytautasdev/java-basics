package org.example;

public class Person {
    String name;
    int age;
    String address;

    //public Person(){}
    public Person(String name, int age, String address) {
        this.name = name;
        if (age <= 0 || age > 130) {
            System.out.println("invalid age");
        } else {
            this.age = age;
        }
        this.address = address;
        System.out.println("Person contructor called");
    }

    public Person() {
        this.name = "Not known";
        this.age = 12;
        this.address = "not known";
    }

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    //it must differ from each other in
    //no of arguments
    //order of arguments
    //types of arguments

    public void talk() {
        System.out.println("people do talk");
    }

    public void walk() {
    }

}
