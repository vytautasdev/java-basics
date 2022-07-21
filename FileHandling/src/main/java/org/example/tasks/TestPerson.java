package org.example.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestPerson {

    public static void main(String[] args) {

        var obj1 = new Person("Upasana", 30, "Instructor");
        var obj2 = new Person("Alex", 21, "Student");
        var obj3 = new Person("Ben", 19, "Programmer");
        var obj4 = new Person("Andy", 41, "Cloud Architect");

//        System.out.println(obj1);
//        System.out.println(obj2);
//        System.out.println(obj3);

        List<Person> personList = new ArrayList<>();
        personList.add(obj1);
        personList.add(obj2);
        personList.add(obj3);
        personList.add(obj4);

        System.out.println(personList + "\n");

        var person1 = personList.stream().filter(p -> "Upasana".equals(p.getName())).findAny().orElse(null);
        var person2 = personList.stream().filter(p -> "pasana".equals(p.getName())).findAny().orElse(null);
        var person3 = personList.stream().filter(p -> "Andy".equals(p.getName())).findAny().orElse(null);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

    }
}
