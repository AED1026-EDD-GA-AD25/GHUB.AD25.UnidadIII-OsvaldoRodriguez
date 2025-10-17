package miPrincipal;
import lista.PosicionIlegalException;
import listaDeContactos.*;
public class AppListaDeContactos {
    public static void inicio(){
        //crear una lista de contactos
        System.out.println(" Lista de contactos ");
        ListaDeContactos lista = new ListaDeContactos();
        try{
            //Agregamos algun contacto
            lista.agregarContacto(null, null, null, null, null, "6677");


        }catch(PosicionIlegalException e){
            e.printStackTrace();
        }

    }
}
