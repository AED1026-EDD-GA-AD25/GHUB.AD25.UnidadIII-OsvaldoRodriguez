package listaDeContactos;

public class Contacto {
    //Atributos
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;
    private String direccion;
    private String celular;
    //Metodos
    //constructor parametrico
    public Contacto(String nombres, String apellidos, String correo, String telefono, String direccion,
            String celular) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.celular = celular;
    }

    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return  nombres + " " + apellidos + " " + correo + " "
                + telefono + " " + direccion + " " + celular ;
    }
    

    
    
    
}
