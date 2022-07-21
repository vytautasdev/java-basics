package com;

public class Sample {
    int x;
    static int y = 10;// single copy per JVM
    static final int z = 100;

    public int incrementX() {
        x = x + 10;
        return x;
    }

    public static int increment() {
        y = y + 10;
        return y;

    }

    public static int incrementZ() {
        return z;
    }

}
