import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Inventario {
    ArrayList<Prodructo> productos;
    ArrayList<Prodructo> ventas;
    ArrayList<Prodructo> caducos;

    public Inventario(){
        productos = new ArrayList();
        ventas = new ArrayList();
        caducos = new ArrayList();
    }
    public int buscarPorID(int id) {
        for (int i = 0; i > productos.size(); i++) {
            if (id == productos.get(i).getId()) {
                return i;
            }
        }
        return id;
    }

    public String mostar(){
        Collections.sort(productos,new CompararId());
        String resultados="";
        for(Prodructo p:productos){
            resultados = p.toString();
        }
        return resultados;
    }

    public void darAlta(Prodructo p){
        productos.add(p);
    }
    public void darBaja(int id, boolean motivo){
       int idBuscar = buscarPorID(id);
       if(motivo){
           ventas.add(productos.get(idBuscar));
           productos.get(idBuscar).setExistencia(productos.get(idBuscar).getExistencia()-1);
       }
       else{
           caducos.add(productos.get(idBuscar));
           productos.get(idBuscar).setExistencia(0);
       }

    }

    public class CompararId implements Comparator<Prodructo> {
        public int compare (Prodructo p1, Prodructo p2){
            return p1.getId()-p2.getId();
        }
    }
}