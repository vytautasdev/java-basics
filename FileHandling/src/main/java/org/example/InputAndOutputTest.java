package org.example;

import java.io.IOException;

public class InputAndOutputTest {
    public static void main(String[] args) {

        var obj = new InputAndOutput();

        try {
            obj.copy("x.txt", "y.txt");
            System.out.println("Operation completed");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
