package com.ym.javabase.designmode.factorypattern.factory;

import com.ym.javabase.designmode.factorypattern.factory.entity.Vehicle;

public abstract class VehicleFactory {
    protected abstract Vehicle createVehicle(String item);

    public Vehicle orderVehicle(String size,String color){
        Vehicle vehicle = createVehicle(size);
        vehicle.testVehicle();
        vehicle.setColor(color);
        return vehicle;
    }
}
