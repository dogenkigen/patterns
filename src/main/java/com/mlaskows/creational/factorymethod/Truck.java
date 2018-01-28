package com.mlaskows.creational.factorymethod;

public class Truck implements Transport {

    @Override
    public String deliver() {
        return "Delivered by truck";
    }

}
