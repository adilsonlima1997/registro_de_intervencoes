package com.sal.grupo.oasis.registro_de_intervencoes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sal.grupo.oasis.registro_de_intervencoes.Model.Avarias;
import com.sal.grupo.oasis.registro_de_intervencoes.Repository.Repositorio;

@RestController
public class Controle {
    
    @Autowired
    private Repositorio repositorio;

    @PostMapping("/")
    public Avarias cadastrar(@RequestBody Avarias c){
        return repositorio.save(c);
    }
    @GetMapping("/")
    public String teste(){
        return "Hello World";
    }
}
