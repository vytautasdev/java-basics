package org.example.product;

public class ProductBuilder {
    private int id;
    private String name;
    private String brand;
    private int price;
    private int quantity;
    private int deliveryFees;
    private String category;


    public ProductBuilder() {

    }

    public Product buildProduct() {
        return new Product(id, name, brand, price, quantity, deliveryFees, category);
    }

    public ProductBuilder setId(int passedId) {
        this.id = passedId;
        return this;
    }

    public ProductBuilder setName(String passedName) {
        this.name = passedName;
        return this;
    }

    public ProductBuilder setBrand(String passedBrand) {
        this.brand = passedBrand;
        return this;
    }

    public ProductBuilder setPrice(int passedPrice) {
        this.price = passedPrice;
        return this;
    }

    public ProductBuilder setQuantity(int passedQty) {
        this.quantity = passedQty;
        return this;
    }

    public ProductBuilder setDeliveryFees(int passedDeliveryFees) {
        this.deliveryFees = passedDeliveryFees;
        return this;
    }

    public ProductBuilder setCategory(String passedCategory) {
        this.category = passedCategory;
        return this;
    }

    @Override
    public String toString() {
        return "ProductBuilder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", deliveryFees=" + deliveryFees +
                ", category='" + category + '\'' +
                '}';
    }
}
