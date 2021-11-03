package co.panaderia.domain.entitys;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Santiago Acuña
 */
public class Produccion {

    private int Id;
    private int Cantidad;
    private Date Fecha;
    private Producto producto;

    public Produccion() {
    }

    public Produccion(int Id, int Cantidad, Date Fecha, Producto producto) {
        this.Id = Id;
        this.Cantidad = Cantidad;
        this.Fecha = Fecha;
        this.producto = producto;
    }

    //GETTERS AND SETTERS
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
