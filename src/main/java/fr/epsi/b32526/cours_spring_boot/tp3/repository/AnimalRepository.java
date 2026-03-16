package fr.epsi.b32526.cours_spring_boot.tp3.repository;

import fr.epsi.b32526.cours_spring_boot.tp3.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
