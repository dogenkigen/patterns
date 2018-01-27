package com.mlaskows.creational.abstractfactory;

public class FancyClothesFactory implements AbstractClothesFactory {

    @Override
    public Jacket createJacket() {
        return new FancyJacket();
    }

    @Override
    public Trousers createTrousers() {
        return new FancyTrousers();
    }

}
