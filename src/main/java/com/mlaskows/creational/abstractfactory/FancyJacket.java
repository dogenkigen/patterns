package com.mlaskows.creational.abstractfactory;

public class FancyJacket implements Jacket {

    @Override
    public boolean isWaterProof() {
        return false;
    }

    @Override
    public int getLowestApplicableTemp() {
        return 5;
    }

    @Override
    public int getHighestApplicableTemp() {
        return 25;
    }

}
