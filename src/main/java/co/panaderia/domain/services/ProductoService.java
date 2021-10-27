package co.panaderia.domain.services;

import co.panaderia.access.Factory;
import co.panaderia.access.IProductoRepository;
import co.panaderia.domain.entitys.Producto;
import java.util.List;

/**
 * Repositorio de productos
 *
 * @author Santiago Acuña
 */
public class ProductoService {

    private final IProductoRepository repository;

    public ProductoService() {
        repository = Factory.getInstance().getProductoRepository();
    }

    /**
     * Servicio encargado de buscar un producto en la base de datos
     *
     * @param id Identificador del producto
     * @return Instancia del Producto
     */
    public Producto buscar(int id) {
        return repository.buscar(id);
    }

    /**
     * Busca todos los Productos en la base de datos
     *
     * @return lista de productos
     */
    public List<Producto> list() {
        List<Producto> persons = repository.listar();
        return persons;
    }

    /**
     * Servicio encargado de crear un producto para almacenarlo en la base de
     * datos
     *
     * @param nuevoProducto Producto que sera guardado
     * @return True si pudo guardar, false de lo contrario
     */
    public boolean crear(Producto nuevoProducto) {
        return repository.crear(nuevoProducto);
    }

    /**
     * Servicio encargado de actualizar un producto de la base de datos
     *
     * @param producto Producto a modificar
     * @return True si puedo actualizar, false de lo contrario
     */
    public boolean actualizar(Producto producto) {
        Producto pr = this.buscar(producto.getId());
        if (pr != null) {
            return repository.actualizar(producto);
        }
        return false;
    }

    public boolean eliminar(int id) {
        return repository.eliminar(id);
    }
}
