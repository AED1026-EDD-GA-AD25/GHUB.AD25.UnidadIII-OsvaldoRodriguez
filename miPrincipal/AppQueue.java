package miPrincipal;
import java.util.PriorityQueue;
import java.util.Queue;
public class AppQueue {
    public static void inicio(){
        //crear una nueva cola pero con String 
        Queue <String> miCola = new PriorityQueue<>();
        //encolamos algunos elementos 
        miCola.add("Elemento 0");
        miCola.add("Elemento 1");
        miCola.add("Elemento 2");
        System.out.println("El tamaño de la cola "+miCola.size());
        System.out.println("El primer elemento de la cola "+miCola.peek());
        miCola.remove();
        System.out.println("El primer elemento de la cola "+miCola.peek());
        System.out.println(miCola);
        System.out.println("¿Se encuentra el elemento 2? "+miCola.contains("Elemento 2") );
        System.out.println("¿Se encuentre el elemento 0? "+miCola.contains("Elemento 0"));
        miCola.add("Elemento 0");
        for(String it: miCola){
            System.out.println(it);
        }
        System.out.println("Elementos que forma la cola "+miCola.toString());
    }
    public static void main(String[] args) {
        inicio();

    }
    
}
