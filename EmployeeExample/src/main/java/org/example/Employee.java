package org.example;

public class Employee {

    String firstName;
    String LastName;
    int age;
    String address;
    String phoneNo;
    String Email;
    int basicSalary;

    public Employee() {

    }

    public Employee(String firstName, String lastName, int age, String address, String phoneNo, String email,
                    int basicSalary) {
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
        this.address = address;
        this.phoneNo = phoneNo;
        Email = email;
        this.basicSalary = basicSalary;
    }

    public int calculateSalary(int salary) {
        this.basicSalary = salary;
        int finalSalary = (basicSalary * 10 / 100) + basicSalary;
        return finalSalary;
    }

    public int calculateSalary() {
        int finalSalary = (basicSalary * 10 / 100) + basicSalary;
        return finalSalary;
    }

    public String greeting() {
        return "Hello " + firstName + " " + LastName;
    }

    public String greeting(String fname, String lname) {
        return "Hello " + fname + " " + lname;
    }

    public boolean checkPhone() {
        if (phoneNo.length() < 10)
            return false;
        else
            return true;
    }

    public boolean checkEmail() {
        if (Email.contains("@"))
            return true;
        else
            return false;
    }


    public Employee(String firstName, String lastName, int age, String address, String phoneNo, String email
    ) {
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
        this.address = address;
        this.phoneNo = phoneNo;
        Email = email;
        this.basicSalary = basicSalary;
    }
    //no of params
    //datatype of params
    //order of params

    public Employee(String firstName, String lastName, int age, String address, int basicSalary) {
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
        this.address = address;
        this.phoneNo = phoneNo;

        this.basicSalary = basicSalary;
    }


    public Employee(String firstName, String lastName, int age, String phoneNo) {
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
        this.address = address;
        this.phoneNo = phoneNo;

        this.basicSalary = basicSalary;
    }

    public Employee(String firstName, int age, String address, String phoneNo, String email,
                    int basicSalary) {
        this.firstName = firstName;
        this.age = age;
        this.address = address;
        this.phoneNo = phoneNo;
        Email = email;
        this.basicSalary = basicSalary;
    }

    public Employee(int age, String address, String phoneNo, String email, int basicSalary) {
        this.age = age;
        this.address = address;
        this.phoneNo = phoneNo;
        Email = email;
        this.basicSalary = basicSalary;
    }

    public Employee(String phoneNo, String email, int basicSalary) {
        this.firstName = firstName;
        this.age = age;
        this.address = address;
        this.phoneNo = phoneNo;
        Email = email;
        this.basicSalary = basicSalary;
    }

    public Employee(String firstName, String lastName, int age, int basicSalary) {
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
        this.address = address;
        this.phoneNo = phoneNo;

        this.basicSalary = basicSalary;
    }

}
