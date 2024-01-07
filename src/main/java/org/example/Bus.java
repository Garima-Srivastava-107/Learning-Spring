package org.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
//Use of add primary annotations :if we are using different database(then based on environment we can give preference to a data source
public class Bus implements Vehicle{
    public void move(){
        System.out.println("Bus is moving");
    }
}
