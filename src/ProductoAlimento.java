import java.util.Date;
public class ProductoAlimento extends Producto {
    private float calorias;
    private Date caducidad;
    private String tipo;

    public ProductoAlimento(String nombre, String descripcion, String marca, int cantidad, int existencia, int id, float costo, float precio,float calorias,Date caducidad, String tipo) {
        super(nombre, descripcion, marca, cantidad, existencia, id, costo, precio);
        this.calorias=calorias;
        this.caducidad=caducidad;
        this.tipo=tipo;
    }

    public float getCalorias() {
        return calorias;
    }

    public void setCalorias(float calorias) {
        this.calorias = calorias;
    }

    public Date getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
