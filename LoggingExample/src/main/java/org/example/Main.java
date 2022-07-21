package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;



public class Main {
    public static void main(String[] args) {

//        var logException = new LogException();
//        var log = Logger.getLogger("");
//
//        try{
//            logException.divideByZero();
//        }
//        catch (Exception e) {
//            log.log(Level.WARNING, "can not devide by zero");
//        }
//
//        try{
//            logException.arrayBound();
//        }
//        catch (Exception e) {
//            log.log(Level.INFO, "Array index out of bound exception");
//        }
//
//        try{
//            logException.fileNotFound();
//        }
//        catch (Exception e) {
//            log.log(Level.INFO, "File not found exception");
//        }

        var log4j = new TestLog4J();

        log4j.logMessage("Error message");

    }
}