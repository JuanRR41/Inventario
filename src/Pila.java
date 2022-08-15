public class Pila <T>
{
//    La t significa que esta parametrizada con todo tipo de objeto que exista.
    T[] pila;
    int tope=-1;
    int dato;

    public Pila(){
        pila=(T[])new Prodructo[5];
    }

    public boolean estaLlena(){
        return tope==-1;

    }
    public boolean estaVacia(){
        return tope==pila.length-1;
    }
    public void push(int dato){
        if(estaLlena()){
            System.out.println("Desbordamiento");
        }
        else {
            tope++;
        }

    }
    public void pop(){
        if(estaVacia()){
            System.out.println("subdesbordamiento");
        }
    }
}
