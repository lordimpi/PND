/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.panaderia.domain.entitys;

/**
 *
 * @author Santiago Acuña
 */
public class Persona {

    private int Id;
    private String Documento;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Telefono;

    public Persona() {
    }

    public Persona(int Id, String Documento, String Nombre, String Apellido, String Correo, String Telefono) {
        this.Id = Id;
        this.Documento = Documento;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Telefono = Telefono;
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

    @Override
    public String toString() {
        return "Persona: [Id: " + this.Id + ", Documento: " + this.Documento
                + ", Nombre: " + this.Nombre + ", Apellido: " + this.Apellido
                + ", Correo: " + this.Correo + ", Teléfono: " + this.Telefono + "]";
    }
}
