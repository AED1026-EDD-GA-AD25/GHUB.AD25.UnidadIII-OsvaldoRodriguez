package miPrincipal;
import pila.Pila;
public class Principal {
    public static void main(String[] args) {
        //crear una pila de enteros 
        Pila<Integer> pila = new Pila<>();
        //apilamos algunos elementos
        pila.apilar(2);
        pila.apilar(5);
        pila.apilar(7);
        System.out.println("El tope de la pila es: " + pila.cima());
        pila.retirar();
        System.out.println("El tope de la pila es: " + pila.cima());
        pila.retirar();
        System.out.println("El tope de la pila es: " + pila.cima());
        pila.retirar();
        System.out.println("El tope de la pila es: " + pila.cima());
        pila.apilar(10);
        pila.apilar(20);
        System.out.println("El tamaño de la pila es: " + pila.getTamanio());
    }
}