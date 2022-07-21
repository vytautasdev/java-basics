package org.example;

public class Test {
    public static void main(String[] args) {
        var obj1 = new ProductBuilder()
                .name("TV")
                .buildProduct();

        var obj2 = new ProductBuilder()
                .name("TV")
                .buildProduct();

        var obj3 = new ProductBuilder()
                .name("TV")
                .buildProduct();
    }
}
