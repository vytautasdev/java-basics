package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) {
        var le = new LogException();
        var log = Logger.getLogger("");
        try {
            le.divByZero();
        } catch (Exception e) {
            log.log(Level.WARNING, "can not / by zero");
        }
        try {
            le.arrayBound();
        } catch (Exception e) {
            log.log(Level.INFO, "Array index out of bounds");
        }

    }

}
