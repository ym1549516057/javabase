package com.ym.javabase.designmode.factorypattern.staticfactorypattern;

import com.ym.javabase.designmode.factorypattern.VehicleType;
import com.ym.javabase.designmode.factorypattern.staticfactorypattern.entity.Bike;
import com.ym.javabase.designmode.factorypattern.staticfactorypattern.entity.Car;
import com.ym.javabase.designmode.factorypattern.staticfactorypattern.entity.Truck;
import com.ym.javabase.designmode.factorypattern.staticfactorypattern.entity.Vehicle;

/**
 * 静态工厂模式
 */
public class StaticFactory {

    public static Vehicle create(VehicleType type) {
        if (type.equals(VehicleType.Bike)) {
            return new Bike();
        }
        if (type.equals(VehicleType.Car)) {
            return new Car();
        }

        if (type.equals(VehicleType.Truck)) {
            return new Truck();
        }

        return null;
    }

    public static void main(String[] args) {
        Vehicle vehicle = create(VehicleType.Car);
        vehicle.concreteProduct();
    }
}

