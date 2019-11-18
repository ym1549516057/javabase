package com.ym.javabase.designmode.factorypattern.staticfactorypattern.entity;

public class Truck extends Vehicle{
    @Override
    public void concreteProduct() {
        System.out.println("this is truck");
    }
}
