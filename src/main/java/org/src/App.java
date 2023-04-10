package org.src;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.src.controllers.api.DefaultController;
import org.src.dto.shapes.Triangle;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/beanconfig.xml");
        DefaultController defaultController = (DefaultController) context.getBean("defaultController");
        defaultController.performEngineConfigurations();
        defaultController.performVehicleConfigurations();


        Triangle triangle1 = (Triangle) context.getBean("triangle1");

        System.out.println("Manual ref bean: " + triangle1);

        Triangle triangle2 = (Triangle) context.getBean("triangle2");
        System.out.println("Autowired bean: " + triangle2);
    }
}
