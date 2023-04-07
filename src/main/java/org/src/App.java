package org.src;

import org.src.controllers.api.DefaultController;
import org.src.controllers.impl.DefaultControllerImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        DefaultController defaultController = new DefaultControllerImpl();
        defaultController.defaultHelloWorld();
    }
}
