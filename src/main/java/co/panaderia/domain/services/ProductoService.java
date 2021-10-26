package co.panaderia.domain.services;

import co.panaderia.access.Factory;
import co.panaderia.access.IProductoRepository;
import co.panaderia.domain.entitys.Producto;
import java.util.List;

/**
 * 
 * @author Santiago Acuña
 */
public class ProductoService {
    private IProductoRepository repository;

    public ProductoService(){
        repository = Factory.getInstance().getProductoRepository();
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
}
