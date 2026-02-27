package fr.epsi.b32526.cours_spring_boot.Repositories;

import fr.epsi.b32526.cours_spring_boot.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    List<Person> findByLastnameOrFirstname(String lastname, String firstname);
    List<Person> findByAgeGreaterThanEqual(Integer age);
}
