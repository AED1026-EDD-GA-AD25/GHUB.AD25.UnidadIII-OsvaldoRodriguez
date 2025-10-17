package listaDeContactos;
import lista.Lista;
import lista.PosicionIlegalException;
public class ListaDeContactos {
    //atributos
    private Lista<Contacto> contactos;
    //contructor
    public ListaDeContactos(){
        contactos = new Lista<>();
    }
    /*
     * Busca un contacto dado sus nombres y apellidos 
     * @return contacto si lo encuentra, null en caso contrario
     *  @throws PosicionIlegalException
     */
    public Contacto buscarContacto(String nombres, String apellidos) throws PosicionIlegalException{
        for(int i=0;i<contactos.getTamanio();i++){
            Contacto con = contactos.getValor(i);
            if(nombres.equals(con.getNombres()) && apellidos.equals(con.getApellidos())){
                return con;
            }
        }
        return null;
    }
    /*
     * Agregar un nuevo contacto a la lista, si todavia no hay un contacto con ese nombre y apellidos
     * si lo puede agregar regresa verdadero, si no falso
     * @return true o false
     * @throws PosicionIlegalException
     */
    public boolean agregarContacto(String nombres, String apellidos, String direccion, 
                                    String correo, String telefono, String celular) throws PosicionIlegalException{
        Contacto con = buscarContacto(nombres, apellidos);
        if(con == null){//se puede agregar a la lista
            Contacto nuevo = new Contacto(nombres, apellidos, correo, telefono, direccion, celular);
            contactos.agregar(nuevo);
            return true;
        }else{
            return false;
        }
    }
    /*
     * Elimina un contacto dado sus nombres y apellidos, el contacto existe en la lista lo eliminas 
     * @return true si se puede eliminar si no, false 
     * @throws PosicionIlegalException 
     */
    public boolean eliminarContacto(String nombres, String apellidos)throws PosicionIlegalException{
        Contacto con = buscarContacto(nombres, apellidos);
        if(con !=null){ //se puede eliminar
            for(int i =0;i<contactos.getTamanio();i++){
                Contacto contAux = contactos.getValor(i);
                if(nombres.equals(contAux.getNombres()) && apellidos.equals(contAux.getApellidos())){
                    contactos.remover(i);
                    return true;
                }
            }
            return false;
        }else{
            return false;
        }
    }
    /*
     * Modifica los datos de un contacto dado sus nombres y apellidos 
     * si el contacto existe se modifican sus datos 
     * @return true si se pudo modificar, false si no
     * @throws PosicionIlegalException
     */
    public boolean modificarContacto(String nombres, String apellidos, String direccion
         , String correo, String telefono, String celular)throws PosicionIlegalException{
            //verificar si el contacto existe 
            Contacto con = buscarContacto(nombres, apellidos);
            if(con==null){
                return false;
            }//modificar los datos
            con.setNombres(nombres);
            con.setApellidos(apellidos);
            con.setDireccion(direccion);
            con.setCorreo(correo);
            con.setTelefono(telefono);
            con.setCelular(celular);
            return true;
    }
    /*
     * retorna una lista de todos los contacto
     */
    public Lista<Contacto> mostrarTodosLosContactos(){
        return contactos;
    }
}
