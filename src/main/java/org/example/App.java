package org.example;

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
//  But suppose we have to create alot of objects then we can not do it manually right

        Car car=new Car();
        Traveller travel=new Traveller(car);
        travel.show();
        System.out.println( "Hello World!" );
    }
}
