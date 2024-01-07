package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Traveller {
    //Suppose we want to change the medium through which the traveller will travel then we have to change the
//    Car car=null;
//    Bus bus=null;
    Vehicle vehicle;
    @Autowired
    Traveller(@Qualifier("bus") Vehicle vehicle){
//        this.car=new Car();
//        this.bus=new Bus();
        this.vehicle=vehicle;
    }
    public void show(){
//        car.move();
//        bus.move();
        vehicle.move();
    }
}
