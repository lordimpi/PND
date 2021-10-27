package co.panaderia.access;

import co.panaderia.domain.entitys.Producto;
import java.util.List;

/**
 * Interfaz de repositorios de productos
 *
 * @author Santiago Acuña
 */
public interface IProductoRepository {

    /**
     * Firma para buscar un producto
     *
     * @param id Identificador para realizar la busqueda
     * @return Devuelve un objeto de tipo producto
     */
    public Producto buscar(int id);

    /**
     * Firma para listar productos
     *
     * @return Devuelve una lista con productos
     */
    public List<Producto> listar();

    /**
     * Firma para crear un producto
     *
     * @param nuevoProducto Producto a crear
     * @return Devuelve true si pudo crear el producto, false de lo contrario
     */
    public boolean crear(Producto nuevoProducto);

    /**
     * Firma para eliminar un producto
     *
     * @param id Identificador para eliminar un producto
     * @return True si pudo eliminar el producto, false de lo contrario
     */
    public boolean eliminar(int id);

    /**
     * Firma para modificar un producto
     *
     * @param productoModificado producto a ser modificado
     * @return True si pudo modificar, false de lo contrario
     */
    public boolean actualizar(Producto productoModificado);
}
