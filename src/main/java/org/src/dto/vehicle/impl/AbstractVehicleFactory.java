package org.src.dto.vehicle.impl;

import org.src.dto.engine.api.Engine;
import org.src.dto.vehicle.api.Vehicle;

import java.io.Serializable;

public abstract class AbstractVehicleFactory implements Vehicle, Serializable {

    private String manufacturer;
    private String model;
    private String dateOfManufacture;
    private Integer exShowroomPrice;
    private Engine engine;

    public AbstractVehicleFactory() {
    }

    public AbstractVehicleFactory(String manufacturer, String model, String dateOfManufacture, Integer exShowroomPrice, Engine engine) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.dateOfManufacture = dateOfManufacture;
        this.exShowroomPrice = exShowroomPrice;
        this.engine = engine;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    @Override
    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    @Override
    public Engine getEngine() {
        return engine;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Integer getExShowroomPrice() {
        return exShowroomPrice;
    }

    @Override
    public void setExShowroomPrice(Integer exShowroomPrice) {
        this.exShowroomPrice = exShowroomPrice;
    }

}
