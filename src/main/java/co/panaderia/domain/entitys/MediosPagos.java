package co.panaderia.domain.entitys;

/**
 *
 * @author Santiago Acuña
 */
public class MediosPagos {

    private int Id;
    private String Nombre;

    //Constructores
    public MediosPagos() {
    }

    public MediosPagos(int Id, String Nombre) {
        this.Id = Id;
        this.Nombre = Nombre;
    }

    //Getters and Setter
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

    @Override
    public String toString() {
        return "Medios de pago: [Id: " + this.Id + ", Nombre: " + this.Nombre + "]";
    }

}
