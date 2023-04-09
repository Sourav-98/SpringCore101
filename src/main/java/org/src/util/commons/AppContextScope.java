package org.src.util.commons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContextScope {

    private static ApplicationContext applicationContext = null;

    public static ApplicationContext getApplicationContext() {
        if (applicationContext == null) {
            applicationContext = new ClassPathXmlApplicationContext("config/beanconfig.xml");
        }
        return applicationContext;
    }

}
