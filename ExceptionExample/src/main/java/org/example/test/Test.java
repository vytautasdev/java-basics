package org.example.test;

import org.example.CreditCardNumberException;

public class Test extends CreditCardNumberException {

    public void checkCCValidity(String ccNumber) throws CreditCardNumberException {
        if (ccNumber.length() != 16) {
            throw new CreditCardNumberException("Invalid credit card number.");
        } else {
            System.out.println("Please make a payment.");
        }
    }


//    public String checkCC(String ccNumber) {
//        try {
//            if (ccNumber.length() != 16) {
//                return "Invalid credit card number.";
//            }
//        } catch (Exception e) {
//            return e.getMessage();
//        }
//        return "Credit card number: " + ccNumber;
//    }
}
