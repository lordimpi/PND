/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.panaderia.access;

import co.panaderia.domain.entitys.Persona;
import java.util.List;

/**
 *
 * @author Santiago Acuña
 */
public interface IPersonaRepository {

    boolean create(Persona newPersona);

    boolean update(Persona newPersona);

    Persona find(int id);

    List<Persona> list();
}
