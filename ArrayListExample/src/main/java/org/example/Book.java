package org.example;

public class Book {
    //fields/ attributes
    public int bId;
    public String title;
    public float price;
    public String author;
    public String category;
    public String publisher;//default

    //method/behavior
    public void show() {
        System.out.println(bId + "--" + title + "--" + price + "--" + author);
    }

    @Override
    public String toString() {
        return "Book [bId=" + bId + ", title=" + title + ", price=" + price + ", author=" + author + ", category="
                + category + ", publisher=" + publisher + "]";
    }

}
