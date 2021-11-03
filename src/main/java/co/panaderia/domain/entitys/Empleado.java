package co.panaderia.domain.entitys;

/**
 *Clase Empleado
 * @author Santiago Acuña
 */
public class Empleado {

    private int Id;
    private String Documento;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Telefono;
    private String Password;
    private String Cargo;
    private String Rol;

    public Empleado() {
    }

    public Empleado(int Id, String Documento, String Nombre, 
            String Apellido, String Correo, String Telefono, 
            String Password, String Cargo, String Rol) {
        this.Id = Id;
        this.Documento = Documento;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Password = Password;
        this.Cargo = Cargo;
        this.Rol = Rol;
    }



    //GETTERS AND SETTERS
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    @Override
    public String toString() {
        return "Persona: [Id: " + this.Id + ", Documento: " + this.Documento
                + ", Nombre: " + this.Nombre + ", Apellidos: " + this.Apellido
                + ", Correo: " + this.Correo + ", Teléfono: " + this.Telefono 
                + ", Password: "+this.Password+ ", Cargo: "+this.Cargo+", Rol: "+this.Rol+"]";
    }
}
