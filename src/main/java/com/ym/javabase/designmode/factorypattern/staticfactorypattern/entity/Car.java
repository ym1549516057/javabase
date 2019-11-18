package com.ym.javabase.designmode.factorypattern.staticfactorypattern.entity;

/**
 * @author 15495
 */
public class Car extends Vehicle{
    @Override
    public void concreteProduct() {
        System.out.println("this is car");
    }
}
