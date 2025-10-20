package curso;
import java.util.List;
public class Curso {
    //Atributos
    private String nombreCurso;
    private List<Estudiante> listaEstudiantes;
    //constructores
    public Curso() {
    }
    public Curso(String nombreCurso, List<Estudiante> listaEstudiantes) {
        this.nombreCurso = nombreCurso;
        this.listaEstudiantes = listaEstudiantes;
    }
    //getter y setter
    public String getNombreCurso() {
        return nombreCurso;
    }
    //métodos personalizados
    //Agrega un estudiante a la lista
    public void agregarEstudiante(Estudiante e){
        listaEstudiantes.add(e);

    }
    //elimna un estudiante de la lista, si lo encuentra regresa verdero si no falso
    public boolean eliminarEstudiante(String m){
        for(int i=0;i<listaEstudiantes.size();i++){
            if(listaEstudiantes.get(i).getMatricula().equals(m)){
                listaEstudiantes.remove(i);
                return true;
            }
        }
        return false;

    }
    //busca un estudiante por matricula si lo encuentra regresa el estudiante si no regresa null
    public Estudiante buscarEstudiante(String m){
        /*
        for(int i=0;i<listaEstudiantes.size();i++){
            if(listaEstudiantes.get(i).getMatricula().equals(m)){
               return listaEstudiantes.get(i);
            }
        }
        return null;
        */
        for(Estudiante e: listaEstudiantes){
            if(e.getMatricula().equals(m)){
                return e;
            }
        }
        return null;


    }
    //imprime por consola toda la lista de estudiantes
    public void listarEstudiantes(){
        for(Estudiante it:listaEstudiantes){
            System.out.println(it);
        }


    }

    
    

    
}