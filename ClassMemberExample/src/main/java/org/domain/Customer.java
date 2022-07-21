package org.domain;

public class Customer {
    //fields
    public int cId;
    public String name;
    public String address;
    public String email;

    //method/behavior
    public void display() {
        System.out.println(cId + "--" + name + "--" + email + "--" + address);
    }

}
