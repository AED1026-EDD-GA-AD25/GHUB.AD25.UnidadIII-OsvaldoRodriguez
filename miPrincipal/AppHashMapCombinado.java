package miPrincipal;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import hashMap.Persona;
import hashMap.HashMapCombinada;
public class AppHashMapCombinado {
    public static void inicio(){
        //instanciamos unas personas
        Persona p1 = new Persona("Pablo",33,"Argentino");
        Persona p2 = new Persona("Juan",23,"Mexicano");
        Persona p3 = new Persona("Pedro", 18,"Español");
        Persona p4 = new Persona("Pablo", 15, "Español");
        Persona p5 = new Persona("Pablo", 50, "Colombiano");
        Persona p6 = new Persona("Pedro", 41, "Español");
        //instanciamos nuestro HashMapCombinado
        HashMapCombinada<Persona> hm = new HashMapCombinada<>();
        hm.poner(p1.getNombre(), p1);
        hm.poner(p2.getNombre(), p2);
        hm.poner(p3.getNombre(), p3);
        hm.poner(p4.getNombre(), p4);
        hm.poner(p5.getNombre(), p5);
        hm.poner(p6.getNombre(), p6);
        System.out.println();
        System.out.println("Lista de nombres: Pablo");
        LinkedList<Persona> lstPablos = hm.obtener("Pablo");
        for(Persona i:lstPablos){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Lista de nombres: Juan");
        LinkedList<Persona> lstJuan = hm.obtener("Juan");
        for(Persona i:lstJuan){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Lista de nombres: Pedro");
        LinkedList<Persona> lstPedro = hm.obtener("Pedro");
        for(Persona i:lstPedro){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Claves agregadas ");
        Collection<String> claves = hm.claves();
        for(String c:claves){
            System.out.println(c);
        }
        System.out.println();

    }
    public static void main(String[] args) {
        inicio();
    }
    
}
