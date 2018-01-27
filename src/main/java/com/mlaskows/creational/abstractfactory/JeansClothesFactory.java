package com.mlaskows.creational.abstractfactory;

public class JeansClothesFactory implements AbstractClothesFactory {

    @Override
    public Jacket createJacket() {
        return new JeansJacket();
    }

    @Override
    public Trousers createTrousers() {
        return new JeansTrousers();
    }

}
