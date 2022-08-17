public class Pila <T>
{
//    La t significa que esta parametrizada con todo tipo de objeto que exista.
    T[] pila;
    int tope=-1;

    public Pila(int tamanio){
        tope=-1;
        pila=(T[])new Object[tamanio];

    }

    public boolean estaVacia(){
        return tope==-1;
    }
    public boolean estaLlena(){
        return tope==pila.length-1;
    }
    public void push(T dato){
        if(estaLlena()){
            System.out.println("Desbordamiento");
        }
        else {
            tope++;
            pila[tope]=dato;
        }


    }
    public T pop(){
        T dato=null;
        if(!estaVacia()){
        dato=pila[tope];
        tope--;}
        else{
            System.out.println("Subdesbordamiento");}
        return dato;
    }

    public T peek(){
        T dato=null;
        if(estaVacia()){
            System.out.println("subdesbordamiento");
        } else {
            dato= pila[tope];
        }
        return dato;
    }
    public String invertirCadena(String cadena){
        String cadenaInvertida="";
        for (int i=cadena.length()-1;i>=0;i--)
            cadenaInvertida = cadenaInvertida + cadena.charAt(i);
            return cadenaInvertida;
        }

}

