package com.ym.javabase.designmode.factorypattern.reflectpattern.entity;

public class Bike extends Vehicle {
    @Override
    public void concreteProduct() {
        System.out.println("this is bike");
    }
}
