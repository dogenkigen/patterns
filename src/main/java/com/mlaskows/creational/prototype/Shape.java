package com.mlaskows.creational.prototype;

import java.util.Objects;

public abstract class Shape {

    private final int x;
    private final int y;
    private final String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    protected Shape(Shape shape) {
        this.x = shape.getX();
        this.y = shape.getY();
        this.color = shape.getColor();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return x == shape.x &&
                y == shape.y &&
                Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y, color);
    }
}
