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
