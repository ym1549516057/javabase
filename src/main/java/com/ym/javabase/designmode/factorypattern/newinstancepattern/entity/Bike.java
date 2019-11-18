package com.ym.javabase.designmode.factorypattern.newinstancepattern.entity;

public class Bike extends Vehicle {
    @Override
    public Vehicle newInstance() {
        return new Bike();
    }

    @Override
    public void concreteProduct() {
        System.out.println("this is bike");
    }
}
