package fr.epsi.b32526.cours_spring_boot;

import fr.epsi.b32526.cours_spring_boot.tp2.service.BavardService;
import fr.epsi.b32526.cours_spring_boot.tp5.Repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CoursSpringBootApplicationTests {

    @Autowired
    private BavardService bavardService;

    @Autowired
    private PersonRepository personRepository;

    @Test
    void contextLoads() {
        assertThat(bavardService).isNotNull();
        assertThat(personRepository).isNotNull();
    }

    @Test
    void testTp2BavardService() {
        String message = bavardService.parler();
        assertThat(message).contains("Bonjour, je suis BavardService");
    }

    @Test
    void testTp5PersonRepository() {
        long count = personRepository.count();
        assertThat(count).isGreaterThanOrEqualTo(0);
    }
}
