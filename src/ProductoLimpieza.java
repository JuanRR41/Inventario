public class ProductoLimpieza extends Prodructo{
    private String presentacion;
    private int cantidad;

    public ProductoLimpieza(String nombre, String descripcion, String marca, int cantidad, int existencia, int id, float costo, float precio) {
        super(nombre, descripcion, marca, cantidad, existencia, id, costo, precio);
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
