package org.enum_org;

public class EnumExample {
    public enum Season {
        WINTER, SPRING, SUMMER, FALL
    }

    public enum ProdColor {
        RED, BLUE, GREEN, YELLOW, ORANGE
    }

    public String name;

    public static void main(String[] args) {
        for (var item : Season.values()) {
            System.out.println(item);
        }

        for (var item : ProdColor.values()) {
            System.out.println(item);
        }
        System.out.println("The index of Winter is " + Season.valueOf("WINTER").ordinal());
        System.out.println("The index of Winter is " + Season.valueOf("SUMMER").ordinal());
    }
}
