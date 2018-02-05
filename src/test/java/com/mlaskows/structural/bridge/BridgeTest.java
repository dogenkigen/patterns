package com.mlaskows.structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BridgeTest {

    @Test
    public void testDescription() {
        final Shape redCircle = new Circle(new Red());
        final Shape blueCircle = new Circle(new Blue());
        final Shape redSquare = new Square(new Red());
        final Shape blueSquare = new Square(new Blue());

        assertEquals("It's red circle.", redCircle.getDescription());
        assertEquals("It's blue circle.", blueCircle.getDescription());
        assertEquals("It's red square.", redSquare.getDescription());
        assertEquals("It's blue square.", blueSquare.getDescription());

    }

}
