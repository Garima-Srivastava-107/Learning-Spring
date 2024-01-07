package org.example.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
   public static void main(String[] args){
       String message="Hey there welcome to springBoot and spring tutorial";
       ApplicationContext applicationContext= new AnnotationConfigApplicationContext(Config.class);
       SmsService smsService=new SmsService();
       MessageSender messageSender=applicationContext.getBean(MessageSender.class);
   messageSender.sendMessage(message);
   }
}
