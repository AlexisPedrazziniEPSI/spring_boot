package fr.epsi.b32526.cours_spring_boot.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "species")
public class Species {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "common_name", nullable = false, length = 50)
    private String commonName;

    @Column(name = "latin_name", nullable = false, length = 200)
    private String latinName;


}