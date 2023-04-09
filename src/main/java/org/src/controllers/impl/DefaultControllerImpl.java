package org.src.controllers.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.src.controllers.api.DefaultController;
import org.src.controllers.api.EngineController;
import org.src.controllers.api.VehicleController;
import org.src.dto.engine.api.Engine;
import org.src.dto.vehicle.api.Vehicle;
import org.src.dto.vehicle.impl.SedanCar;
import org.src.util.commons.AppContextScope;

public class DefaultControllerImpl implements DefaultController, EngineController, VehicleController {

    private static ApplicationContext context = AppContextScope.getApplicationContext();

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

        try {
            // This will throw NoSuchBeanDefinitionException, as Inline6Engine bean is configured as an inner bean for Truck bean
            engine = (Engine) context.getBean("Inline6Engine");
            System.out.println(engine);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void performVehicleConfigurations() {
        Vehicle vehicle = context.getBean(SedanCar.class);
        Engine engine = (Engine) context.getBean("Inline4Engine");
        // Explicit setting of engine for the vehicle
        vehicle.setEngine(engine);
        System.out.println("Car: " +vehicle);

        vehicle = (Vehicle) context.getBean("F1Car");
        // Setter Injection used to reference an engine into a vehicle
        System.out.println("F1Car: " + vehicle);

        vehicle = (Vehicle) context.getBean("Truck");
        // Truck has an inner bean configured as an Inline6Engine
        System.out.println("Truck: " + vehicle);

        vehicle = (Vehicle) context.getBean("MonsterTruck");
        // Monster Truck is an alias for Truck bean
        System.out.println("Monster Truck: " + vehicle);
    }
}
