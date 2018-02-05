package com.mlaskows.structural.bridge;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public String getDescription() {
        return "It's " + getColor().getValue() + " square.";
    }

}
