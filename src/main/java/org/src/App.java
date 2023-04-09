package org.src;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.src.controllers.api.DefaultController;
import org.src.controllers.impl.DefaultControllerImpl;
import org.src.dto.engine.api.Engine;
import org.src.dto.engine.impl.AbstractEngineFactory;
import org.src.dto.shapes.Triangle;
import org.src.dto.vehicle.api.Vehicle;
import org.src.dto.vehicle.impl.AbstractVehicleFactory;
import org.src.util.commons.AppContextScope;

/**
 * Hello world!
 *
 */
public class App
{
    static ApplicationContext context = AppContextScope.getApplicationContext();

    public static void main( String[] args )
    {


        DefaultController defaultController = (DefaultController) context.getBean("defaultController");
        defaultController.performEngineConfigurations();
        defaultController.performVehicleConfigurations();


        Triangle triangle1 = (Triangle) context.getBean("triangle1");

        System.out.println("Manual ref bean: " + triangle1);

        Triangle triangle2 = (Triangle) context.getBean("triangle2");
        System.out.println("Autowired bean: " + triangle2);
    }
}
