package com.mlaskows.structural.composite;

public class Product implements Priceable {

    private final double price;

    public Product(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

}
