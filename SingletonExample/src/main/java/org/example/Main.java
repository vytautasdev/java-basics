package org.example;

import org.example.customer.CustomerSingleton;

public class Main {
    public static void main(String[] args) {

        var singletonOne = CustomerSingleton.getInstance();

    }
}