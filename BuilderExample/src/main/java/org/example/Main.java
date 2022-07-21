package org.example;

import org.example.product.ProductBuilder;

public class Main {
    public static void main(String[] args) {

        var obj1 = new ProductBuilder().
                setId(101).
                setName("Best of Both").
                setBrand("Hovis").
                setPrice(3).
                setQuantity(1).
                setDeliveryFees(4).
                setCategory("Food").buildProduct();

        var obj2 = new ProductBuilder().
                setId(102).
                setName("White Bread").
                setBrand("Yorkshire Bakery").
                setQuantity(2).
                setCategory("Food").buildProduct();


    }
}


