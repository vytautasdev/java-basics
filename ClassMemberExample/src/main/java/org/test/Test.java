package org.test;

import org.domain.Book;
import org.domain.Customer;

public class Test {

    public static void main(String[] args) {
        var bb = new Book();
        var c1 = new Customer();//creating a customer object and allocating memory to it
        c1.cId = 1001;
        c1.name = "David";
        c1.address = "UK";
        c1.email = "d@gmail.com";
        c1.display();
        var c2 = new Customer();//creating a customer object and allocating memory to it
        c2.cId = 1002;
        c2.name = "Ron";
        c2.address = "USA";
        c2.email = "r@gmail.com";
        c2.display();
        var b1 = new Book();//creating a book object and allocating memory to it
        b1.bId = 3001;
        b1.title = "tell me your dreams";
        b1.price = 12.55f;
        b1.author = "Sidney Sheldon";
        b1.show();


    }

}
