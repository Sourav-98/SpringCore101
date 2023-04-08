package org.src.dto.vehicle.impl;

import org.src.dto.engine.api.Engine;

public class Truck extends AbstractVehicleFactory {

    public Truck() {
        super();
    }

    public Truck(String manufacturer, String model, String dateOfManufacture, Integer exShowroomPrice, Engine engine) {
        super(manufacturer, model, dateOfManufacture, exShowroomPrice, engine);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "manufacturer='" + super.getManufacturer() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", dateOfManufacture='" + super.getDateOfManufacture() + '\'' +
                ", exShowroomPrice=" + super.getExShowroomPrice() +
                ", engine=" + super.getEngine() +
                '}';
    }
}
