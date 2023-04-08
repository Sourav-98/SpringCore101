package org.src.dto.engine.impl;

import org.src.dto.engine.api.Engine;

import java.io.Serializable;

public abstract class AbstractEngineFactory implements Engine, Serializable {

    private Integer horsePower;
    private Integer torque;
    private Integer fuelEconomy;

    public AbstractEngineFactory() {

    }

    public AbstractEngineFactory(Integer horsePower, Integer torque, Integer fuelEconomy) {
        this.horsePower = horsePower;
        this.torque = torque;
        this.fuelEconomy = fuelEconomy;
    }

    @Override
    public Integer getHorsePower() {
        return horsePower;
    }

    @Override
    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public Integer getTorque() {
        return torque;
    }

    @Override
    public void setTorque(Integer torque) {
        this.torque = torque;
    }

    @Override
    public Integer getFuelEconomy() {
        return fuelEconomy;
    }

    @Override
    public void setFuelEconomy(Integer fuelEconomy) {
        this.fuelEconomy = fuelEconomy;
    }



}
