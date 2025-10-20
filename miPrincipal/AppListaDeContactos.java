package miPrincipal;

import lista.PosicionIlegalException;
import listaDeContactos.Contacto;
import listaDeContactos.ListaDeContactos;
import lista.*;

public class AppListaDeContactos {
    public static void inicio(){
        //crear una lista de contactos
        ListaDeContactos lista = new ListaDeContactos();
        try{
            //Agregamos algun contactos
            String nombres,apellidos,direccion,correo,telefono,celular;
            nombres= "Fernando";
            apellidos="Castro";
            direccion ="Laqguna de Oslo 850, col. Libertad, Culiacan Sinaloa";
            correo="fernando@gmail.com";
            telefono="6677160732";
            celular="6672512331";
            lista.agregarContacto(nombres, apellidos, direccion, correo, telefono, celular);
            nombres= "Maria Andrea";
            apellidos="Vargas";
            direccion ="Obregon 150 Ote, col. Centro, Culiacan Sinaloa ";
            correo="mariaandreavo@gmail.com";
            telefono="6677160732";
            celular="6672511511";
            lista.agregarContacto(nombres, apellidos, direccion, correo, telefono, celular);
            nombres= "Carolina";
            apellidos="Sanchez";
            direccion ="Zapata 1250, col. Industrial Bravo, Culiacan Sinaloa ";
            correo="carolinas@gmail.com";
            telefono="6677455455";
            celular="6677600600";
            lista.agregarContacto(nombres, apellidos, direccion, correo, telefono, celular);
            nombres= "Ludovica";
            apellidos="Peluche";
            direccion ="Madrid 1658 Pte, col. La condesa delg. Tlalpan, Mexico DF ";
            correo="ludivicap@gmail.com";
            telefono="5577455455";
            celular="5577600600";
            lista.agregarContacto(nombres, apellidos, direccion, correo, telefono, celular);
            Lista<Contacto> listaAux= lista.mostrarTodosLosContactos();
            System.out.println("Mostrar todos los contactos:");
            /*for(int i =0;i<listaAux.getTamanio();i++)
                System.out.println(listaAux.getValor(i));
            */
            System.out.println(listaAux);
            nombres = "Ludovica";
            apellidos="Peluche";
            direccion ="Venecia 1658 Pte, col. La condesa delg. Tlalpan, Mexico DF ";
            correo="ludivicap@gmail.com";
            telefono="5577455455";
            celular="5577600600";
            lista.modificarContacto(nombres, apellidos, direccion, correo, telefono, celular);
            System.out.println("Mostrar todos los contactos despues de la modificacion: ");
            System.out.println(listaAux);
            nombres= "Maria Andrea";
            apellidos="Vargas";
            lista.eliminarContacto(nombres, apellidos);
            System.out.println("Mostrar todos los contactos despues de la eliminacion: ");
            System.out.println(listaAux);
            System.out.println("Mostrar nombres y apellidos de los contactos restantes: ");
            for(int i =0;i<listaAux.getTamanio();i++)
                System.out.println(listaAux.getValor(i).getNombres()+" "+listaAux.getValor(i).getApellidos());   
            nombres= "fernando";
            apellidos="Castro";
            direccion ="Laqguna de Oslo 850, col. Libertad, Mazatlan Sinaloa";
            correo="fernando@gmail.com";
            telefono="6677160732";
            celular="6672512331";
            lista.modificarContacto(nombres, apellidos, direccion, correo, telefono, celular);
            System.out.println();
            System.out.println("Mostrar todos los contactos modficados: ");
            System.out.println(listaAux);
        }catch(PosicionIlegalException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        inicio();
    }
    
}