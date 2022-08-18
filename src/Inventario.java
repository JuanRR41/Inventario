import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Inventario {
    ArrayList<Producto> productos;
    ArrayList<Producto> ventas;
    ArrayList<Producto> caducos;

    public Inventario(){
        productos = new ArrayList();
        ventas = new ArrayList();
        caducos = new ArrayList();
    }
    public int buscarPorID(int idB) {
        int aux=1;
        for (int i=0; i<productos.size();i++) {
            if (idB == productos.get(i).getId()) {
                aux = i;
                break;
            }
        }
        return aux;
    }

    public String mostrarPorId(){
        Collections.sort(productos,new CompararId());
        String resultados="";
        for(Producto p:productos){
            resultados+= p.toString()+"\n";
        }
        return resultados;
    }

    public String mostrarPorPrecio(){
        Collections.sort(productos,new CompararPrecio());
        String resultados="";
        for(Producto p:productos){
            resultados+= p.toString()+"\n";
        }
        return resultados;
    }


    public void darAlta(Producto p){
        productos.add(p);
    }
    public void darBaja(int id, boolean motivo){
       int idBuscar = buscarPorID(id);
       if(motivo){
           ventas.add(productos.get(idBuscar));
           productos.get(idBuscar).setCantidad(productos.get(idBuscar).getCantidad()-1);
           if(productos.get(idBuscar).getCantidad()<=0){
               productos.get(idBuscar).setExistencia(0);
           }
       }
       else{
           caducos.add(productos.get(idBuscar));
           productos.get(idBuscar).setCantidad(0);
           productos.get(idBuscar).setExistencia(0);
       }

    }

    public class CompararId implements Comparator<Producto> { public int compare (Producto p1, Producto p2){return p1.getId()-p2.getId(); }}
    public class CompararPrecio implements Comparator<Producto>{ public int compare (Producto p1, Producto p2){ return Float.compare(p1.getPrecio(),p2.getPrecio());}}

}