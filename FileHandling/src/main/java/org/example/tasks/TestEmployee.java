package org.example.tasks;

public class TestEmployee {

    public static void main(String[] args) {

        var ceo = new Employee("N.r. Narayana", "Murthy", "+918028520261", "narayana@infosys.com", 5_000_000);

        System.out.println(ceo);
        System.out.println("--------------------------------------------");
        System.out.println(ceo.greet(ceo.firstName, ceo.lastName));
        System.out.println(ceo.firstName + " basic salary is: " + ceo.basicSalary + " Indian Rupees");

        var ceoFinalSalary = ceo.calculateFinalSalary(ceo.basicSalary);
        System.out.println(ceo.firstName + " final salary is: " + ceoFinalSalary + " Indian Rupees");

        ceo.validateEmail(ceo.email);

        ceo.validatePhoneNumber(ceo.phoneNumber);




    }
}
