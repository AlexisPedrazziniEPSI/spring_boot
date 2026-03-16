package fr.epsi.b32526.cours_spring_boot.tp2;

import fr.epsi.b32526.cours_spring_boot.tp2.service.BavardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("tp2HelloWorld")
public class helloWorld {
    @GetMapping("tp2/hello")
    public String hello() {
        return "Bonjour, monde (TP2)";
    }

    @Autowired
    private BavardService bavardService;

    @GetMapping("tp2/blabla")
    public String blabla() {
        return bavardService.parler();
    }

    static void main(String[] args) {
        SpringApplication.run(helloWorld.class, args);
    }
}