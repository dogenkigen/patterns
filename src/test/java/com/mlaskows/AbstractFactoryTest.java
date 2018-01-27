package com.mlaskows;

import com.mlaskows.creational.abstractfactory.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AbstractFactoryTest {

    @Test
    public void testJeans() {
        AbstractClothesFactory factory = new JeansClothesFactory();
        final Jacket jacket = factory.createJacket();
        final Trousers trousers = factory.createTrousers();

        assertEquals(0, jacket.getLowestApplicableTemp());
        assertEquals(20, jacket.getHighestApplicableTemp());
        assertFalse(jacket.isWaterProof());

        assertFalse(trousers.isBusinessDressCode());
    }

    @Test
    public void testFancy() {
        AbstractClothesFactory factory = new FancyClothesFactory();
        final Jacket jacket = factory.createJacket();
        final Trousers trousers = factory.createTrousers();

        assertEquals(5, jacket.getLowestApplicableTemp());
        assertEquals(25, jacket.getHighestApplicableTemp());
        assertFalse(jacket.isWaterProof());

        assertTrue(trousers.isBusinessDressCode());
    }

}
