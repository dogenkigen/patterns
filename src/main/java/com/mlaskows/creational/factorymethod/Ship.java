package com.mlaskows.creational.factorymethod;

public class Ship implements Transport {

    @Override
    public String deliver() {
        return "Delivered by ship";
    }

}
