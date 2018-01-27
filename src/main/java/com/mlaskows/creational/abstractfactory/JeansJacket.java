package com.mlaskows.creational.abstractfactory;

public class JeansJacket implements Jacket {

    @Override
    public boolean isWaterProof() {
        return false;
    }

    @Override
    public int getLowestApplicableTemp() {
        return 0;
    }

    @Override
    public int getHighestApplicableTemp() {
        return 20;
    }

}
