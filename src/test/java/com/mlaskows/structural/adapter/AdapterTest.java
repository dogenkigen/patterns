package com.mlaskows.structural.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdapterTest {

    @Test
    public void testFits() {
        final RoundHole roundHole = new RoundHole(5);
        final RoundPeg roundPeg = new RoundPeg(5);

        final SquarePeg smallSquarePeg = new SquarePeg(2);
        final SquarePeg largeSquarePeg = new SquarePeg(5);


        final SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        final SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        Assertions.assertTrue(roundHole.fits(roundPeg));

        Assertions.assertTrue(roundHole.fits(smallSquarePegAdapter));
        Assertions.assertFalse(roundHole.fits(largeSquarePegAdapter));
    }

}
