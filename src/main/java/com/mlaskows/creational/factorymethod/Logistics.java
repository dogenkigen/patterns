package com.mlaskows.creational.factorymethod;

public abstract class Logistics {

    public String makeDelivery() {
        // Here we should have business logic
        final Transport transport = createTransport();
        return transport.deliver();
    }

    public abstract Transport createTransport();

}
