
package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        profesores = new ArrayList<>();
        cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
            System.out.println("Profesor asignado correctamente.");
        } else {
            System.out.println("No se encontro el curso o el profesor.");
        }
    }

    public void listarProfesores() {
        for (Profesor p : profesores) {
            p.mostrarInfo();
            p.listarCursos();
        }
    }

    public void listarCursos() {
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);

        if (curso != null) {
            curso.setProfesor(null);
            cursos.remove(curso);
            System.out.println("Curso eliminado correctamente.");
        } else {
            System.out.println("No se encontro el curso.");
        }
    }

    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);

        if (profesor != null) {
            ArrayList<Curso> cursosDelProfesor = new ArrayList<>(profesor.getCursos());

            for (Curso c : cursosDelProfesor) {
                c.setProfesor(null);
            }

            profesores.remove(profesor);
            System.out.println("Profesor eliminado correctamente.");
        } else {
            System.out.println("No se encontro el profesor.");
        }
    }

    public void reporteCantidadCursosPorProfesor() {
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + " dicta " + p.getCursos().size() + " curso/s.");
        }
    }
}
