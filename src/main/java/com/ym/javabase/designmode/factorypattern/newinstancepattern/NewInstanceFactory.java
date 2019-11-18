package com.ym.javabase.designmode.factorypattern.newinstancepattern;


import com.ym.javabase.designmode.factorypattern.VehicleType;
import com.ym.javabase.designmode.factorypattern.newinstancepattern.entity.Truck;
import com.ym.javabase.designmode.factorypattern.newinstancepattern.entity.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class NewInstanceFactory {
    private Map<String, Vehicle> registerProducts = new HashMap<>();

    public void registerProduct(String vehicleId, Vehicle vehicle) {
        registerProducts.put(vehicleId, vehicle);
    }

    public Vehicle create(String vehicleId) {

        return registerProducts.get(vehicleId).newInstance();
    }

    public static void main(String[] args) {
        NewInstanceFactory newInstanceFactory = new NewInstanceFactory();
        newInstanceFactory.registerProduct(VehicleType.Truck.name(), new Truck());
        Vehicle vehicle = newInstanceFactory.create(VehicleType.Truck.name());
        vehicle.concreteProduct();
    }
}
