public class ProductoBebida extends Prodructo {
    private float ml;

    public ProductoBebida(String nombre, String descripcion, String marca, int cantidad, int existencia, int id, float costo, float precio) {
        super(nombre, descripcion, marca, cantidad, existencia, id, costo, precio);
    }

    public float getMl() {
        return ml;
    }

    public void setMl(float ml) {
        this.ml = ml;
    }
}
