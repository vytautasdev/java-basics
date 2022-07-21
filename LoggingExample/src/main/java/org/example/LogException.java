package org.example;

import java.io.FileReader;

public class LogException {

    public void divideByZero() {
        System.out.println(10 / 0);
    }

    public void arrayBound() {
        var x = new int[5];
        System.out.println(x[6]);
    }

    public void fileNotFound() throws Exception {
        var fr = new FileReader("x.txt");
    }
}
