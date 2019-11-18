package com.ym.javabase.designmode.factorypattern.reflectpattern;

import com.ym.javabase.designmode.factorypattern.VehicleType;
import com.ym.javabase.designmode.factorypattern.reflectpattern.entity.Bike;
import com.ym.javabase.designmode.factorypattern.reflectpattern.entity.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class ReflectFactory {
    /**
     * 保存产品ID,以及对应的类
     */
    private Map<String, Object> registerVehicle = new HashMap<>();

    /**
     * 注册产品方法
     *
     * @param vehicleId
     * @param vehicleClass
     */
    public void registerVehicle(String vehicleId, Class vehicleClass) {
        registerVehicle.put(vehicleId, vehicleClass);
    }

    /**
     * 生产产品
     *
     * @param type
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public Vehicle create(String type) throws IllegalAccessException, InstantiationException {
        Class productClass = (Class) registerVehicle.get(type);
        return (Vehicle) productClass.newInstance();
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        ReflectFactory reflectFactory = new ReflectFactory();
        reflectFactory.registerVehicle(VehicleType.Bike.name(), Bike.class);
        Vehicle vehicle = reflectFactory.create(VehicleType.Bike.name());
        vehicle.concreteProduct();
    }


}
