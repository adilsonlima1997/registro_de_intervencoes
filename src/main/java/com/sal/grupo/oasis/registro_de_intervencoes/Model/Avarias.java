package com.sal.grupo.oasis.registro_de_intervencoes.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_avarias")
@Getter
@Setter
public class Avarias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numero_quarto;
    private String hotel;
    private String equipamento;
    private String por_quem;
    private String descrição;
    
}
