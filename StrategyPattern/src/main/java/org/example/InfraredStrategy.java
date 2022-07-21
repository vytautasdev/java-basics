package org.example;

public class InfraredStrategy implements ConnectionStrategy{
    @Override
    public void connectTo(String phone) {
        System.out.println(String.format("Connecting to %s phone using infrared waves...This could take a while. Please wait.", phone));
        System.out.println("Success! Infrared connection has been established.");
    }
}
