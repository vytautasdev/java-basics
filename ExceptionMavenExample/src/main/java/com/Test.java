package com;

public class Test {
    public static void main(String[] args) {
        var obj = new Eligibility();

        try {
            obj.checkEligibility(12);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

        var obj1 = new ValidCC();
        try {
            obj1.checkValidity("123456789134567234567");
        } catch (ValidCCException e) {
            System.out.println(e.getMessage());

        }
    }

}
