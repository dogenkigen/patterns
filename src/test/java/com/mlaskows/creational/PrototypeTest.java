package com.mlaskows.creational;

import com.mlaskows.creational.prototype.Circle;
import com.mlaskows.creational.prototype.Rectangle;
import com.mlaskows.creational.prototype.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class PrototypeTest {

    @Test
    public void testClone() {
        final List<Shape> shapes = List.of(
                new Rectangle(1, 2, "black", 10, 5),
                new Circle(3, 4, "while", 3)
        );

        final List<Shape> clonedShapes = shapes.stream()
                .map(Shape::clone)
                .collect(Collectors.toList());

        final int expectedSize = 2;
        Assertions.assertEquals(expectedSize, shapes.size());
        Assertions.assertEquals(expectedSize, clonedShapes.size());

        for (int i = 0; i < expectedSize; i++) {
            Assertions.assertEquals(shapes.get(i), clonedShapes.get(i));
            Assertions.assertFalse(shapes.get(i) == clonedShapes.get(i));
        }

    }

}
