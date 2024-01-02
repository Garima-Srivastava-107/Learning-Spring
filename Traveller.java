package org.example;

public class Traveller {
    //Suppose we want to change the medium through which the traveller will travel then we have to change then we have to change this entire traveller class then 
    // to avoid this we will use the concept of loose coupling or dependency injection with the help of the interface
    Car car=null;
    Bus bus=null;
    Traveller(){
        this.car=new Car();
        this.bus=new Bus();
    }
    public void show(){
        car.move();
        bus.move();
    }
}
