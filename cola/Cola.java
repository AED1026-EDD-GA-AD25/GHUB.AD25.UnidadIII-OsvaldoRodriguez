package cola;
public class Cola<T> {
    //atributos
    private Nodo<T> cabeza;
    private int tamanio;
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
    public void apilar(T valor){
        Nodo<T> nuevo = new Nodo<>();
        //fija el valor a nuevo nodo
        nuevo.setValor(valor);
        if (esVacia()) {
            //cabeza apunta al nuevo
            cabeza = nuevo; 
        }else{
            //se enlaza el cambio siguiente de nuevo al nodo cabeza
            nuevo.setSiguiente(cabeza);
            //la nueva cabeza de la pila pasa a ser nuevo
            cabeza = nuevo;
        }
        tamanio++;
    }
    //elimina el ultimo nodo de la pila 
    public void retirar(){
        if(!esVacia()){
            cabeza = cabeza.getSiguiente();
            tamanio--;
        }
    }
    //regresa el valor del tope de la fila 
    public T cima(){
        if(!esVacia()){
            return cabeza.getValor();
        }
        return null;
    }
    public void push(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'push'");
    }
    public void pop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pop'");
    }
    public Integer search(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }
    public String size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }
    public String peek() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }
}
    