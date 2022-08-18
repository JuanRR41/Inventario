import java.util.ArrayList;

public class PruebaDeMetodos {
    public static void main(String[] args) {
        Producto prueba = new Producto("Servilletas","Servilletas para casa","Charmin",40,1,4564,30,60);
        Inventario invP = new Inventario();
        invP.darAlta(prueba);
        System.out.println(prueba.getId());
        System.out.println(invP.buscarPorID(prueba.getId()));
    }
}
