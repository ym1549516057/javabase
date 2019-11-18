package com.ym.javabase.designmode.factorypattern.reflectpattern.entity;

import lombok.Data;

@Data
public abstract class Vehicle {
    public void concreteProduct() {
        System.out.println("this is vehicle...");
    }
}
