package org.test;

public class TestCase {

    public static void main(String[] args) {
        var signal = "Yellow";

        switch (signal) {
            case "green":
                System.out.println("You may go");
                break;
            case "amber":
                System.out.println("Please check for other vehicle and then go");
                break;
            case "red":
                System.out.println("Please wait for the signal to turn green");
                break;
            default:
                System.out.println("not a valid signal");

        }

    }

}
