package com.ym.javabase.designmode.factorypattern.staticfactorypattern.entity;

public class Bike extends Vehicle{
    @Override
    public void concreteProduct() {
        System.out.println("this is bike");
    }
}
