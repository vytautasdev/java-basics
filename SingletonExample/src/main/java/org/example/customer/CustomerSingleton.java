package org.example.customer;

public final class CustomerSingleton {

    private static CustomerSingleton INSTANCE;
    private String info = "Default information";

    private CustomerSingleton() {
    }

    public static CustomerSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CustomerSingleton();
        }
        return INSTANCE;
    }
}
