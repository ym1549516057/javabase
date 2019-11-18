package com.ym.javabase.designmode.factorypattern.newinstancepattern.entity;

/**
 * @author 15495
 */
public class Car extends Vehicle {
    @Override
    public Vehicle newInstance() {
        return new Car();
    }

    @Override
    public void concreteProduct() {
        System.out.println("this is car");
    }
}
