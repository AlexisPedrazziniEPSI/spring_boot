package fr.epsi.b32526.cours_spring_boot.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "age")
    private Integer age;

    @Column(name = "firstname", nullable = false, length = 50)
    private String firstname;

    @Column(name = "lastname", nullable = false, length = 50)
    private String lastname;

    @Column(name = "login", nullable = false, length = 50)
    private String login;

    @Column(name = "mdp", nullable = false, length = 100)
    private String mdp;

    @ColumnDefault("1")
    @Column(name = "active", nullable = false)
    private Byte active;


}