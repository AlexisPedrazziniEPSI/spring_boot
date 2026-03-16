package fr.epsi.b32526.cours_spring_boot;

import fr.epsi.b32526.cours_spring_boot.tp3.model.Person;
import fr.epsi.b32526.cours_spring_boot.tp3.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class CoursSpringBootApplication implements CommandLineRunner {

    @Autowired
    private PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(CoursSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // 1. Afficher la liste des entités avec findAll
        List<Person> persons = personRepository.findAll();
        System.out.println("Liste des personnes : " + persons);

        // 2. À l’aide de notre repository, créer quelques entités avec la méthode save
        Person newPerson = new Person();
        newPerson.setFirstname("Jean");
        newPerson.setLastname("Dupont");
        newPerson.setAge(30);
        personRepository.save(newPerson);
        System.out.println("Personne créée : " + newPerson);

        // 3. Rechercher une entité par son id avec findById
        Optional<Person> foundPerson = personRepository.findById(newPerson.getId());
        if (foundPerson.isPresent()) {
            System.out.println("Personne trouvée par ID : " + foundPerson.get());
        } else {
            System.out.println("Personne non trouvée avec l'ID : " + newPerson.getId());
        }

        // 4. Supprimer une entité avec delete, et afficher la longueur de la liste de toutes les entités
        personRepository.delete(newPerson);
        List<Person> remainingPersons = personRepository.findAll();
        System.out.println("Nombre de personnes restantes : " + remainingPersons.size());
    }
}
