package co.panaderia.domain.services;

import co.panaderia.access.Factory;
import co.panaderia.access.IProduccionRepository;
import co.panaderia.domain.entitys.Produccion;
import java.util.List;

/**
 *
 * @author Santiago Acuña
 */
public class ProduccionService {

    IProduccionRepository repository;

    public ProduccionService() {
        repository = Factory.getInstance().getProduccionRepository();
    }

    /**
     * Servicio encargado de buscar una produccion en la base de datos
     *
     * @param id Identificador de la produccion
     * @return Instancia de la produccion
     */
    public Produccion buscar(int id) {
        return repository.buscar(id);
    }

    /**
     * Busca las produccion en la base de datos
     *
     * @return lista de producciones
     */
    public List<Produccion> list() {
        List<Produccion> productions = repository.list();
        return productions;
    }

    /**
     * Servicio encargado de crear un producto para almacenarlo en la base de
     * datos
     *
     * @param nuevaProduccion Produccion que sera guardada
     * @return True si pudo guardar, false de lo contrario
     */
    public boolean crear(Produccion nuevaProduccion) {
        return repository.create(nuevaProduccion);
    }

    /**
     * Servicio encargado de modifcar una produccion de la base de datos
     *
     * @param produccion Produccion a modificar
     * @return True si puedo actualizar, false de lo contrario
     */
    public boolean actualizar(Produccion produccion) {
        return repository.update(produccion);
    }

    public boolean eliminar(int id) {
        return repository.delete(id);
    }
}
