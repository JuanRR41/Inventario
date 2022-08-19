import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Inventario inv = new Inventario();
        Producto p;
        int op;
        Scanner aux= new Scanner(System.in);
        Scanner auxs= new Scanner(System.in);
        do {
            System.out.println("¿Qué quiere hacer hoy?\n");
            System.out.println("1]Dar de alta.\n2]Dar de baja o reportar caducidad.\n3]Mostrar.\n4]Buscar articulo por ID.\n5]Salir.\n6]LLENAR ARRAY RAPIDO.");
            op=aux.nextInt();
            switch (op) {
                case 1 -> {
                    int cantidad;
                    int id;
                    int eP;
                    float costo;
                    float precio;
                    String nombre;
                    String descripcion;
                    String marca;
                    System.out.println("Escriba el nombre:");
                    nombre = auxs.nextLine();
                    System.out.println("Escriba la marca:");
                    marca = auxs.nextLine();
                    System.out.println("Escriba la descripcion:");
                    descripcion = auxs.nextLine();
                    System.out.println("Escriba la cantidad de productos:");
                    cantidad = aux.nextInt();
                    System.out.println("Escriba el ID:");
                    id = aux.nextInt();
                    System.out.println("Escriba el costo:");
                    costo = aux.nextFloat();
                    System.out.println("Escriba el precio:");
                    precio = aux.nextFloat();
                    System.out.println("Eliga el tipo de producto que es:\n1]Producto Normal.\n2]Producto Alimento.\n3]Producto de limpieza.");
                    eP = aux.nextInt();
                    switch (eP) {
                        case 1 -> {
                            p = new Producto(nombre, descripcion, marca, cantidad, 1, id, costo, precio);
                            inv.darAlta(p);
                        }
                        case 2 -> {
                            int tA;
                            float calorias;
                            Date caducidad;
                            String tipo;
                            System.out.println("Escriba las calorias:");
                            calorias = aux.nextFloat();
                            System.out.println("Escriba la fecha de caducidad(Escribalo de la siguiente forma DD/MM/YYYY:");
                            String fechaComoTexto = auxs.nextLine();
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                            caducidad = sdf.parse(fechaComoTexto);
                            System.out.println("Escriba el tipo de producto que es:");
                            tipo = auxs.nextLine();
                            System.out.println("¿Es una bebida?:1]Si.\n2]No.");
                            tA = aux.nextInt();
                            if (tA == 1) {
                                float ml;
                                System.out.println("Escriba la cantidad de ml que tiene:");
                                ml = aux.nextFloat();
                                ProductoBebida pB = new ProductoBebida(nombre, descripcion, marca, cantidad, 1, id, costo, precio, calorias, caducidad, tipo, ml);
                                inv.darAlta(pB);
                            } else if (tA == 2) {
                                ProductoAlimento pA = new ProductoAlimento(nombre, descripcion, marca, cantidad, 1, id, costo, precio, calorias, caducidad, tipo);
                                inv.darAlta(pA);
                            }
                        }
                        case 3 -> {
                            String presentacion;
                            float cantidadDeKilos;
                            System.out.println("Escriba el tipo de presentacion:");
                            presentacion = auxs.nextLine();
                            System.out.println("Escriba la cantidad de kilos que tiene el producto:");
                            cantidadDeKilos = aux.nextFloat();
                            ProductoLimpieza pL = new ProductoLimpieza(nombre, descripcion, marca, cantidad, 1, id, costo, precio, presentacion, cantidadDeKilos);
                            inv.darAlta(pL);
                        }
                        default -> System.out.println("No ingreso una opción valida.");
                    }
                }
                case 2 -> {
                    int idDarBaja=0;
                    int motivoN;
                    boolean motivo;
                    System.out.println("Escriba el ID:");
                    idDarBaja = aux.nextInt();
                    System.out.println("¿Motivo?\n1]Venta.\n2]Caducidad.\n");
                    motivoN = aux.nextInt();
                    if (motivoN == 1) {
                        motivo = true;
                    } else motivo = false;
                    inv.darBaja(idDarBaja, motivo);
                }
                case 3 -> {
                    int oM;
                    System.out.println("¿Cómo desea buscar los productos?:\n1]Por Id.\n2]Por Precio.");
                    oM = aux.nextInt();
                    if (oM == 1)
                        System.out.println(inv.mostrarPorId());
                    else
                        System.out.println(inv.mostrarPorPrecio());
                }
                case 4 -> {
                    int bId;
                    int i;
                    System.out.println("Escriba el ID para buscar el articulo:");
                    bId=aux.nextInt();
                    i=inv.buscarPorID(bId);
                    inv.mostarArticuloPorId(i);
                }
                case 5 -> System.out.println("Gracias por usar el programa.");
                case 6 -> {
                    System.out.println("SE CREARA UN ARRAY CON DATOS YA LISTOS.");
                    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
                    Date cad = sd.parse("08/11/2022");
                    Producto ejP= new Producto("Servilletas","Servilletas para casa","Charmin",40,1,4564,30,60);
                    ProductoAlimento ejPA= new ProductoAlimento("Galletas","Galletas de chocolate","Gamesa",30,1,8943,8,16,220,cad,"Empaque");
                    ProductoBebida ejPB= new ProductoBebida("Coca-Cola","Bebida de cola","Coca-Cola",60,1,6666,10,14,290,cad,"Botella de plastico",400);
                    ProductoLimpieza ejL= new ProductoLimpieza("Jabon Zote","Jabon de ropa","Zote",40,1,2314,5,12,"Barra",1);
                    inv.darAlta(ejP);
                    inv.darAlta(ejPA);
                    inv.darAlta(ejPB);
                    inv.darAlta(ejL);
                }
                default -> System.out.println("No es una opción valida\n");
            }
        }while(op!=5);
    }
}
