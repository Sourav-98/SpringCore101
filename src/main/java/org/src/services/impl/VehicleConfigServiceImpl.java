package org.src.services.impl;

import org.src.services.api.VehicleConfigService;
import org.src.util.enums.ApplicationException;
import org.src.util.exceptions.ErrorCodeEnum;

public class VehicleConfigServiceImpl implements VehicleConfigService {
    @Override
    public void configureVehicle() throws ApplicationException {
        throw new ApplicationException(ErrorCodeEnum.ERR_10000);
    }
}
