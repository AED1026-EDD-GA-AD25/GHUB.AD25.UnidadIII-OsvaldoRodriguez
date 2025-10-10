package miPrincipal;
import java.util.EmptyStackException;
import java.util.Stack;

import pila.Pila;
public class AppStack {
    public static void main(String[] args) {
        inicio();
    }
    public static void inicio(){
        Pila<Integer> pila = new Pila<>();
        try{
            pila.push(2);
            pila.push(5);
            pila.push(7);
            System.out.println("El tope de la pila es: " + pila.peek());
            pila.pop();
            System.out.println("El tope de la pila es: " + pila.peek());
            pila.pop();
            System.out.println("El tope de la pila es: " + pila.peek());
            pila.pop();
            System.out.println("El tope de la pila es: " + pila.peek());
            pila.push(10);
            pila.push(20);
            pila.push(30);
            Integer pos = pila.search(10);
            System.out.println(" El elemento 10 está en la posición: " + pos);
            pos = pila.search(20);
            System.out.println(" El elemento 20 está en la posición: " + pos);
            pos = pila.search(30);
            System.out.println(" El elemento 30 está en la posición: " + pos);
            pos = pila.search(40);
            if(pos != -1) System.out.println("El elemento 40 se encuenta en la posicion "+pos );
            else System.out.println("El elemento 40 no se encuentra en la pila");
            System.out.println("El tamaño de la pila es: " + pila.size());
        }catch(EmptyStackException e){
            System.out.println("Pila vacía = "+e.getMessage());
            
            

        }
    }
    
}
