package miPrincipal;
import hashMap.HashMapCombinada;
import java.util.LinkedList;
import java.util.Collection;

public class AppHashMapCombinadoParesImpares {
     public static void inicio(){
        HashMapCombinada<Integer> hm = new HashMapCombinada<>();
        //almacenar algunos numeros
        hm.poner("Par", 2);
        hm.poner("Par", 4);
        hm.poner("Par", 8);
        hm.poner("Impar", 5);
        hm.poner("Impar", 1);
        hm.poner("Par", 6);
        hm.obtener("Par");
        try{
         System.out.println("\nLista de numeros pares:");
         LinkedList<Integer> pares = hm.obtener("Par");
         if(pares!=null){
            for(Integer i:pares){
             System.out.print(i+" ");
         }
         }
         System.out.println("\nLista de numeros impares:");
         LinkedList<Integer> impares = hm.obtener("Impar");
         if(impares!=null){
            for(Integer i:impares){
            System.out.print(i+" ");
         }
         }
         System.out.println("\nLista de Claves:");
         Collection<String> claves = hm.claves();
         for(String c:claves){
            System.out.println(c);

         }
        }catch(NullPointerException e){
        System.out.println(e.getMessage());
       }
     }
     public static void main(String[] args) {
        inicio();
     }

    
}