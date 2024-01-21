package com.sal.grupo.oasis.registro_de_intervencoes.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controle {
    
    @GetMapping("/")
    public String teste(){
        return "Hello World";
    }
}
