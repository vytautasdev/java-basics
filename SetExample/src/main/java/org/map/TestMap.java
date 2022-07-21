package org.map;

import org.example.Item;

import java.util.HashMap;

public class TestMap {

    public static void main(String[] args) {
//        var autoMap = new HashMap<>();
//        autoMap.put(101, "Car");
//        autoMap.put(102, "Bike");
//        autoMap.put(103, "Truck");
//        autoMap.put(104, "Bus");
//        autoMap.put(105, "Scooter");
//        autoMap.put(106, "SUV");
//        autoMap.put(106, "SUV"); // key should be unique
//
//        System.out.println(autoMap);
//
//        System.out.println("Keys: ");
//        for (var key :
//                autoMap.keySet()) {
//            System.out.println(key);
//        }
//
//        System.out.println("Values: ");
//        for (var value :
//                autoMap.values()) {
//            System.out.println(value);
//        }


        var item1 = new Item("Tv", 800, "Samsung", 1);
        var item2 = new Item("Phone", 700, "Apple", 1);
        var item3 = new Item("Bluetooth Mic", 120, "Razer", 1);
        var item4 = new Item("Cannon", 685, "Samsung", 1);

        var itemMap = new HashMap<>();
        itemMap.put(101, item1);
        itemMap.put(102, item2);
        itemMap.put(103, item3);
        itemMap.put(104, item4);
        System.out.println(itemMap);

        System.out.println("------------");

        for (var item :
                itemMap.keySet()) {
            System.out.println("Key: " + item);
        }

        System.out.println("------------");

        for (var item :
                itemMap.values()) {
            System.out.println("Value: " + item);
        }
    }
}
