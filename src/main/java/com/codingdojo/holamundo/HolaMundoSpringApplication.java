package com.codingdojo.holamundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//1. Annotation
@RestController
public class HolaMundoSpringApplication {
     public static void main(String[] args) {
             SpringApplication.run(HolaMundoSpringApplication.class, args);
     }
     
     // 1. Anotación
     @RequestMapping("/")
     // 3. Método que se asigna a la Solicitud anterior.
     public String saluda() { // 3
             return "Hola Estimado ¿Que haces ahora...?";
     }
     
     @RequestMapping("/random")
     public String randon() { // 3
         return "Este es una cadena... para Spring Boot ";
 }
     
}
