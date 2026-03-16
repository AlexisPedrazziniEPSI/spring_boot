package fr.epsi.b32526.cours_spring_boot.tp5.Repositories;

import fr.epsi.b32526.cours_spring_boot.tp5.entities.Animal;
import fr.epsi.b32526.cours_spring_boot.tp5.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    List<Person> findByLastnameOrFirstname(String lastname, String firstname);
    List<Person> findByAgeGreaterThanEqual(Integer age);

    @Query("SELECT p FROM Person p WHERE p.age BETWEEN :ageMin AND :ageMax")
    List<Person> findByAgeBetween(@Param("ageMin") Integer ageMin, @Param("ageMax") Integer ageMax);

    @Query("SELECT p FROM Person p INNER JOIN p.animal a WHERE a = :animal")
    List<Person> findPersonsByAnimal(@Param("animal") Animal animal);
}
