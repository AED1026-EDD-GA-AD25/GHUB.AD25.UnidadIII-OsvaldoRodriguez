package miPrincipal;

public class AppDelimitadores {
    public static void inicio(){
        Delimitadores objDelimitadores = new Delimitadores();
        
        
        String expr = "(a+b)/2";
        boolean resultado;
        resultado = objDelimitadores.evaluacionDelimitadores(expr);
        if(resultado)
            System.out.println("La expresión "+expr+" ES CORRECTA");
        else    
            System.out.println("La expresion "+expr+" ES INCORRECTA");
        
        expr = "(a+b/2";
        resultado = objDelimitadores.evaluacionDelimitadores(expr);
        if(resultado)
            System.out.println("La expresión "+expr+" ES CORRECTA");
        else    
            System.out.println("La expresion "+expr+" ES INCORRECTA");
        
        expr ="while (m<(n[8]+o)) {"+
              " int p=7"+
              "/*comentarios*/ "+
              "}";
        resultado = objDelimitadores.evaluacionDelimitadores(expr);
        if(resultado)
            System.out.println("La expresión "+expr+" ES CORRECTA");
        else    
            System.out.println("La expresion "+expr+" ES INCORRECTA");

        
        expr ="while (m<(n[8]+o))"+
              " int p=7"+
              "/*comentarios*/"+
              "}";
        resultado = objDelimitadores.evaluacionDelimitadores(expr);
        if(resultado)
            System.out.println("La expresión "+expr+" ES CORRECTA");
        else    
            System.out.println("La expresion "+expr+" ES INCORRECTA");

        expr ="while (m<(n[8]+o)) {"+
              " int p=7"+
              "/*comentarios"+
              "}";
         resultado = objDelimitadores.evaluacionDelimitadores(expr);
        if(resultado)
            System.out.println("La expresión "+expr+" ES CORRECTA");
        else    
            System.out.println("La expresion "+expr+" ES INCORRECTA");
    }
    public static void main(String[] args) {
        inicio();
    }
    
}