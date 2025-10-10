package miPrincipal;
import pila.Pila;
import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opc;
        do{
            menu();
            opc = sc.nextInt();
            switch(opc){
                case 1:
                AppPila.main(args);
                break;
                case 2:
                AppStack.main(args);
                break;
                case 3:
                AppDelimitadores.main(args);
                break;
                case 4:
                AppCola.main(args);
                break;
                case 5:
                AppQueue.main(args);
                break;
                case 0:
                System.out.println("Chao ");
                break;
                default:
                System.out.println("   Opción no válida    ");
                break;
        }
      }while(opc != 0);
        sc.close();
  }

     private static void menu(){
        System.out.println("--- Menu principal ---");
        System.out.println("1.- Pilas");
        System.out.println("2.- Stack");
        System.out.println("3.- Delimitadores");
        System.out.println("4.- Cola");
        System.out.println("5.- Queue");
        System.out.println("0.- salir");
        System.out.println();
        System.out.println("Por favor seleccione la opcion deseada");
    }
}