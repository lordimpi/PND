package co.panaderia.access;

import co.panaderia.domain.entitys.Empleado;
import java.util.List;

/**
 *
 * @author Santiago Acuña
 */
public interface IEmpleadoRepository {

    boolean create(Empleado newPersona);

    boolean update(Empleado newPersona);

    Empleado find(int id);
    
    Empleado findByEmail(String email);

    List<Empleado> list();
}
