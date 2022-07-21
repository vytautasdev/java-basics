package org.example;

public class Product {
    int id;
    String name;
    float price;
    int qty;
    String brand;
    String category;

    public Product(int id, String name, float price, int qty, String brand, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.brand = brand;
        this.category = category;
    }

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product() {

    }

}
