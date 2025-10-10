package miPrincipal;

import pilas.Delimitadores;

public class AppDelimitadores {
    public static void inicio(){
        Delimitadores objDelimitadores = new Delimitadores();
        String expr = "(a+b)/2";
        boolean resultado;
        resultado = objDelimitadores.evaluacionDelimitadores(expr);
        if(resultado) System.out.println("La expresion "+expr+" es correcta");
        else System.out.println("La expresion "+expr+" es incorrecta");

        expr = "(a+b/2";
        resultado = objDelimitadores.evaluacionDelimitadores(expr);
        if(resultado) System.out.println("La expresion "+expr+" es correcta");
        else System.out.println("La expresion "+expr+" es incorrecta");

        expr = "while (n<(n[8] +o))  ( "+"int p=7 "+" /*comentarios*/"+")"; 
        resultado = objDelimitadores.evaluacionDelimitadores(expr);
        if(resultado) System.out.println("La expresion "+expr+" es correcta");
        else System.out.println("La expresion "+expr+" es incorrecta");


        expr = "while (n<(n[8] +o))  "+"int p=7 "+" /*comentarios*/"+")"; 
        resultado = objDelimitadores.evaluacionDelimitadores(expr);
        if(resultado) System.out.println("La expresion "+expr+" es correcta");
        else System.out.println("La expresion "+expr+" es incorrecta");

    }
    public static void main(String[] args) {
        inicio();
    }
    
}
