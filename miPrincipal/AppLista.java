package miPrincipal;

import lista.Lista;
import lista.PosicionIlegalException;

public class AppLista {
    public static void inicio(){
        try{
        //crear un objeto lista que almacene enteros
        Lista<Integer> lista = new lista.Lista<>();
        //agregamos algunos enteros
        lista.agregar(12);
        lista.agregar(13);
        lista.agregar(15);
        lista.agregar(16);
        lista.agregar(20);
        System.out.println("El tamaño de la lista es: "+lista.getTamanio());
        System.out.println("Dato en la posicion 0: "+lista.getValor(0));
        System.out.println("Dato en la posicion 1: "+lista.getValor(1));
        System.out.println("Dato en la posicion 2: "+lista.getValor(2));
        System.out.println("Dato en la posicion 3: "+lista.getValor(3));
        System.out.println("Dato en la posicion 4: "+lista.getValor(4));
        //System.out.println("Dato en la posicion 5: "+lista.getValor(5));
        lista.insertar(30,1);
        System.out.println("El tamaño de la lista: "+lista.getTamanio());
        for(int i=0;i<lista.getTamanio();i++){
            System.out.println("Dato en la posicion "+i+": "+lista.getValor(i));
        }
        lista.remover(2);
        System.out.println("El tamaño de la lista: "+lista.getTamanio());
        for(int i=0;i<lista.getTamanio();i++){
            System.out.println("Dato en la posicion "+i+": "+lista.getValor(i));
        }
        }catch(PosicionIlegalException ex){
            System.out.println(ex.getMessage());
        }

    }
    
    
}
