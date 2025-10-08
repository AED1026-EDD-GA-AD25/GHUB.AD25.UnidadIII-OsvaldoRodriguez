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

    private static void menu() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'menu'");
    }
}