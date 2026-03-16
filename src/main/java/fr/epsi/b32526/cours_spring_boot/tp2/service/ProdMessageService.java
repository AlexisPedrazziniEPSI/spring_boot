package fr.epsi.b32526.cours_spring_boot.tp2.service;

import org.springframework.context.annotation.Profile;

@Profile("prodMsg")
public class ProdMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "";
    }
}
