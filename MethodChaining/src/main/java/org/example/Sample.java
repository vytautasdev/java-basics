package org.example;

public class Sample {

    private String name;

    public Sample setName(String name) {
        this.name = name;
        return this;
    }

    public Sample showName() {
        System.out.println(name);
        return this;
    }

    public void greeting() {
        System.out.println("Hello " + name);
    }
}
