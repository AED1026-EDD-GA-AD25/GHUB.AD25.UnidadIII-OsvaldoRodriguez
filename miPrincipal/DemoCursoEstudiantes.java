package miPrincipal;
import java.util.LinkedList;
import java.util.ArrayList;
import cursos.*;

public class DemoCursoEstudiantes {
    public static void main(String[] args) {
    //crear un curso con una lista de estudiantes utilizando un linkedList   
        Curso curso1 = new Curso(" Estructuras de datos ",new LinkedList<Estudiante>());      
    //crear un curso con una lista de estudiantes utilizando un ArrayList   
        Curso curso2 = new Curso(" Programacion orientada a objetos ",new ArrayList<Estudiante>());
        //agrego estudiantes al curso1
        curso1.agregarEstudiante(new Estudiante("Pito Perez","20250001", 0.0));
        curso1.agregarEstudiante(new Estudiante("Lulu Cebreros","20240001", 9.8));
        curso1.agregarEstudiante(new Estudiante("Tito Quiroz","20250002", 0.0));
        //agrego estudiantes al curso2
        curso2.agregarEstudiante(new Estudiante("Fernando Montero","25240002", 8.9));
        curso2.agregarEstudiante(new Estudiante("Rosa Lozano","25250003", 0.0));

        System.out.println("Integrantes del curso : "+curso1.getNombrecurso());
        curso1.listarEstudiantes();
        curso1.eliminarEstudiante("20250001");
        System.out.println("Integrantes del curso : "+curso1.getNombrecurso());
        curso1.listarEstudiantes();
        Estudiante est = curso1.buscarEstudiante("20240001");
        System.out.println("Estudiante encontrado: "+est.getNombre());

        System.out.println();
        System.out.println("Integrantes del curso : "+curso2.getNombrecurso());
        curso2.listarEstudiantes();


    

    }
    
}
