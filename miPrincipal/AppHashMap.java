package miPrincipal;
import java.util.HashMap;
import hashMap.Persona;
import java.util.Iterator;
import java.util.Map;
public class AppHashMap {
    public static void inicio(){
        //instanciar unas personas
        Persona p1 = new Persona("Pablo",33,"Argentino");
        Persona p2 = new Persona("Juan",23,"Mexicano");
        Persona p3 = new Persona("Pedro", 18,"Español");
        //crear e instanciar el objeto HashMap
        HashMap<String, Persona> hm = new HashMap<>();
        //agregar los elementos al Mapa
        hm.put(p1.getNombre(), p1);
        hm.put(p2.getNombre(), p2);
        hm.put(p3.getNombre(), p3);
        //Recuperar los elementos del mapa
        System.out.println(hm.get("Pablo"));
        System.out.println(hm.get("Juan"));
        System.out.println(hm.get("Pedro"));
        System.out.println(hm.get("Ronaldo"));

        System.out.println("Recorro la estructura utilizando iteradores");
        Iterator<Map.Entry<String,Persona>> ite = hm.entrySet().iterator();
        while(ite.hasNext()){
            Map.Entry<String, Persona> entrada = ite.next();
            System.out.println(entrada.getKey()+" = "+entrada.getValue());
        }
        System.out.println("Recorro la estructura utilizando for");
        for(Map.Entry<String,Persona> entrada:hm.entrySet()){
            System.out.println(entrada.getKey()+" = "+entrada.getValue());
        }
        System.out.println(hm);
    }
    public static void main(String[] args) {
        inicio();
    }
    
}
