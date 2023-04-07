package org.src.controllers.impl;

import org.src.controllers.api.DefaultController;
import org.src.services.api.VehicleConfigService;
import org.src.services.impl.VehicleConfigServiceImpl;
import org.src.util.enums.ApplicationException;

public class DefaultControllerImpl implements DefaultController {

    @Override
    public String defaultHelloWorld() {
        VehicleConfigService vehicleConfigService = new VehicleConfigServiceImpl();
        try {
            vehicleConfigService.configureVehicle();
        } catch (ApplicationException ae) {
            System.out.println(ae.getErrorCodeEnum().toString());
        }
        return "Hello World";
    }
}
