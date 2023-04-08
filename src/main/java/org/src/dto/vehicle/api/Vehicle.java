package org.src.dto.vehicle.api;

import org.src.dto.engine.api.Engine;

public interface Vehicle {

    public String getManufacturer();

    public void setManufacturer(String manufacturer);

    public String getModel();

    public void setModel(String model);

    public String getDateOfManufacture();

    public void setDateOfManufacture(String dateOfManufacture);

    public Engine getEngine();

    public void setEngine(Engine engine);

    public Integer getExShowroomPrice();

    public void setExShowroomPrice(Integer exShowroomPrice);
}
