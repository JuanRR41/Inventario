public class ProductoLimpieza extends Producto {
    private String presentacion;
    private float cantidadDeKilos;

    public ProductoLimpieza(String nombre, String descripcion, String marca, int cantidad, int existencia, int id, float costo, float precio,String presentacion,float cantidadDeKilos) {
        super(nombre, descripcion, marca, cantidad, existencia, id, costo, precio);
        this.presentacion=presentacion;
        this.cantidadDeKilos=cantidadDeKilos;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public int getCantidadDeKilos() {
        return cantidad;
    }

    public void setCantidadDeKilos(int cantidad) {
        this.cantidad = cantidad;
    }
}
