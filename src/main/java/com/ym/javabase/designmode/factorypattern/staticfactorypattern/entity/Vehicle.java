package com.ym.javabase.designmode.factorypattern.staticfactorypattern.entity;

import lombok.Data;

@Data
public abstract class Vehicle {
    int id;
    String name;

    public void concreteProduct() {
        System.out.println("this is vehicle...");
    }
}
