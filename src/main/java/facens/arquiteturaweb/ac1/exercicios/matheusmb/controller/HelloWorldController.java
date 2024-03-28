package facens.arquiteturaweb.ac1.exercicios.matheusmb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
    @GetMapping("/")
    public String helloWorld() {
        // Devolver json com a mensagem "Hello World!"
        return "Hello World!";
    }
}