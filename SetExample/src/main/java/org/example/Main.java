package org.example;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        var fruits1 = new HashSet<>();
        fruits1.add("Apple");
        fruits1.add("Orange");
        fruits1.add("Banana");
        fruits1.add("Orange");
        fruits1.add("Pineapple");
        fruits1.add("Grapes");
        fruits1.add("Apple");
        fruits1.add("Fig");


        var fruits2 = new TreeSet<>();
        fruits2.add("Apple");
        fruits2.add("Orange");
        fruits2.add("Banana");
        fruits2.add("Orange");
        fruits2.add("Pineapple");
        fruits2.add("Grapes");
        fruits2.add("Apple");
        fruits2.add("Fig");

        var myItemsHashSet = new HashSet<>();
        var hashSetItem1 = new Item("Tv", 800, "Samsung", 1);
        var hashSetItem2 = new Item("Phone", 700, "Apple", 1);
        var hashSetItem3 = new Item("Bluetooth Mic", 120, "Razer", 1);
        var hashSetItem4 = new Item("Cannon", 685, "Samsung", 1);
        myItemsHashSet.add(hashSetItem1);
        myItemsHashSet.add(hashSetItem2);
        myItemsHashSet.add(hashSetItem3);
        myItemsHashSet.add(hashSetItem4);

        System.out.println(fruits1);
        System.out.println(fruits2);
        System.out.println(myItemsHashSet);


    }
}