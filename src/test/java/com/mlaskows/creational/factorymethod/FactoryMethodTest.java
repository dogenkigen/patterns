package com.mlaskows.creational.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class FactoryMethodTest {

    @Test
    public void testRoadLogistics() {
        final Logistics roadLogistics = new RoadLogistics();

        final String deliveryReport = roadLogistics.makeDelivery();
        assertEquals("Delivered by truck", deliveryReport);
    }

    @Test
    public void testSeaLogistics() {
        final Logistics roadLogistics = new SeaLogistics();

        final String deliveryReport = roadLogistics.makeDelivery();
        assertEquals("Delivered by ship", deliveryReport);
    }

}
