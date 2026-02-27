package fr.epsi.b32526.cours_spring_boot.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class PersonAnimalId implements Serializable {
    @Serial
    private static final long serialVersionUID = 5037997254198828168L;
    @Column(name = "person_id", nullable = false)
    private Integer personId;

    @Column(name = "animals_id", nullable = false)
    private Integer animalsId;


}