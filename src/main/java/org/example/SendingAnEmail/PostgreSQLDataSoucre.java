package org.example.SendingAnEmail;

import org.springframework.stereotype.Component;

@Component
public class PostgreSQLDataSoucre implements DataSource{
    @Override
    public void sendEmail() {
        System.out.println("Postgre data source sending mail.......");
    }
}
