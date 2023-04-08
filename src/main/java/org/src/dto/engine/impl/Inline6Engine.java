package org.src.dto.engine.impl;

public class Inline6Engine extends AbstractEngineFactory {

    public Inline6Engine() {
        super();
    }

    public Inline6Engine(Integer horsePower, Integer torque, Integer fuelEconomy) {
        super(horsePower, torque, fuelEconomy);
    }

    @Override
    public String toString() {
        return "This is an Inline6Engine {" +
                "horsePower=" + super.getHorsePower() +
                ", torque=" + super.getTorque() +
                ", fuelEconomy=" + super.getFuelEconomy() +
                '}';
    }
}
