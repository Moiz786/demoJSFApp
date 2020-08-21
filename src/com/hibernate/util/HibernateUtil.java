package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactoryObj = buildSessionFactoryObj();
	 
    // Create The SessionFactory Object From Standard (Hibernate.cfg.xml) Configuration File
    @SuppressWarnings("deprecation")
    public static SessionFactory buildSessionFactoryObj() {
        try {
        	
        	Configuration configuration = new Configuration();
        	configuration=configuration.configure("hibernate.cfg.xml");
        	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
        	applySettings(configuration.getProperties());
        	sessionFactoryObj = configuration.buildSessionFactory(builder.build());
            //sessionFactoryObj = new Configuration().configure().buildSessionFactory();
        } catch (ExceptionInInitializerError exceptionObj) {
            exceptionObj.printStackTrace();
        }
        return sessionFactoryObj;
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactoryObj;
    }
    
    public static void shutdown() {
    	// Close caches and connection pools
    	getSessionFactory().close();
    }

}
