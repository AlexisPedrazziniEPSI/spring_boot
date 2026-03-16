package fr.epsi.b32526.cours_spring_boot.tp5.Repositories;

import fr.epsi.b32526.cours_spring_boot.tp5.entities.Animal;
import fr.epsi.b32526.cours_spring_boot.tp5.entities.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    List<Animal> findBySpecies(Species species);
    List<Animal> findByColorIn(List<String> colors);
}
