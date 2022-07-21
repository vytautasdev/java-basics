package org.example.tasks;

public class Employee {

    String firstName;
    String lastName;
    String phoneNumber;
    String email;
    int basicSalary;

    public Employee(String firstName, String lastName, String phoneNumber, String email, int basicSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.basicSalary = basicSalary;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", basicSalary=" + basicSalary +
                '}';
    }

    public int calculateFinalSalary(int basicSalary) {

        var finalSalary = (basicSalary * 10) / 100;
        return basicSalary + finalSalary;
    }

    public String greet(String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName;
    }

    public void validatePhoneNumber(String phoneNumber) {



        if (phoneNumber.length() == 13) {
            System.out.println("Success! Phone number has been verified.");
        } else {
            System.out.println("Invalid phone number.");
        }
    }

    public void validateEmail(String email) {

        if (email.contains("@")) {
            System.out.println("Success! Email address has been verified.");
        } else {
            System.out.println("Invalid email address.");
        }
    }
}
