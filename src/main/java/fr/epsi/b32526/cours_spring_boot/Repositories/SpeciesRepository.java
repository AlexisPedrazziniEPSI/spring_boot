package fr.epsi.b32526.cours_spring_boot.Repositories;

import fr.epsi.b32526.cours_spring_boot.entities.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpeciesRepository extends JpaRepository<Species, Integer> {
    Species findFirstByCommonName(String commonName);
    List<Species> findByLatinNameContainingIgnoreCase(String latinName);
}
