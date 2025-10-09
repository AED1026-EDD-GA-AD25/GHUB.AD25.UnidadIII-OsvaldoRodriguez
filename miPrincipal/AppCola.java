package miPrincipal;
import cola.Cola;
public class AppCola {
    public static void inicio(){
        //Crear una nueva Cola de Enteros 
        Cola<Integer> miCola = new Cola <>();
        //encolar algunos elementos 
        miCola.encolar(5);
        miCola.encolar(10);
        miCola.encolar(20);
        miCola.encolar(30);
        miCola.encolar(40);
        System.out.println("Tamaño de la cola "+miCola.getTamanio());
        miCola.desencolar();
        System.out.println("El primer elemento de la cola "+miCola.frente());
        miCola.desencolar();
        System.out.println("El primer elemento de la cola "+miCola.frente());
        miCola.desencolar();
        System.out.println("El primer elemento de la cola "+miCola.frente());
        miCola.desencolar();
        System.out.println("El primer elemento de la cola "+miCola.frente());
        miCola.desencolar();
        System.out.println("El primer elemento de la cola "+miCola.frente());
        miCola.desencolar();
    }
    public static void main(String[] args) {
        inicio();
    } 
}
