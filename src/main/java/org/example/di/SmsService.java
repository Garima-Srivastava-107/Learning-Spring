package org.example.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SmsService implements Service{
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS Service"+message);
    }
}
