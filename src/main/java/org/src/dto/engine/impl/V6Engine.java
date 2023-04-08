package org.src.dto.engine.impl;

public class V6Engine extends AbstractEngineFactory {

    public V6Engine() {
        super();
    }

    public V6Engine(Integer horsePower, Integer torque, Integer fuelEconomy) {
        super(horsePower, torque, fuelEconomy);
    }

    @Override
    public String toString() {
        return "This is a V6Engine {" +
                "horsePower=" + super.getHorsePower() +
                ", torque=" + super.getTorque() +
                ", fuelEconomy=" + super.getFuelEconomy() +
                '}';
    }
}
