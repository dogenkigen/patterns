package com.mlaskows.structural.composite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompositeTest {

    @Test
    public void testGetPrice() {
        final Box mainBox = new Box();
        mainBox.add(new Product(0.5));
        mainBox.add(new Product(1.5));

        final Box smallerBox = new Box();
        smallerBox.add(new Product(2));
        smallerBox.add(new Product(3));

        mainBox.add(smallerBox);

        Assertions.assertEquals(7, mainBox.getPrice());
    }

}
