package fr.epsi.b32526.cours_spring_boot.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person_animals")
public class PersonAnimal {
    @EmbeddedId
    private PersonAnimalId id;

    @MapsId("personId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    @MapsId("animalsId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "animals_id", nullable = false)
    private Animal animals;


}