package fr.epsi.b32526.cours_spring_boot.tp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("tp1HelloWorld")
public class helloWorld {
    @GetMapping("tp1/hello")
    public String hello() {
        return "Bonjour, monde (TP1)";
    }

    static void main(String[] args) {
        SpringApplication.run(helloWorld.class, args);

    }
}