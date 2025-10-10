package cola;
public class Cola<T>/* implements iterable */ {
    //atributos
    private Nodo<T> cabeza; //como sobre escribo el metodo toString
    private int tamanio;
    private int cola;

    //constructores
    public Cola() {
        cabeza = null;
        tamanio = 0;
    }
    //getter y setter
    public Nodo<T> getCabeza() {
        return cabeza;
    }
    public void setCabeza(Nodo<T> cabeza) {
        this.cabeza = cabeza;
    }
    public int getTamanio() {
        return tamanio;
    }
    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    public int getCola() {
        return cola;
    }
    public void setCola(int cola) {
        this.cola = cola;
    }
    //confirma si la pila esta vacia 
    public boolean esVacia() {
        /*if(tamanio == 0){
            return true;
        }else{
            return false;
        }*/
        return cabeza == null;
    }
    //agrega un nuevo nodo a la pila
    public void encolar(T valor){
        Nodo<T> nuevo = new Nodo<>();
        //fija el valor a nuevo nodo
        nuevo.setValor(valor);
        if (esVacia()) {
            //cabeza apunta al nuevo
            cabeza = nuevo; 
            cola= nuevo;
        }else{
            //se enlaza el cambio siguiente de nuevo al nodo cabeza
            nuevo.setSiguiente(cabeza);
            //la nueva cabeza de la pila pasa a ser nuevo
            cabeza = nuevo;
        }
        tamanio++;
    }
    //elimina el ultimo nodo de la pila 
    public void desencolar(){
        if(!esVacia()){
            //verificar si hay un solo elemento en la cola 
            if(cabeza==cola){
                cabeza = null;
                cola = null;
            }else{//hay mas elemento en la cola 
                //se elimina el primer elemento en la cola
                //desplazando la cabeza al siguiente 
                cabeza = cabeza.getSiguiente();  

            }
            tamanio--;
        }
    }
    //regresa el valor del tope de la fila 
    public T frente(){
        if(!esVacia()){
            return cabeza.getValor();
        }
        return null;
    }
    
    
}
    