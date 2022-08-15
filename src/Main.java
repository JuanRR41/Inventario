import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inv = new Inventario();
        Prodructo p;
        int op=1;
        Scanner aux= new Scanner(System.in);
        Scanner auxs= new Scanner(System.in);
        do {
            System.out.println("¿Qué quiere hacer hoy?\n");
            System.out.println("1]Dar de alta.\n2]Dar de baja o reportar caducidad.\n3]Mostrar.\n4]Salir.");
            op=aux.nextInt();
            switch(op){
                case 1: int cantidad;
                        int id;
                        float costo;
                        float precio;
                        String nombre;
                        String descripcion;
                        String marca;

                    System.out.println("Escriba el nombre:");
                    nombre=auxs.nextLine();
                    System.out.println("Escriba la marca:");
                    marca=auxs.nextLine();
                    System.out.println("Escriba la descripcion:");
                    descripcion = auxs.nextLine();
                    System.out.println("Escriba la cantidad de productos:");
                        cantidad =aux.nextInt();;
                    System.out.println("Escriba el ID:");
                        id=aux.nextInt();
                    System.out.println("Escriba el costo:");
                        costo=aux.nextInt();
                    System.out.println("Escriba el precio:");
                        precio=aux.nextInt();
                        p = new Prodructo(nombre,descripcion,marca,cantidad,1,id,costo,precio);
                        inv.darAlta(p);
                        break;

                case 2: int idDarBaja;
                        int motivoN=0;
                        boolean motivo=false;
                    System.out.println("Escriba el ID:");
                        idDarBaja=aux.nextInt();
                    System.out.println("¿Motivo?\n1]Venta.\n2]Caducidad.\n");
                        motivoN=aux.nextInt();
                        if(motivoN==1){
                            motivo=true;
                        }
                        else motivo=false;
                        inv.darBaja(idDarBaja,motivo);
                        break;

                case 3:
                    System.out.println(inv.mostar());
                        break;

                case 4:
                    System.out.println("Gracias.");
                        break;

                default:
                    System.out.println("No es una opción valida\n");
                    op=4;

            }
        }while(op!=4);
    }
}
