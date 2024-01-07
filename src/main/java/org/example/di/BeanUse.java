package org.example.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


class Address{
    Student student;
    Address(Student student){
        this.student=student;
    }
    public void print(){
        System.out.println("Address method called....");
        this.student.print();
    }

}

class Student{
public void print(){
    System.out.println("Student method called....");
}
/*
Real Life usecase of init and destroy method:
When you want to insert the some data at the application startup and remove
those record from the database when the application shutdown
 */
    public void init(){
        System.out.println("Init method called....");
    }
    public void destroy(){
        System.out.println("Destroy method called.....");
    }
}

@Configuration
class AppConfig{
    @Bean(name={"gari","arnab"})
    Address address(){
        return new Address(student());
    }
    @Bean(initMethod="init",destroyMethod="destroy")
     Student student(){
        return new Student();
    }

}
public class BeanUse {
    public static void main(String args[]){
//        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        try(var applicationContext=new AnnotationConfigApplicationContext(AppConfig.class)) {
            Address address = (Address) applicationContext.getBean("arnab");
            address.print();
            String[] beaname = applicationContext.getBeanDefinitionNames();
            for (String x : beaname) {
                System.out.println(x);
            }
        }
    }

}
