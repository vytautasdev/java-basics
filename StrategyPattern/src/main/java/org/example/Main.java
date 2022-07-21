package org.example;

public class Main {
    public static void main(String[] args) {

        var context = new StrategySwapper();
        context.setConnectionStrategy(new InfraredStrategy());
        context.connect("Upasana");
    }
}