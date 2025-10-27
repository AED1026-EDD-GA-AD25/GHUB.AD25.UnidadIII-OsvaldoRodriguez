package hashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Collection;
public class HashMapCombinada<T> {
    //atributos
    private HashMap<String,LinkedList<T>> tabla;    
    private Vector<String> claves;
    //constructor 
    public HashMapCombinada(){
        tabla = new HashMap<>();
        claves = new Vector<>();
    } 
    //Metodos personalizados
    public void poner(String key, T elm){
        /*
         * Obtenemos un objeto lista atraves de get
         * si el elemento no existe la lista es null
         * y por lo tanto creamos una nueva lista , agregamos el elemento a la lista, 
         * agregamos el elemento a la tabla, agregamos el elemento al mapa y lo agregamos al vector
         * en caso de que no sea nulo, solamente agregamos el elemento a la lista  
         */
        LinkedList<T> lst = tabla.get(key);
        if (lst ==null) {
            lst = new LinkedList<>();
            lst.addLast(elm);
            tabla.put(key, lst);
            claves.add(key);
        }else{
            lst.addLast(elm);
        }  
    } 
    /*
     * Retorna la lista asociada al key
     * Si no existe la key, retorna null
     */
    public LinkedList<T> obtener(String key){
        return tabla.get(key);
    }
    public Collection<String> claves(){
        return claves;
    }
}
