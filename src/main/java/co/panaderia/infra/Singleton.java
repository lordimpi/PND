package co.panaderia.infra;

import co.panaderia.presentation.GUICrearEmpleado;
import co.panaderia.presentation.GUIModificarEmpleado;
import javax.swing.JFrame;

/**
 *
 * @author Santiago Acuña
 */
public class Singleton {

    private static JFrame Us;
    
    private static JFrame Usm;
        
    private Singleton() {

    }

    /**
     * Obtiene la instancia del formulario para crear un usuario
     *
     * @return La instancia del usuario si ya esta creada, de lo contraio la crea
     */
    public static JFrame getInstCreateUser() {
        if (Us == null) {
            Us = new GUICrearEmpleado();
        }
        return Us;
    }

    /**
     * Obtiene la instancia del formulario para modificar un usuario
     *
     * @return La instancia del usuario si ya esta creada, de lo contraio la crea
     */
    public static JFrame getInstModifyUser() {
        if (Usm == null) {
            Usm = new GUIModificarEmpleado();
        }
        return Usm;
    }
}
