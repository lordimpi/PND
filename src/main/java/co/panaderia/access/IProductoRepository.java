package co.panaderia.access;

import co.panaderia.domain.entitys.Producto;
import java.util.List;

/**
 *
 * @author Santiago Acuña
 */
public interface IProductoRepository {
    
    public List<Producto> listar();
    public boolean crear(Producto nuevoProducto);
    public boolean eliminar(int id);
    public boolean actualizar(Producto productoModificado);
}
