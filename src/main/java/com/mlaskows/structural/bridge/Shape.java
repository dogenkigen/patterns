package com.mlaskows.structural.bridge;

public abstract class Shape {

    private final Color color;

    public Shape(Color color) {
        this.color = color;
    }

    protected Color getColor() {
        return color;
    }

    public abstract String getDescription();
}
