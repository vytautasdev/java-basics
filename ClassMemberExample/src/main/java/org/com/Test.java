package org.com;


public class Test {

    public static void main(String[] args) {
        var emp = new Employee();
        emp.setName("Upasana");
        emp.setAge(20);
        emp.setEid(101);

        System.out.println(emp.getAge());
        System.out.println(emp.getEid());
        System.out.println(emp.getName());

    }

}
