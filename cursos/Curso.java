package cursos;
import java.util.List;
public class Curso {
    private String nombreCurso;
    private List<Estudiante> listaEstudiantes;
    public Curso(String nombrecurso, List<Estudiante> listaEstudiantes) {
        this.nombreCurso = nombrecurso;
        this.listaEstudiantes = listaEstudiantes;
    }
    public String getNombrecurso() {
        return nombreCurso;
    }
    public void setNombrecurso(String nombrecurso) {
        this.nombreCurso = nombrecurso;
    }
    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }
    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
    public void agregarEstudiante(Estudiante e){
        listaEstudiantes.add(e);
    }
    public boolean eliminarEstudiante(String m){
        for(int i=0;i<listaEstudiantes.size();i++){
            if(listaEstudiantes.get(i).getMatricula().equals(m)){
                listaEstudiantes.remove(i);
                return true;
            }
        }
        return false;
    }
    //busca un estudiante por matricula, si no encuentra regresa el estudiante, si no regresa null
    public Estudiante buscarEstudiante(String m){
        /*for(int i=0;i<listaEstudiantes.size();i++){
            if(listaEstudiantes.get(i).getMatricula().equals(m)){
               return listaEstudiantes.get(i);
            }
        }*/
        for(Estudiante e: listaEstudiantes){
            if(e.getMatricula().equals(m)){
                return e;
            }
        }
        return null;//que son los iteradores en java <------
    }
    //imprime por consola toda la lista de estudiantes 
    public void listarEstudiantes(){
        for(Estudiante e: listaEstudiantes){
            System.out.println(toString());
        }
    }
}
