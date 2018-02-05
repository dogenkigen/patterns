package com.mlaskows.structural.bridge;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public String getDescription() {
        return "It's " + getColor().getValue() + " circle.";
    }

}
