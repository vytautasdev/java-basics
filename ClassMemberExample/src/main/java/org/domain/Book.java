package org.domain;

public class Book {
    //fields
    public int bId;
    public String title;
    public float price;
    public String author;
    private String category;
    String publisher;//default

    //method/behavior
    public void show() {
        System.out.println(bId + "--" + title + "--" + price + "--" + author);
    }
}
