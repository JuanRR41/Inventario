import java.util.Date;

public class ProductoBebida extends ProductoAlimento {
    private float ml;

    public ProductoBebida(String nombre, String descripcion, String marca, int cantidad, int existencia, int id, float costo, float precio, float calorias, Date caducidad, String tipo,float ml) {
        super(nombre, descripcion, marca, cantidad, existencia, id, costo, precio, calorias, caducidad, tipo);
        this.ml=ml;
    }

    public float getMl() {
        return ml;
    }

    public void setMl(float ml) {
        this.ml = ml;
    }
}
