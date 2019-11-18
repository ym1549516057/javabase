package com.ym.javabase.designmode.factorypattern.factory.entity;

import lombok.Data;

@Data
public abstract class Vehicle {
    String color;

    public abstract void testVehicle();
}
