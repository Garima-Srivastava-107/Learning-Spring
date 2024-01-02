package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   //This is called as dependency injection
//  We do not have to change the entire traveller class we just need to pass
//  different objects to the interface and on the basis of the type of object passed it will call it respective methods
//  But suppose we have to create alot of objects in real time project then we can not do it manually right

//        Car car=new Car();
//        Traveller travel=new Traveller(car);
//        travel.show();
//        System.out.println( "Hello World!" );
//        **********Using java based configuration***********
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        Car car=applicationContext.getBean(Car.class);
        car.move();
        Bus bus=applicationContext.getBean(Bus.class);
        bus.move();
        Traveller traveller=applicationContext.getBean(Traveller.class);
        traveller.show();
// Once we annotate a  AppConfig class with @Configuration annotation then the class become a configuration class
//        and we can configure spring bean definition within this config class
//        Once the config class is ready create a method and annotate it with bean annotation
//        eg : we need to create a spring bean for the bike class then we can create a method of the bike class and annotate it with bean annotation
//        and only once we have to create the object and we can get the object again by the spring IOC Container
//        In java based configuration we need to inject this dependency manaually
//        as the traveller class depend on the bike class so we need to inject this dependency manually
    }
}
