/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.panaderia.domain.services;

import co.panaderia.access.Factory;
import co.panaderia.access.IPersonaRepository;
import co.panaderia.domain.entitys.Persona;
import java.util.List;

/**
 *
 * @author Santiago Acuña
 */
public class PersonaService {

    private IPersonaRepository repository;

    public PersonaService(){
        repository = Factory.getInstance().getPersonaRepository();
    }
    
    /**
     * Busca todos las Personas en la base de datos
     *
     * @return lista de personas
     */
    public List<Persona> list() {
        List<Persona> persons = repository.list();
        return persons;
    }
}
