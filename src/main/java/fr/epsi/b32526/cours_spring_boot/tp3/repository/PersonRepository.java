package fr.epsi.b32526.cours_spring_boot.tp3.repository;

import fr.epsi.b32526.cours_spring_boot.tp3.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
