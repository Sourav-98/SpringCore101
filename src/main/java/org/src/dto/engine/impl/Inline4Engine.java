package org.src.dto.engine.impl;

public class Inline4Engine extends AbstractEngineFactory {

    public Inline4Engine() {
        super();
    }

    public Inline4Engine(Integer horsePower, Integer torque, Integer fuelEconomy) {
        super(horsePower, torque, fuelEconomy);
    }

    @Override
    public String toString() {
        return "This is an Inline4Engine {" +
                "horsePower=" + super.getHorsePower() +
                ", torque=" + super.getTorque() +
                ", fuelEconomy=" + super.getFuelEconomy() +
                '}';
    }
}
