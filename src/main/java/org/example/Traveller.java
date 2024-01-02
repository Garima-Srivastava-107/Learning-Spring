package org.example;

public class Traveller {
    //Suppose we want to change the medium through which the traveller will travel then we have to change the
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
