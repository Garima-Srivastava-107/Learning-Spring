package org.example.SendingAnEmail;

import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;

@Component("mysql")
public class MySQLDataSource implements DataSource {
    @Override
    public void sendEmail() {
        System.out.println("Mysql data source sending mail.......");
    }
}
