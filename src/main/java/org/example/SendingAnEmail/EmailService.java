package org.example.SendingAnEmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmailService {
    DataSource dataSource;
    @Autowired
    EmailService(@Qualifier("mysql") DataSource dataSource){
       this.dataSource=dataSource;
    }
    public void sendEmail(){
        this.dataSource.sendEmail();
    }
}
