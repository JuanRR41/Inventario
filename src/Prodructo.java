
public class Prodructo {
    String nombre;
    String descripcion;
    String marca;
    int cantidad;
    int existencia;
    int id;
    float costo;
    float precio;

    public Prodructo(String nombre, String descripcion, String marca, int cantidad, int existencia, int id, float costo, float precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
        this.cantidad = cantidad;
        this.existencia = existencia;
        this.id = id;
        this.costo = costo;
        this.precio = precio;
    }

    public String toString() {
        return  "Nombre:" + nombre + "\nDescripcion:" + descripcion + "\nMarca:" + marca +"\nCantidad:" + cantidad +"\nExistencia:" + existencia + "\nID:" + id + "\nCosto:" + costo + "\nPrecio:" + precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
