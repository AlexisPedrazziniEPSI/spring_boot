package fr.epsi.b32526.cours_spring_boot.tp2.service;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService {

    @Override
    public String getMessage() {
        return "Message envoyé par email.";
    }
}
