package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
    @Bean
    public Traveller traveller(){
        return new Traveller(Car());
    }
}
