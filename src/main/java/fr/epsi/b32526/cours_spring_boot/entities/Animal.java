package fr.epsi.b32526.cours_spring_boot.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "color", length = 50)
    private String color;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "sex", nullable = false)
    private String sex;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "species_id", nullable = false)
    private Species species;
}