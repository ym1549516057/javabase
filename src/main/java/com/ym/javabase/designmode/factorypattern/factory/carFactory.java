package com.ym.javabase.designmode.factorypattern.factory;

import com.ym.javabase.designmode.factorypattern.factory.entity.SedanCar;
import com.ym.javabase.designmode.factorypattern.factory.entity.SportCar;
import com.ym.javabase.designmode.factorypattern.factory.entity.Vehicle;

public class carFactory extends VehicleFactory {
    @Override
    protected Vehicle createVehicle(String item) {
        if (item.equals("small")) {
            return new SportCar();
        }
        if (item.equals("large")) {
            return new SedanCar();
        }
        return null;
    }

    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new carFactory();
        Vehicle vehicle = vehicleFactory.orderVehicle("small","red");
        System.out.println(vehicle);
    }
}
