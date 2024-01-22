package com.sal.grupo.oasis.registro_de_intervencoes.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sal.grupo.oasis.registro_de_intervencoes.Model.Avarias;

@Repository
public interface Repositorio extends CrudRepository<Avarias, Integer>{
    
}
