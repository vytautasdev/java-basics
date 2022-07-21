package org.map_org;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> autoMap = new HashMap();
        autoMap.put(101, "Sedan Car");
        autoMap.put(102, "Bike");
        autoMap.put(103, "Truck");
        autoMap.put(104, "Bus");
        autoMap.put(105, "Scooter");
        autoMap.put(106, "SUV");
        autoMap.put(107, "SUV");
        System.out.println(autoMap);
        autoMap.remove(101);

        System.out.println(autoMap);

        for (var item : autoMap.entrySet()) {
            System.out.println(item.getKey() + "---" + item.getValue());
        }

        Set<Integer> keySet = new HashSet();
        Set<String> valueSet = new HashSet();

        for (var item : autoMap.entrySet()) {
            keySet.add(item.getKey());
            valueSet.add(item.getValue());
        }

        System.out.println(keySet);
        System.out.println(valueSet);


    }

}
