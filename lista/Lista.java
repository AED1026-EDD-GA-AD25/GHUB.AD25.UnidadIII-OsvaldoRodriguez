package lista;
public class Lista<T>/* implements iterable */ {
    //atributos
    private Nodo<T> cabeza; //como sobre escribo el metodo toString
    private int tamanio;
    //constructores
    public Lista() {
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
    //confirma si la pila esta vacia 
    public boolean esVacia() {
        /*if(tamanio == 0){
            return true;
        }else{
            return false;
        }*/
        return cabeza == null;
    }
    //agrega un nuevo nodo al final de la lista
    public void agregar(T valor){
        Nodo<T> nuevo = new Nodo<>();
        //fija el valor a nuevo nodo
        nuevo.setValor(valor);
        if (esVacia()) {
            //cabeza apunta al nuevo
            cabeza = nuevo;
        }else{
            //se agrega al final de la cola 
            Nodo<T> aux = cabeza;
            while(aux.getSiguiente() != null){
                aux= aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            //la nueva cabeza de la pila pasa a ser nuevo
        }
        tamanio++;
        /*pendiente */
    }
    /*Inserta un nuevo nodo en la lista 
     * @param valor: valor a agregar 
     * @param pos: indica la posicion en donde se insertara el nodo 
     * @throws: PosicionIlegalException en caso de que la posicion no exista 
    */
    public void insertar(T valor, int pos) throws PosicionIlegalException{
        if(pos>=0 && pos<=tamanio){
            Nodo<T> nuevo = new Nodo<>();
            nuevo.setValor(valor);
            if(pos==0){ //insertar al principio
                nuevo.setSiguiente(cabeza);
                cabeza = nuevo;
            }else{
                if(pos == tamanio){ //al final
                    Nodo<T> aux = cabeza;
                    while(aux.getSiguiente() != null){
                    aux= aux.getSiguiente();
                    }
                    aux.setSiguiente(nuevo);
                }else{ //en medio
                    Nodo<T> aux = cabeza;
                    for(int i =0;i<=pos-2;i++){
                        aux = aux.getSiguiente();
                    }
                    Nodo<T> siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                }
            }
            tamanio++;
        }else{
            throw new PosicionIlegalException();
        }
    }
    //elimina un nodo de la lista 
    /*
    Elimina un nodo en determinda posicion
    @param pos: posicion a eliminar 
    @throws PosinionIlegalException 
     */ 
    public void remover(int pos) throws PosicionIlegalException{
        if(pos>=0 && pos<tamanio){//posicion correcta
            if(pos ==0){
                cabeza = cabeza.getSiguiente();
                tamanio--;
            }else{//elimina al final o en medio
                Nodo<T> aux = cabeza;
                for(int i=1;i<=pos-2;i++){
                    aux = aux.getSiguiente();
                }
                Nodo<T> prox = aux.getSiguiente();
                aux.setSiguiente(prox.getSiguiente());
                tamanio--;
            } 
        }else{//posicion incorrecta 
            throw new PosicionIlegalException();
        }
    }
    //devuelve el valor de una determinda posicion 
    //@param pos: posicion
    //@return: el valor de tipo T
    //@throws PosicionIlegalException
    public T getValor(int pos) throws PosicionIlegalException{
        if(pos>=0 && pos<tamanio){//es una posicion valida
            T valor; 
            if(pos ==0){
                valor = cabeza.getValor();
                return valor;
            }else{
                Nodo<T> aux = cabeza;
                for(int i =0;i<=pos-1;i++){
                    aux = aux.getSiguiente();
                }
                valor = aux.getValor();
                return valor;
            }
        }else{//posicion invalida
            throw new PosicionIlegalException();
        }
    }
    public void limpiar(){
        cabeza = null;
        tamanio =0;
    }
}