package co.panaderia.domain.entitys;

/**
 * Clase Producto
 *
 * @author Santiago Acuña
 */
public class Producto {

    private int Id;
    private String Nombre;
    private String Descripcion;
    private double PrecioVenta;
    private String Imagen;

    //Constructores
    public Producto() {
        this.Imagen = "";
    }

    public Producto(int Id, String Nombre, String Descripcion, double PrecioVenta) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.PrecioVenta = PrecioVenta;
    }

    //Getter y Setter
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(double PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }

    @Override
    public String toString() {
        return "Producto: [Id: " + this.Id
                + ", Nombre: " + this.Nombre + ", Descripcion: "
                + this.Descripcion + ", Precio Venta: " + this.PrecioVenta + "]";
    }

}
