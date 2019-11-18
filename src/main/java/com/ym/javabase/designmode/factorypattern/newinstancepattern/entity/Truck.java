package com.ym.javabase.designmode.factorypattern.newinstancepattern.entity;

public class Truck extends Vehicle {
    @Override
    public Vehicle newInstance() {
        return new Truck();
    }

    @Override
    public void concreteProduct() {
        System.out.println("this is truck");
    }
}
