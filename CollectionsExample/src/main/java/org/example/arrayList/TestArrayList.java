package org.example.arrayList;

import java.util.ArrayList;

public class TestArrayList {


    public static void main(String[] args) {
        var arrayList = new ArrayList<>();
        arrayList.add("Upasana");
        arrayList.add(1234);
        arrayList.add(true);
        arrayList.add(30.56);
        System.out.println(arrayList);

        var myNums = new ArrayList<>();
        myNums.add(1000);
        myNums.add(2000);
        myNums.add(3000);
        myNums.add(4000);
        System.out.println(myNums);

        var myItems = new ArrayList<>();
        var item1 = new Item("Tv", 800, "Samsung", 1);
        var item2 = new Item("Phone", 700, "Apple", 1);
        var item3 = new Item("Bluetooth Mic", 120, "Razer", 1);
        var item4 = new Item("Cannon", 685, "Samsung", 1);

        myItems.add(item1);
        myItems.add(item2);
        myItems.add(item3);
        myItems.add(item4);
        System.out.println(myItems);
    }
}
