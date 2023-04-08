package org.src.dto.vehicle.impl;

import org.src.dto.engine.api.Engine;

public class F1Car extends AbstractVehicleFactory {

    public F1Car() {
        super();
    }

    public F1Car(String manufacturer, String model, String dateOfManufacture, Integer exShowroomPrice, Engine engine) {
        super(manufacturer, model, dateOfManufacture, exShowroomPrice, engine);
    }

    @Override
    public String toString() {
        return "F1Car{" +
                "manufacturer='" + super.getManufacturer() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", dateOfManufacture='" + super.getDateOfManufacture() + '\'' +
                ", exShowroomPrice=" + super.getExShowroomPrice() +
                ", engine=" + super.getEngine() +
                '}';
    }
}
