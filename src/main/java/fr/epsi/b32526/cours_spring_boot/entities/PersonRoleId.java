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
public class PersonRoleId implements Serializable {
    @Serial
    private static final long serialVersionUID = 3009239939766878243L;
    @Column(name = "person_id", nullable = false)
    private Integer personId;

    @Column(name = "role_id", nullable = false)
    private Integer roleId;


}