package org.example.product;

public class Product {

    private int id;
    private String name;
    private String brand;
    private int price;
    private int quantity;
    private int deliveryFees;
    private String category;

    public Product(int id, String name, String brand, int price, int quantity, int deliveryFees, String category) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.deliveryFees = deliveryFees;
        this.category = category;
    }
}
