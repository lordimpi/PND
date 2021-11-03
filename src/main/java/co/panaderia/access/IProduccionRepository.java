package co.panaderia.access;

import co.panaderia.domain.entitys.Produccion;
import co.panaderia.domain.entitys.Producto;
import java.util.List;

/**
 *
 * @author Santiago Acuña
 */
public interface IProduccionRepository {

    public boolean create(Produccion newProduccion);

    public Produccion find(int id);

    public boolean update(Produccion produccion);

    public List<Produccion> list();

    public boolean delete(int id);
}
