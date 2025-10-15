package miPrincipal;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
public class AppLinkedListArrayList {
    public static void inicio(){
        //Declarar una LinkedList y una ArrayList que contengan valores enteros 
        List<Integer> lista1 = new LinkedList<>();
        List<Integer> lista2 = new ArrayList<>();
        try{
        //Agrego algunos elmentos 
        lista1.add(12);
        lista1.add(15);
        lista1.add(20);

        //mostrar el tamaño y los elementos de la lista ligada 
        System.out.println();
        System.out.println("Tamaño de la lista 1 es: "+lista1.size());
        System.out.println("Dato en la posicion 0: "+lista1.get(0));
        System.out.println("Dato en la posicion 1: "+lista1.get(1));
        System.out.println("Dato en la posicion 2: "+lista1.get(2));
        //System.out.println("Dato en la posicion 3: "+lista1.get(3));
        lista1.set(0, 120);
        System.out.println();
        System.out.println("Tamaño de la lista 1 es: "+lista1.size());
        System.out.println("Dato en la posicion 0: "+lista1.get(0));
        System.out.println("Dato en la posicion 1: "+lista1.get(1));
        System.out.println("Dato en la posicion 2: "+lista1.get(2));
        System.out.println();
        //insertar el elemento 13 en la posicion 1
        lista1.add(1, 13);
        for(int i =0;i<lista1.size();i++){
            System.out.println("Dato en la posicion "+i+": "+lista1.get(i));
        }lista1.remove(2);
        for(Integer it: lista1){
            System.out.println(it+" ");
        }
        System.out.println();
        //usamos el ArrayList
        lista2.add(10);
        lista2.add(15);
        lista2.add(24);
        System.out.println("Recorriendo el ArrayList: ");
        for(Integer it: lista2){
            System.out.println("Elemento "+it);
        }
        System.out.println("¿Se encuentra el elemento 24? "+lista2.contains(24));
        System.out.println("Posicion en el que se encuentra el elemento 15: "+lista2.indexOf(15));
        System.out.println("Posicion en el que se encuentra el elemento 16: "+lista2.indexOf(16));

        }catch(Exception ex){
            System.out.println(" Ocurrio un error");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }




    }
    
}
