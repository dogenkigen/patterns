package com.mlaskows.creational.prototype;

import java.util.Objects;

public class Rectangle extends Shape {

    private final int width;
    private final int height;

    public Rectangle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    private Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.width = rectangle.getWidth();
        this.height = rectangle.getHeight();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width &&
                height == rectangle.height;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), width, height);
    }

}
