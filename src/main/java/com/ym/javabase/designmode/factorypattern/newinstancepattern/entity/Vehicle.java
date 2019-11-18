package com.ym.javabase.designmode.factorypattern.newinstancepattern.entity;

import lombok.Data;

@Data
public abstract class Vehicle {

    abstract public Vehicle newInstance();

    public void concreteProduct() {
        System.out.println("this is vehicle...");
    }
}
