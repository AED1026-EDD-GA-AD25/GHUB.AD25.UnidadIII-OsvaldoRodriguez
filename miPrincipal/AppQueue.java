package miPrincipal;
import java.util.LinkedList;
import java.util.Queue;
public class AppQueue {
    public static void inicio(){
        //crear una nueva cola pero con String 
        Queue <String> miCola = new LinkedList<>();
        //encolamos algunos elementos 
        miCola.add("Elemento 0");
        miCola.add("Elemento 1");
        miCola.add("Elemento 2");
        System.out.println("El tamaño de la cola "+miCola.size());
        System.out.println("El primer elemento de la cola "+miCola.peek());
        miCola.remove();
        System.out.println("El primer elemento de la cola "+miCola.peek());
        System.out.println(miCola);
        System.out.println("Se encuentra elemento 2? "+miCola.contains("Elemento 2") );

    }
    
}
