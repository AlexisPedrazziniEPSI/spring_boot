package fr.epsi.b32526.cours_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CoursSpringBootApplication {
    static void main(String[] args) {
        SpringApplication.run(CoursSpringBootApplication.class, args);
    }
    @GetMapping("hello")
    public String hello() {
        return "Bonjour, monde";
    }
}