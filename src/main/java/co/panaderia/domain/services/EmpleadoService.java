/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.panaderia.domain.services;

import co.panaderia.access.Factory;
import co.panaderia.domain.entitys.Empleado;
import java.util.List;
import co.panaderia.access.IEmpleadoRepository;

/**
 *
 * @author Santiago Acuña
 */
public class EmpleadoService {

    private final IEmpleadoRepository repository;

    public EmpleadoService() {
        repository = Factory.getInstance().getPersonaRepository();
    }

    public boolean update(Empleado empleado) {
        Empleado emp = repository.find(empleado.getId());
        if (emp != null) {
            return repository.update(empleado);
        }
        return false;
    }

    public boolean crear(Empleado empleado) {
        return repository.create(empleado);
    }

    public Empleado findByEmail(String email) {
        return repository.findByEmail(email);
    }

    /**
     * Busca todos las Personas en la base de datos
     *
     * @return lista de personas
     */
    public List<Empleado> list() {
        List<Empleado> persons = repository.list();
        return persons;
    }
}
