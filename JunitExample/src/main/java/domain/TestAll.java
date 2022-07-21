package domain;

import org.junit.runner.JUnitCore;

public class TestAll {

    public static void main(String[] args) {
        //some other
        var result = JUnitCore.runClasses(MyTestSuiteClass.class);
        for (var fail : result.getFailures()) {
            System.out.println(fail.toString());
        }
        System.out.println("Result =" + result.wasSuccessful());

    }

}
