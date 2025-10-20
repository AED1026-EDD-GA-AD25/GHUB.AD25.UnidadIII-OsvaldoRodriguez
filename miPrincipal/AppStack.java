
package miPrincipal;

import java.util.EmptyStackException;
import java.util.Stack;

public class AppStack {
    public static void inicio(){
         //crear una pila de Enteros
        Stack<Integer> pila = new Stack<>();
        //apilamos algunos elementos
        try{
            pila.push(2);
            pila.push(5);
            pila.push(7);
            System.out.println("El tope de la pila es "+pila.peek());
            pila.pop();
            System.out.println("El tope de la pila es "+pila.peek());
            pila.pop();
            System.out.println("El tope de la pila es "+pila.peek());
            pila.pop();
            //System.out.println("El tope de la pila es "+pila.peek());
            pila.push(10);
            pila.push(20);
            pila.push(30);
            Integer pos = pila.search(10);
            System.out.println("El elemento 10, se encuentra en la posicion "+pos);
            pos = pila.search(20);
            System.out.println("El elemento 20, se encuentra en la posicion "+pos);
            pos = pila.search(30);
            System.out.println("El elemento 30, se encuentra en la posicion "+pos);
            pos = pila.search(40);
            if (pos != -1)
                System.out.println("El elemento 40, se encuentra en la posicion "+pos);
            else
                System.out.println("el elemento 40 no fue encontrado");

            String mensaje = pos != -1 ? "El elemento 40, se encuentra en la posicion "+pos:"el elemento 40 no fue encontrado";

            System.out.println("El tamanio de la pila es "+pila.size());
        }catch(EmptyStackException e){
            System.out.println("Pila Vacia = "+e.getMessage());
        }
    }
    public static void main(String[] args) {
        inicio();
    }
    
}
