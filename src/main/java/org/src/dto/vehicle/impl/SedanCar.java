package org.src.dto.vehicle.impl;

import org.src.dto.engine.api.Engine;

public class SedanCar extends AbstractVehicleFactory {

    public SedanCar() {
        super();
    }

    public SedanCar(String manufacturer, String model, String dateOfManufacture, Integer exShowroomPrice, Engine engine) {
        super(manufacturer, model, dateOfManufacture, exShowroomPrice, engine);
    }

    @Override
    public String toString() {
        return "SedanCar{" +
                "manufacturer='" + super.getManufacturer() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", dateOfManufacture='" + super.getDateOfManufacture() + '\'' +
                ", exShowroomPrice=" + super.getExShowroomPrice() +
                ", engine=" + super.getEngine() +
                '}';
    }
}
