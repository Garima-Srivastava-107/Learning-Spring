package org.example.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary
@Component("email")
public class EmailService implements Service{

    @Override
    public void sendMessage(String message) {
        System.out.println("Email Service"+message);
    }
}
