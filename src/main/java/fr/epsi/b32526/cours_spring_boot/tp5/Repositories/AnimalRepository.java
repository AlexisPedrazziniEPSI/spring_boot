package fr.epsi.b32526.cours_spring_boot.tp5.Repositories;

import fr.epsi.b32526.cours_spring_boot.tp5.entities.Animal;
import fr.epsi.b32526.cours_spring_boot.tp5.entities.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    List<Animal> findBySpecies(Species species);
    List<Animal> findByColorIn(List<String> colors);

    @Query("SELECT COUNT(a) FROM Animal a WHERE a.sex = :sex")
    Long countBySex(@Param("sex") String sex);

    @Query("SELECT CASE WHEN COUNT(p) > 0 THEN true ELSE false END FROM Person p INNER JOIN p.animal a WHERE a = :animal")
    boolean hasAtLeastOneOwner(@Param("animal") Animal animal);
}
