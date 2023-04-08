package org.src;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.src.controllers.api.DefaultController;
import org.src.controllers.impl.DefaultControllerImpl;
import org.src.dto.engine.api.Engine;
import org.src.dto.engine.impl.AbstractEngineFactory;
import org.src.dto.vehicle.api.Vehicle;
import org.src.dto.vehicle.impl.AbstractVehicleFactory;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        DefaultController defaultController = new DefaultControllerImpl();
        defaultController.performEngineConfigurations();
        defaultController.performVehicleConfigurations();
    }
}
