package co.panaderia.infra;

import co.panaderia.domain.entitys.Empleado;
import co.panaderia.domain.services.EmpleadoService;

/**
 *
 * @author Santiago Acuña
 */
public class Secutiry {

    private final EmpleadoService service = new EmpleadoService();
    private Empleado user;

    /**
     * Constructor por defecto
     */
    public Secutiry() {
        this.user = new Empleado();
    }

    // GETTER AND SETTERS
    public Empleado getUser() {
        return user;
    }
    
    public void setUser(Empleado user) {
        this.user = user;
    }

    /**
     * Valida la existencia de un usuario en la base de datos
     * @param email Usuario a validar
     * @param password Clave a validar
     * @return True si es valido, false de lo contraio
     * @throws Exception 
     */
    public boolean validarUsuario(String email, String password) throws Exception {
        user = service.findByEmail(email);
        if (user != null) {
            if (user.getCorreo().equals(email) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Metodo encargado de validar que el campo email contega un @
     * @param email Cadena a validar
     * @return True si contiene, false de lo contrario
     */
    public boolean validarEmail(String email){
        return email.contains("@");
    }
}
