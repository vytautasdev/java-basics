package org;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestMain {

    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("How are you");
        Result result = JUnitCore.runClasses(TestUnits.class);
        for (var fail : result.getFailures()) {
            System.out.println(fail.toString());
        }
        System.out.println("Result =" + result.wasSuccessful());
    }

}
