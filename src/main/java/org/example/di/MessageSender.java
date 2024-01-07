package org.example.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    public Service service;
    /* Note: If there is single constructor in the class then we do not need to specify
    explicitly @Autowired we can omit it in case of single constructor
    */
// Constructor based dependency injection

/*
    @Autowired
    MessageSender(Service service){
        this.service=service;
    }
*/
//    Setter Based DI
@Autowired
    public void setService(Service service) {
        this.service = service;
    }

    public void sendMessage(String message){
        this.service.sendMessage(message);
    }
}
