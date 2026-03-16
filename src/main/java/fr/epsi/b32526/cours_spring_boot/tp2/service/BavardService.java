package fr.epsi.b32526.cours_spring_boot.tp2.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class BavardService {
    private String nom = "Bourpi";

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String parler() {
        return "Bonjour, je suis " + this.getClass().getSimpleName();
    }

    @PostConstruct
    private void postConstruct() {
        System.out.println("J'ai oublier ma ram à la maison");
    }
}
