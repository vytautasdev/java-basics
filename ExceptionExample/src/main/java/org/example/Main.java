package org.example;

import org.example.test.Test;

public class Main {


    public static void main(String[] args) {

        var test = new Test();
        try {
            test.checkCCValidity("1234444433334444");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}