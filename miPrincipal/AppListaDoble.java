package miPrincipal;
import listaDoble.ListaDoble;
import listaDoble.PosicionIlegalException;   
public class AppListaDoble {
    public static void inicio(){
        try{
            ListaDoble<Integer> lista = new ListaDoble<>();
            //agregar algunos elementos a la lista 
            lista.agregar(5);
            lista.agregar(10);
            lista.agregar(7);
            //imprimir los elementos agregados
            System.out.println();
            System.out.println("=========================");
            System.out.println("Dato en la posicion 0: "+lista.getValor(0));
            System.out.println("Dato en la posicion 1: "+lista.getValor(1));
            System.out.println("Dato en la posicion 2: "+lista.getValor(2));
            System.out.println();
            //insertar el valor 13 en la posicion 1
            lista.insertar(13, 1);
            System.out.println("Dato en la posicion 0: "+lista.getValor(0));
            System.out.println("Dato en la posicion 1: "+lista.getValor(1));
            System.out.println("Dato en la posicion 2: "+lista.getValor(2));
            System.out.println("Dato en la posicion 3: "+lista.getValor(3));
            System.out.println("=========================");
            System.out.println();
            lista.insertar(16, 3);
            for(int i =0;i<lista.getTamanio();i++){
                System.out.print(lista.getValor(i)+" ");
            }
            System.out.println();
            lista.remover(2);
            for(int i =0;i<lista.getTamanio();i++){
                System.out.print(lista.getValor(i)+" ");
            }
            System.out.println();
            //insertar al final el valor 20
            /**/
             lista.remover(2);
            for(int i =0;i<lista.getTamanio();i++){
                System.out.print(lista.getValor(i)+" ");
            }
            System.out.println();
            lista.insertar(20, lista.getTamanio());
            for(int i =0;i<lista.getTamanio();i++){
                System.out.print(lista.getValor(i)+" ");
            }
            System.out.println();
            lista.remover(lista.getTamanio()-1);
            for(int i =0;i<lista.getTamanio();i++){
                System.out.print(lista.getValor(i)+" ");
            }
            System.out.println();

        }catch(PosicionIlegalException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        inicio();
    }
}
