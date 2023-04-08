package org.src.controllers.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.src.controllers.api.DefaultController;
import org.src.controllers.api.EngineController;
import org.src.controllers.api.VehicleController;
import org.src.dto.engine.api.Engine;
import org.src.dto.vehicle.api.Vehicle;

public class DefaultControllerImpl implements DefaultController, EngineController, VehicleController {

    ApplicationContext context = new ClassPathXmlApplicationContext("config/beanconfig.xml");

    @Override
    public String defaultHelloWorld() {

        Engine engine = (Engine) context.getBean("V6Engine");
        System.out.println(engine);

        return "Hello World";
    }

    @Override
    public void performEngineConfigurations() {
        Engine engine = (Engine) context.getBean("Inline4Engine");
        // Inline4Engine configured via Constructor Injection
        System.out.println(engine);
        engine = (Engine) context.getBean("V6Engine");
        // V6Engine configured via Setter Injection
        System.out.println(engine);
    }

    @Override
    public void performVehicleConfigurations() {
        Vehicle vehicle = (Vehicle) context.getBean("SedanCar");
        Engine engine = (Engine) context.getBean("Inline4Engine");
        // Explicit setting of engine for the vehicle
        vehicle.setEngine(engine);
        System.out.println(vehicle);
        vehicle = (Vehicle) context.getBean("F1Car");
        // Setter Injection used to reference an engine into a vehicle
        System.out.println(vehicle);
    }
}
