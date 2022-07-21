package org.example;


import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        var name = "upasana";
        var emp = new Employee();
        var book = new Book();
        book.bId = 1001;
        book.title = "The Partner";
        book.price = 15.00f;
        book.publisher = "XYZ";
        book.category = "Novel";
//        System.out.println(book);
        var book1 = new Book();
        book1.bId = 1002;
        book1.title = "The firm";
        book1.price = 16.00f;
        book1.publisher = "ABC";
        book1.category = "Novel";


        var book2 = new Book();
        var book3 = new Book();

        var cust = new Customer();
        var myArray = new ArrayList(10);//any object
        myArray.add(name);
        myArray.add("Ben");
        myArray.add(emp);
        myArray.add(cust);
        myArray.add(book);
        myArray.add(324336); //Integer x=new Integer(234567);
        myArray.add(true);

        var myString = new ArrayList();//any object
        myString.add("Upasana");
        myString.add("Alex");
        myString.add("Ludo");
        myString.add(0, "Richard");
        //System.out.println(myString);
        myString.remove(2);
//        System.out.println(myString);
//        System.out.println(myString);
//        System.out.println(myString.get(2));
//        System.out.println(myString.size());


        var myBooks = new ArrayList();
        myBooks.add(book1);
        myBooks.add(book3);
        myBooks.add(book2);
        myBooks.add(book);
        System.out.println(myBooks);
        for (var item : myBooks) {
            System.out.println(item);
        }


        var myNums = new ArrayList();


    }

}
