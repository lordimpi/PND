package co.panaderia.access;

import co.panaderia.infra.Utilities;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Fabrica que se encarga de instanciar ProductRepository o cualquier otro que
 * se cree en el futuro.
 *
 * @author Santiago Acuña
 */
public class Factory {

    private static Factory instance;

    private Factory() {
    }

    /**
     * Clase singleton
     *
     * @return
     */
    public static Factory getInstance() {

        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    /**
     * Método que crea una instancia concreta de la jerarquia IEmpleadoRepository
     *
     * @return una clase hija de la abstracción IEmpleadoRepository
     */
    public IEmpleadoRepository getPersonaRepository() {
        IEmpleadoRepository result = null;

        try {
            result = (IEmpleadoRepository) Class.forName(Utilities.loadProperty("EmpleadoRepositoryClass")).getConstructor().newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException
                | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(Factory.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (result == null) {
            result = new EmpleadoRepository();
        }
        return result;
    }

    /**
     * Método que crea una instancia concreta de la jerarquia
     * IProductoRepository
     *
     * @return una clase hija de la abstracción IProductoRepository
     */
    public IProductoRepository getProductoRepository() {
        IProductoRepository result = null;

        try {
            result = (IProductoRepository) Class.forName(Utilities.loadProperty("ProductoRepositoryClass")).getConstructor().newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException
                | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(Factory.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (result == null) {
            result = new ProductoRepository();
        }
        return result;
    }

}
