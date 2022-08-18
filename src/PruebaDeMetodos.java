public class PruebaDeMetodos {
    public static void main(String[] args) {
        Producto prueba = new Producto("Servilletas","Servilletas para casa","Charmin",40,1,4564,30,60);

        Inventario invP = new Inventario();
        int aux=0;
        for (int i=0; i< 2;i++) {
            if (4564 == prueba.getId()) {
                aux = 1;
                break;
            }
        }
        System.out.println(prueba.getId());
        System.out.println(aux);

    }
}
