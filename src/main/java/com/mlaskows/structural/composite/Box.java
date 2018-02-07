package com.mlaskows.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Priceable {

    private final List<Priceable> priceables = new ArrayList<>();

    @Override
    public double getPrice() {
        return priceables.stream()
                .map(Priceable::getPrice)
                .reduce(0.0, (acc, price) -> acc += price);
    }

    public void add(Priceable priceable) {
        priceables.add(priceable);
    }

}
