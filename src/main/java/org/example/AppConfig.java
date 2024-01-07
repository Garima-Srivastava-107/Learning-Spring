package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/* Java Based Configuration
@Configuration
public class AppConfig {
    @Bean
    public Vehicle Car(){
        return new Car();
    }
    @Bean
    public Vehicle Bus(){
        return new Bus();
    }
//    @Bean annotation tells the spring IOC container that
//    this method returns the instance of car class and spring IOC container have to manage the instance of the car class
    @Bean
    public Traveller traveller(){
        return new Traveller(Car());
    }
}*/
//Annotation Based Configuration
@ComponentScan("org.example")
@Configuration
public class AppConfig {

}
